package com.yarr.dennis.gps.retrofit;

import com.yarr.dennis.gps.retrofit.pojo.Request;
import com.yarr.dennis.gps.retrofit.pojo.Response;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiRetrofit {

    @Headers("Content-Type: application/json")
    @POST("rr1/song_info.php")
    Call<Response> sendGps(@Body Request gpSobject);

}
