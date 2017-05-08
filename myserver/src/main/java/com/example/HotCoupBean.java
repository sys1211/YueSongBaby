package com.example;

import java.io.Serializable;

/**
 * Created by TF on 2017/4/26.
 */

public class HotCoupBean implements Serializable{
    String StrPicUrl1;
    String StrPicUrl2;
    String StrPicUrl3;
    String StrPicUrl4;

    public String getStrPicUrl1() {
        return StrPicUrl1;
    }

    public void setStrPicUrl1(String strPicUrl1) {
        StrPicUrl1 = strPicUrl1;
    }

    public String getStrPicUrl2() {
        return StrPicUrl2;
    }

    public void setStrPicUrl2(String strPicUrl2) {
        StrPicUrl2 = strPicUrl2;
    }

    public String getStrPicUrl3() {
        return StrPicUrl3;
    }

    public void setStrPicUrl3(String strPicUrl3) {
        StrPicUrl3 = strPicUrl3;
    }

    public String getStrPicUrl4() {
        return StrPicUrl4;
    }

    public void setStrPicUrl4(String strPicUrl4) {
        StrPicUrl4 = strPicUrl4;
    }

    public HotCoupBean(String strPicUrl1, String strPicUrl2, String strPicUrl3, String strPicUrl4) {

        StrPicUrl1 = strPicUrl1;
        StrPicUrl2 = strPicUrl2;
        StrPicUrl3 = strPicUrl3;
        StrPicUrl4 = strPicUrl4;
    }
}
