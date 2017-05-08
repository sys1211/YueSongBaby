package com.example.tf.yuesongbaby3.Cards;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tf.yuesongbaby3.Beans.BaseBean;
import com.example.tf.yuesongbaby3.Beans.CircleBean;
import com.example.tf.yuesongbaby3.R;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/19.
 */

public class CircleCard extends BaseCard{
    public CircleCard(@NonNull Context context) {
        super(context);
    }

    public CircleCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleCard(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected int getviewId() {
        return R.layout.quanzilayout2;
    }
    private RecyclerView rv;
    @Override
    protected void getcardclick() {
        rv= (RecyclerView) mview.findViewById(R.id.qz2_rv);
        LinearLayoutManager llm=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rv.setLayoutManager(llm);
        rv.setAdapter(new CircleCard.Recyclerviewadapter(rv,getContext()));
    }
    private ArrayList<View> list1;
    @Override
    public void bindbean(BaseBean basebean) {
        if (basebean==null){
            return;
        }
        list1=new ArrayList<>();
        CircleBean qb= (CircleBean) basebean;
        list1.addAll(qb.getList());
    }
    class Recyclerviewadapter extends RecyclerView.Adapter<Recyclerviewadapter.Myviewholder> {
        private RecyclerView rv;

        private Context context;
        private LayoutInflater inflater;

        public Recyclerviewadapter(RecyclerView rv, Context context) {
            this.rv = rv;
            this.context = context;
            inflater=LayoutInflater.from(context);
        }

        @Override
        public Myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v=inflater.inflate(R.layout.quanziitem2,null);
            return new CircleCard.Recyclerviewadapter.Myviewholder(v);
        }

        @Override
        public void onBindViewHolder(Myviewholder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class Myviewholder extends RecyclerView.ViewHolder{

            public Myviewholder(View itemView) {
                super(itemView);


            }
        }
    }
}
