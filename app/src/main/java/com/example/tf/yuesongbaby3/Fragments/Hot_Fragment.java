package com.example.tf.yuesongbaby3.Fragments;

import android.view.LayoutInflater;
import android.view.View;

import com.example.tf.yuesongbaby3.Beans.HotBean;
import com.example.tf.yuesongbaby3.R;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/19.
 */

public class Hot_Fragment extends BaseFragment{
    @Override
    protected int getFragmnetView() {
        return R.layout.hotlayout;
    }

    @Override
    protected int getRecyclerview() {
        return R.id.hot_rv;
    }
    private ArrayList<View> list1;
    @Override
    public void initview() {
        init();
        list1=new ArrayList<>();
        View v1= LayoutInflater.from(getContext()).inflate(R.layout.hotitem,null);
        list1.add(v1);
        HotBean hb=new HotBean();

        hb.setList(list1);

        for (int i = 0; i < 10; i++) {
            list.add(hb);
        }

    }
}
