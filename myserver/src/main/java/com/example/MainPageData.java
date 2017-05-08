package com.example;

import java.io.Serializable;

/**
 * Created by TF on 2017/4/28.
 */

public class MainPageData implements Serializable{
    MainRollPagerBean rollviewpager;
    SuperManBean superman;
    HotCoupBean hots;

    public MainPageData(MainRollPagerBean rollviewpager, SuperManBean superman, HotCoupBean hots) {
        this.rollviewpager = rollviewpager;
        this.superman = superman;
        this.hots = hots;
    }

    public MainRollPagerBean getRollviewpager() {
        return rollviewpager;
    }

    public void setRollviewpager(MainRollPagerBean rollviewpager) {
        this.rollviewpager = rollviewpager;
    }

    public SuperManBean getSuperman() {
        return superman;
    }

    public void setSuperman(SuperManBean superman) {
        this.superman = superman;
    }

    public HotCoupBean getHots() {
        return hots;
    }

    public void setHots(HotCoupBean hots) {
        this.hots = hots;
    }
}
