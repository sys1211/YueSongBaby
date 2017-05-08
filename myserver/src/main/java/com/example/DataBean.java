package com.example;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by TF on 2017/5/3.
 */

public class DataBean implements Serializable{
    MainPageData mpd;
    String MD5data;

    public DataBean(MainPageData mpd, String MD5data) {
        this.mpd = mpd;
        this.MD5data = MD5data;
    }

    public MainPageData getMpd() {
        return mpd;
    }

    public void setMpd(MainPageData mpd) {
        this.mpd = mpd;
    }

    public String getMD5data() {
        return MD5data;
    }

    public void setMD5data(String MD5data) {
        this.MD5data = MD5data;
    }
}
