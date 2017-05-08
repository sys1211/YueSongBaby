package com.example;

import java.io.Serializable;

/**
 * Created by TF on 2017/4/26.
 */

public class MicroBean implements Serializable{
    String StrRollPicUrl;
    String StrRollJumpUrl;
    String StrListPicUrl;
    String StrListTitle;
    String StrDate;
    int intPrice;
    int intAssess;

    public MicroBean(String strRollPicUrl, String strRollJumpUrl, String strListPicUrl, String strListTitle, String strDate, int intPrice, int intAssess) {
        StrRollPicUrl = strRollPicUrl;
        StrRollJumpUrl = strRollJumpUrl;
        StrListPicUrl = strListPicUrl;
        StrListTitle = strListTitle;
        StrDate = strDate;
        this.intPrice = intPrice;
        this.intAssess = intAssess;
    }

    public String getStrRollPicUrl() {
        return StrRollPicUrl;
    }

    public void setStrRollPicUrl(String strRollPicUrl) {
        StrRollPicUrl = strRollPicUrl;
    }

    public String getStrRollJumpUrl() {
        return StrRollJumpUrl;
    }

    public void setStrRollJumpUrl(String strRollJumpUrl) {
        StrRollJumpUrl = strRollJumpUrl;
    }

    public String getStrListPicUrl() {
        return StrListPicUrl;
    }

    public void setStrListPicUrl(String strListPicUrl) {
        StrListPicUrl = strListPicUrl;
    }

    public String getStrListTitle() {
        return StrListTitle;
    }

    public void setStrListTitle(String strListTitle) {
        StrListTitle = strListTitle;
    }

    public String getStrDate() {
        return StrDate;
    }

    public void setStrDate(String strDate) {
        StrDate = strDate;
    }

    public int getIntPrice() {
        return intPrice;
    }

    public void setIntPrice(int intPrice) {
        this.intPrice = intPrice;
    }

    public int getIntAssess() {
        return intAssess;
    }

    public void setIntAssess(int intAssess) {
        this.intAssess = intAssess;
    }
}
