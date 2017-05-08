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
import com.example.tf.yuesongbaby3.Beans.GZQBean;
import com.example.tf.yuesongbaby3.R;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/19.
 */

public class GZQCard extends BaseCard{
    public GZQCard(@NonNull Context context) {
        super(context);
    }

    public GZQCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GZQCard(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected int getviewId() {
        return R.layout.gezhongquanlayout;
    }
    private RecyclerView rv;
    @Override
    protected void getcardclick() {
        rv= (RecyclerView) mview.findViewById(R.id.gzq_rv);
        LinearLayoutManager llm=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(llm);
        rv.setAdapter(new GZQCard.Recyclerviewadapter(rv,getContext()));
    }
    private ArrayList<View> list1;
    private ArrayList<String> str;
    @Override
    public void bindbean(BaseBean basebean) {
        if (basebean==null){
            return;
        }
        list1=new ArrayList<>();
        GZQBean gb= (GZQBean) basebean;
        list1.addAll(gb.getList());
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
            View v=inflater.inflate(R.layout.gezhongquanitem,null);
            return new GZQCard.Recyclerviewadapter.Myviewholder(v);
        }

        @Override
        public void onBindViewHolder(Myviewholder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 3;
        }

        class Myviewholder extends RecyclerView.ViewHolder{

            public Myviewholder(View itemView) {
                super(itemView);


            }
        }
    }
}
