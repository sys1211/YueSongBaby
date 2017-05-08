package com.example;

import java.io.Serializable;

/**
 * Created by TF on 2017/4/26.
 */

public class SuperManBean implements Serializable{
    String StrBackPicUrl;
    String StrHeadPicUrl;
    String StrName;
    String jiaguanzhu;
    String StrIntroduce;

    public SuperManBean(String strBackPicUrl, String strHeadPicUrl, String strName, String jiaguanzhu, String strIntroduce) {
        StrBackPicUrl = strBackPicUrl;
        StrHeadPicUrl = strHeadPicUrl;
        StrName = strName;
        this.jiaguanzhu = jiaguanzhu;
        StrIntroduce = strIntroduce;
    }

    public String getStrBackPicUrl() {
        return StrBackPicUrl;
    }

    public void setStrBackPicUrl(String strBackPicUrl) {
        StrBackPicUrl = strBackPicUrl;
    }

    public String getStrHeadPicUrl() {
        return StrHeadPicUrl;
    }

    public void setStrHeadPicUrl(String strHeadPicUrl) {
        StrHeadPicUrl = strHeadPicUrl;
    }

    public String getStrName() {
        return StrName;
    }

    public void setStrName(String strName) {
        StrName = strName;
    }

    public String getJiaguanzhu() {
        return jiaguanzhu;
    }

    public void setJiaguanzhu(String jiaguanzhu) {
        this.jiaguanzhu = jiaguanzhu;
    }

    public String getStrIntroduce() {
        return StrIntroduce;
    }

    public void setStrIntroduce(String strIntroduce) {
        StrIntroduce = strIntroduce;
    }
}
