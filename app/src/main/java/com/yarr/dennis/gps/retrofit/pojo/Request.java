package com.yarr.dennis.gps.retrofit.pojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("data")
    @Expose
    private Data data;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Request withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Request withData(Data data) {
        this.data = data;
        return this;
    }

}