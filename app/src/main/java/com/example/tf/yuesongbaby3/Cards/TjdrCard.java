package com.example.tf.yuesongbaby3.Cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.example.tf.yuesongbaby3.Beans.BaseBean;
import com.example.tf.yuesongbaby3.R;

/**
 * Created by TF on 2017/4/18.
 */

public class TjdrCard extends BaseCard{
    public TjdrCard(@NonNull Context context) {
        super(context);
    }

    public TjdrCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getviewId() {
        return R.layout.tjdrlayout;
    }

    @Override
    protected void getcardclick() {

    }

    @Override
    public void bindbean(BaseBean basebean) {
        if (basebean==null){
            return;
        }
    }
}
