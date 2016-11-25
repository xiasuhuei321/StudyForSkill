package com.xiasuhuei321.studyforskill;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Luo on 2016/11/24.
 * desc:
 */
public interface ApiStore {
    /**
     * 注册
     *
     * @param name 用户名（为手机号）
     * @param pass 密码
     * @return
     */
    @FormUrlEncoded
    @POST("api.php?action=raegister")
    Observable<BaseResponse> register(@Field("name") String name,
                                      @Field("pass") String pass);

    @FormUrlEncoded
    @POST("api.php?action=laogin")
    Observable<BaseResponse> login(@Field("name") String name,
                                   @Field("pass") String pass);
}
