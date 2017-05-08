package com.example.tf.yuesongbaby3.Cards;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.tf.yuesongbaby3.Beans.BaseBean;
import com.example.tf.yuesongbaby3.Beans.HomePagervpbean;
import com.example.tf.yuesongbaby3.R;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/18.
 */

public class HomePageviewpagerCard extends BaseCard{
    private RollPagerView rvp;
    public HomePageviewpagerCard(@NonNull Context context) {
        super(context);
    }

    public HomePageviewpagerCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getviewId() {
        return R.layout.syrollpager;
    }

    @Override
    protected void getcardclick() {
        rvp= (RollPagerView) mview.findViewById(R.id.sy_rvp);
        rvp.setPlayDelay(3000);
        rvp.setAnimationDurtion(500);
        rvp.setHintView(new ColorPointHintView(getContext(),getResources().getColor(R.color.colorAccent), Color.WHITE));
        rvp.setAdapter(new RollPagerAdapter());
    }
    private ArrayList<String> list;
    @Override
    public void bindbean(BaseBean basebean) {
        if (basebean==null){
            return;
        }
        list=new ArrayList<>();
        HomePagervpbean sb= (HomePagervpbean) basebean;
        list.addAll(sb.getList());
    }

    //适配器
    private class RollPagerAdapter extends StaticPagerAdapter {

        @Override
        public View getView(ViewGroup container, int position) {

            ImageView view=new ImageView(container.getContext());
            //设置高度和宽度
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            //设置拉伸方式
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);

            //设置图片资源
            Glide.with(getContext())
                    .load(list.get(position))
                    .into(view);

            return view;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }

}
