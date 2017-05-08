package com.example.tf.yuesongbaby3.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.tf.yuesongbaby3.Beans.BaseBean;
import com.example.tf.yuesongbaby3.Beans.CircleRollBean;
import com.example.tf.yuesongbaby3.Beans.TarentoBean;
import com.example.tf.yuesongbaby3.Beans.FLRWBean;
import com.example.tf.yuesongbaby3.Beans.GZQBean;
import com.example.tf.yuesongbaby3.Beans.HotBean;
import com.example.tf.yuesongbaby3.Beans.CircleBean;
import com.example.tf.yuesongbaby3.Beans.RmztBean;
import com.example.tf.yuesongbaby3.Beans.HomePagervpbean;
import com.example.tf.yuesongbaby3.Beans.RecommendtalentBean;
import com.example.tf.yuesongbaby3.Beans.SpecialBean;
import com.example.tf.yuesongbaby3.Cards.BaseCard;
import com.example.tf.yuesongbaby3.Cards.CircleRollCard;
import com.example.tf.yuesongbaby3.Cards.TarentoCard;
import com.example.tf.yuesongbaby3.Cards.FLRWCard;
import com.example.tf.yuesongbaby3.Cards.GZQCard;
import com.example.tf.yuesongbaby3.Cards.HotCard;
import com.example.tf.yuesongbaby3.Cards.CircleCard;
import com.example.tf.yuesongbaby3.Cards.RmztCard;
import com.example.tf.yuesongbaby3.Cards.HomePageviewpagerCard;
import com.example.tf.yuesongbaby3.Cards.TjdrCard;
import com.example.tf.yuesongbaby3.Cards.SpecialCard;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/19.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.BaseViewHolder>{
    private Context context;
    private ArrayList<BaseBean> list;

    public MainAdapter(Context context, ArrayList<BaseBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=null;
        if (viewType==HomePagervpbean.class.getCanonicalName().hashCode()){
            v=new HomePageviewpagerCard(context);
        }else if (viewType==FLRWBean.class.getCanonicalName().hashCode()){
            v=new FLRWCard(context);
        }else if (viewType==RecommendtalentBean.class.getCanonicalName().hashCode()){
            v=new TjdrCard(context);
        }else if (viewType==TarentoBean.class.getCanonicalName().hashCode()){
            v=new TarentoCard(context);
        }else if (viewType==RmztBean.class.getCanonicalName().hashCode()){
            v=new RmztCard(context);
        }else if (viewType==SpecialBean.class.getCanonicalName().hashCode()){
            v=new SpecialCard(context);
        }else if (viewType==HotBean.class.getCanonicalName().hashCode()){
            v=new HotCard(context);
        }else if (viewType==CircleRollBean.class.getCanonicalName().hashCode()){
            v=new CircleRollCard(context);
        }else if (viewType==GZQBean.class.getCanonicalName().hashCode()){
            v=new GZQCard(context);
        }else if (viewType==CircleBean.class.getCanonicalName().hashCode()){
            v=new CircleCard(context);
        }


        return new BaseViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        ((BaseCard)holder.itemView).bindbean(list.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        int viewtype=-1;
        if (list.get(position)!=null){
            if(list.get(position)instanceof HomePagervpbean){
                viewtype=HomePagervpbean.class.getCanonicalName().hashCode();
            }else if (list.get(position)instanceof FLRWBean){
                viewtype=FLRWBean.class.getCanonicalName().hashCode();
            }else if (list.get(position)instanceof RecommendtalentBean){
                viewtype=RecommendtalentBean.class.getCanonicalName().hashCode();
            }else if (list.get(position)instanceof TarentoBean){
                viewtype=TarentoBean.class.getCanonicalName().hashCode();
            }else if (list.get(position)instanceof RmztBean){
                viewtype=RmztBean.class.getCanonicalName().hashCode();
            }else if (list.get(position)instanceof SpecialBean){
                viewtype=SpecialBean.class.getCanonicalName().hashCode();
            }else if (list.get(position)instanceof HotBean){
                viewtype=HotBean.class.getCanonicalName().hashCode();
            }else if (list.get(position)instanceof CircleRollBean){
                viewtype=CircleRollBean.class.getCanonicalName().hashCode();
            }else if (list.get(position)instanceof GZQBean){
                viewtype=GZQBean.class.getCanonicalName().hashCode();
            }else if (list.get(position)instanceof CircleBean){
                viewtype=CircleBean.class.getCanonicalName().hashCode();
            }

        }
        return viewtype;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class BaseViewHolder extends RecyclerView.ViewHolder{

        public BaseViewHolder(View itemView) {
            super(itemView);
        }
    }
}
