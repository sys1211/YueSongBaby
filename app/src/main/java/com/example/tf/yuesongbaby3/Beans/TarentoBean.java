package com.example.tf.yuesongbaby3.Beans;

import android.view.View;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/18.
 */

public class TarentoBean extends BaseBean{
   private ArrayList<View> list;
    private ArrayList<Integer> img1,img2,img3;
    private ArrayList<String> str1,str2;

    public ArrayList<View> getList() {
        return list;
    }

    public void setList(ArrayList<View> list) {
        this.list = list;
    }

    public ArrayList<Integer> getImg1() {
        return img1;
    }

    public void setImg1(ArrayList<Integer> img1) {
        this.img1 = img1;
    }

    public ArrayList<Integer> getImg2() {
        return img2;
    }

    public void setImg2(ArrayList<Integer> img2) {
        this.img2 = img2;
    }

    public ArrayList<Integer> getImg3() {
        return img3;
    }

    public void setImg3(ArrayList<Integer> img3) {
        this.img3 = img3;
    }

    public ArrayList<String> getStr1() {
        return str1;
    }

    public void setStr1(ArrayList<String> str1) {
        this.str1 = str1;
    }

    public ArrayList<String> getStr2() {
        return str2;
    }

    public void setStr2(ArrayList<String> str2) {
        this.str2 = str2;
    }
}
