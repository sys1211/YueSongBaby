package com.example.tf.yuesongbaby3.Fragments;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.tf.yuesongbaby3.R;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/19.
 */

public class Community_Fragment extends Fragment{
    private View v;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.communitylayout,null);
        initview();
        return v;
    }

    private TextView tv;
    private RadioGroup rg;
    private RadioButton[] arrrb;
    private ArrayList<Fragment> list;
    private FragmentManager fm;
    private void initview() {
        rg= (RadioGroup) v.findViewById(R.id.shequ_rg);
        fm=getChildFragmentManager();
        list=new ArrayList<>();
        Hot_Fragment hf=new Hot_Fragment();
        Circle_Fragment cf=new Circle_Fragment();
        list.add(hf);
        list.add(cf);
        tv= (TextView) v.findViewById(R.id.sq_ft);
        arrrb=new RadioButton[rg.getChildCount()];
        for (int i = 0; i < rg.getChildCount(); i++) {
            arrrb[i]= (RadioButton) rg.getChildAt(i);
        }
        arrrb[0].setChecked(true);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.remen_rb:
                        rbshow(checkedId);
                        tv.setVisibility(View.VISIBLE);
                        break;
                    case R.id.quanzi_rb:
                        rbshow(checkedId);

                        tv.setVisibility(View.GONE);
                        break;
                    default:
                        break;
                }
            }
        });
        fm.beginTransaction().add(R.id.shequ_fl,list.get(0)).commit();
    }
    private int num=0;
    private void rbshow(int checkedId) {
        FragmentTransaction ft=fm.beginTransaction();
        for (int i = 0; i < rg.getChildCount(); i++) {
            if (arrrb[i].getId() == checkedId) {
                if (list.get(i).isAdded()) {
                    ft.show(list.get(i)).hide(list.get(num)).commit();
                } else {
                    ft.add(R.id.shequ_fl, list.get(i)).hide(list.get(num)).commit();
                }
                num = i;
            }
        }
    }
}
