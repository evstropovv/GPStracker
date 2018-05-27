package com.yarr.dennis.gps.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("singer")
    @Expose
    private String singer;
    @SerializedName("song")
    @Expose
    private String song;
    @SerializedName("info_1")
    @Expose
    private String info1;
    @SerializedName("info_2")
    @Expose
    private String info2;

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Data withSinger(String singer) {
        this.singer = singer;
        return this;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Data withSong(String song) {
        this.song = song;
        return this;
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public Data withInfo1(String info1) {
        this.info1 = info1;
        return this;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public Data withInfo2(String info2) {
        this.info2 = info2;
        return this;
    }
}