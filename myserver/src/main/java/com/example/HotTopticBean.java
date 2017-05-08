package com.example;

import java.io.Serializable;

/**
 * Created by TF on 2017/4/26.
 */

public class HotTopticBean implements Serializable{
    String StrTitle;
    String StrBackPicUrl;
    int intAssess;
    int intLike;
    String StrIntroduce;

    public HotTopticBean(String strTitle, String strBackPicUrl, int intAssess, int intLike, String strIntroduce) {
        StrTitle = strTitle;
        StrBackPicUrl = strBackPicUrl;
        this.intAssess = intAssess;
        this.intLike = intLike;
        StrIntroduce = strIntroduce;
    }
}
