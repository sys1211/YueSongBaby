package com.example.tf.yuesongbaby3.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tf.yuesongbaby3.R;

/**
 * Created by TF on 2017/4/19.
 */

public class Mine_Fragment extends Fragment{
    private View v;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.minelayout,null);
        return v;
    }
}
