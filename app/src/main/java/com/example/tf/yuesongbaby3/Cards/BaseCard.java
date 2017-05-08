package com.example.tf.yuesongbaby3.Cards;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.example.tf.yuesongbaby3.Beans.BaseBean;

/**
 * Created by TF on 2017/4/19.
 */

public abstract class BaseCard extends FrameLayout{
    public View mview;
    public Context mcontext;
    public BaseCard(@NonNull Context context) {
        super(context);
        init(context);
    }

    public BaseCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public BaseCard(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }
    private void init(Context context) {
        mview=inflate(context,getviewId(),this);
        mcontext=context;
        getcardclick();
    }


    protected abstract int getviewId();
    protected abstract void getcardclick();
    public abstract void bindbean(BaseBean basebean);
}
