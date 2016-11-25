package com.xiasuhuei321.studyforskill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    public static final String BASEURL = "http://121.199.78.235/JRD_API/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Observable.just(1)
                .subscribeOn(Schedulers.newThread())
                .subscribe(System.out::println);
        new Thread(() -> {
            System.out.println("hell world");
        }).start();

        findViewById(R.id.test).setOnClickListener(this::hell);

        Observable.just("asdf").subscribe(System.out::println);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        ApiStore stroe = retrofit.create(ApiStore.class);

//        stroe.register("18255697137", "123")
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(System.out::println, Throwable::printStackTrace);
//
//        stroe.login("18255697137", "123")
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(System.out::println, Throwable::printStackTrace);

        TestOk.login();
        TestOk.getRequest();
        TestOk.postRequest("18255697137","123");
    }


    public void hell(View v) {
        System.out.println("hello");
    }
}


