package com.example;

import java.io.Serializable;

/**
 * Created by TF on 2017/4/26.
 */

public class CircleBean implements Serializable{
    String StrListPicUrl;
    String StrListTitle;
    String StrListName;
    int intListPosts;
    String StrListIntroduce;
    String StrRollPicUrl;
    String StrRollTitle;
    String StrRollJumpUrl;
    String StrHTPicUrl;
    String StrHTTitle;
    String StrHTJumpUrl;

    public CircleBean(String strListPicUrl, String strListTitle, String strListName, int intListPosts, String strListIntroduce, String strRollPicUrl, String strRollTitle, String strRollJumpUrl, String strHTPicUrl, String strHTTitle, String strHTJumpUrl) {
        StrListPicUrl = strListPicUrl;
        StrListTitle = strListTitle;
        StrListName = strListName;
        this.intListPosts = intListPosts;
        StrListIntroduce = strListIntroduce;
        StrRollPicUrl = strRollPicUrl;
        StrRollTitle = strRollTitle;
        StrRollJumpUrl = strRollJumpUrl;
        StrHTPicUrl = strHTPicUrl;
        StrHTTitle = strHTTitle;
        StrHTJumpUrl = strHTJumpUrl;
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

    public String getStrListName() {
        return StrListName;
    }

    public void setStrListName(String strListName) {
        StrListName = strListName;
    }

    public int getIntListPosts() {
        return intListPosts;
    }

    public void setIntListPosts(int intListPosts) {
        this.intListPosts = intListPosts;
    }

    public String getStrListIntroduce() {
        return StrListIntroduce;
    }

    public void setStrListIntroduce(String strListIntroduce) {
        StrListIntroduce = strListIntroduce;
    }

    public String getStrRollPicUrl() {
        return StrRollPicUrl;
    }

    public void setStrRollPicUrl(String strRollPicUrl) {
        StrRollPicUrl = strRollPicUrl;
    }

    public String getStrRollTitle() {
        return StrRollTitle;
    }

    public void setStrRollTitle(String strRollTitle) {
        StrRollTitle = strRollTitle;
    }

    public String getStrRollJumpUrl() {
        return StrRollJumpUrl;
    }

    public void setStrRollJumpUrl(String strRollJumpUrl) {
        StrRollJumpUrl = strRollJumpUrl;
    }

    public String getStrHTPicUrl() {
        return StrHTPicUrl;
    }

    public void setStrHTPicUrl(String strHTPicUrl) {
        StrHTPicUrl = strHTPicUrl;
    }

    public String getStrHTTitle() {
        return StrHTTitle;
    }

    public void setStrHTTitle(String strHTTitle) {
        StrHTTitle = strHTTitle;
    }

    public String getStrHTJumpUrl() {
        return StrHTJumpUrl;
    }

    public void setStrHTJumpUrl(String strHTJumpUrl) {
        StrHTJumpUrl = strHTJumpUrl;
    }
}
