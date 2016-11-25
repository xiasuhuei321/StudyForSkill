package com.xiasuhuei321.studyforskill;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import retrofit2.http.FormUrlEncoded;

/**
 * Created by Luo on 2016/11/24.
 * desc:
 */
public class TestOk {
    static OkHttpClient mOkHttpClient = new OkHttpClient();

    public static void login() {
        //创建一个请求
        Request request = new Request.Builder()
                .url(API.LOGIN)
                .build();

        Call call = mOkHttpClient.newCall(request);

        //请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println(Thread.currentThread().getName());
                String string = response.body().string();
                System.out.println(string);
            }
        });
    }

    /**
     * get请求
     */
    public static void getRequest() {
        Request request = new Request.Builder()
                .url("https://www.baidu.com")
                .build();

        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println(response.body().string());
            }
        });
    }

    /**
     * post请求
     */
    public static void postRequest(String name, String pwd) {
        //post表单请求
//        RequestBody body = RequestBody.create(
//                MediaType.parse("application/x-www-form-urlencoded"), "{name:18255697136,pass:123}");

        RequestBody body = new FormBody.Builder()
                .add("name", pwd)
                .add("pass", pwd)
                .build();

        Request request = new Request.Builder()
                .url(API.REGISTER)
                .post(body)
                .build();

        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println(response.body().string());
            }
        });
    }
}
