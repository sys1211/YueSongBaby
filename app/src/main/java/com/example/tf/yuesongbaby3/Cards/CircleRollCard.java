package com.example.tf.yuesongbaby3.Cards;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tf.yuesongbaby3.Beans.BaseBean;
import com.example.tf.yuesongbaby3.Beans.CircleRollBean;
import com.example.tf.yuesongbaby3.R;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/19.
 */

public class CircleRollCard extends BaseCard{
    public CircleRollCard(@NonNull Context context) {
        super(context);
    }

    public CircleRollCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleRollCard(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    private RollPagerView rvp;
    @Override
    protected int getviewId() {
        return R.layout.circlerolllayout;
    }

    @Override
    protected void getcardclick() {
        rvp= (RollPagerView) mview.findViewById(R.id.circle_rpv);
        rvp.setPlayDelay(3000);
        rvp.setAnimationDurtion(500);
        rvp.setHintView(new ColorPointHintView(getContext(),getResources().getColor(R.color.colorAccent), Color.WHITE));
        rvp.setAdapter(new CircleRollCard.RollPagerAdapter());
    }
    private ArrayList<Integer> list;
    @Override
    public void bindbean(BaseBean basebean) {
        if (basebean==null){
            return;
        }
        list=new ArrayList<>();
        CircleRollBean crb= (CircleRollBean) basebean;
        list.addAll(crb.getList());
    }
    private class RollPagerAdapter extends StaticPagerAdapter {

        @Override
        public View getView(ViewGroup container, int position) {

            ImageView view=new ImageView(container.getContext());
            //设置图片资源
            view.setImageResource(list.get(position));
            //设置高度和宽度
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            //设置拉伸方式
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);

            return view;
        }

        @Override
        public int getCount() {
            return 1;
        }
    }
}
