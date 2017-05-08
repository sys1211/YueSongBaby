package com.example.tf.yuesongbaby3.Fragments;

import android.view.LayoutInflater;
import android.view.View;

import com.example.tf.yuesongbaby3.Beans.CircleRollBean;
import com.example.tf.yuesongbaby3.Beans.GZQBean;
import com.example.tf.yuesongbaby3.Beans.CircleBean;
import com.example.tf.yuesongbaby3.R;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/19.
 */

public class Circle_Fragment extends BaseFragment{
    @Override
    protected int getFragmnetView() {
        return R.layout.circlelayout;
    }

    @Override
    protected int getRecyclerview() {
        return R.id.circle_rv;
    }
    private ArrayList<Integer> list1;
    private ArrayList<View> list2;
    private ArrayList<View> list3;
    @Override
    public void initview() {
        init();

        CircleRollBean crb=new CircleRollBean();
        list1=new ArrayList<>();
        list1.add(R.drawable.welcome_page_one);
        crb.setList(list1);
        list.add(crb);

        list2=new ArrayList<>();
        View v1= LayoutInflater.from(getContext()).inflate(R.layout.gezhongquanitem,null);
        list2.add(v1);
        list2.add(v1);
        list2.add(v1);
        GZQBean gb=new GZQBean();
        gb.setList(list2);
        list.add(gb);

        list3=new ArrayList<>();
        View v3=LayoutInflater.from(getContext()).inflate(R.layout.quanziitem2,null);
        for (int i = 0; i < 10; i++) {
            list3.add(v3);
        }
        CircleBean qb=new CircleBean();
        qb.setList(list3);
        list.add(qb);

        adapter.notifyDataSetChanged();
    }
}
