package com.example.tf.yuesongbaby3.Cards;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tf.yuesongbaby3.Beans.BaseBean;
import com.example.tf.yuesongbaby3.Beans.HotBean;
import com.example.tf.yuesongbaby3.R;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/19.
 */

public class HotCard extends BaseCard{
    public HotCard(@NonNull Context context) {
        super(context);
    }

    public HotCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HotCard(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected int getviewId() {
        return R.layout.hotitem;
    }

    @Override
    protected void getcardclick() {

    }
    private ArrayList<View> list1;
    @Override
    public void bindbean(BaseBean basebean) {
        if (basebean==null){
            return;
        }
        list1=new ArrayList<>();
        HotBean hb= (HotBean) basebean;
        list1.addAll(hb.getList());

    }
    class Recyclerviewadapter extends RecyclerView.Adapter<Recyclerviewadapter.Myviewholder> {
        private RecyclerView rv;

        private Context context;
        private LayoutInflater inflater;

        public Recyclerviewadapter(RecyclerView rv, Context context) {
            this.rv = rv;
            this.context = context;
            inflater = LayoutInflater.from(context);
        }

        @Override
        public Myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = inflater.inflate(R.layout.hotitem, null);
            return new HotCard.Recyclerviewadapter.Myviewholder(v);
        }

        @Override
        public void onBindViewHolder(Myviewholder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 3;
        }

        class Myviewholder extends RecyclerView.ViewHolder {

            public Myviewholder(View itemView) {
                super(itemView);


            }
        }
    }
}
