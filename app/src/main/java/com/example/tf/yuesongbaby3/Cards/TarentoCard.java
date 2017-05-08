package com.example.tf.yuesongbaby3.Cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tf.yuesongbaby3.Beans.BaseBean;
import com.example.tf.yuesongbaby3.Beans.TarentoBean;
import com.example.tf.yuesongbaby3.R;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/18.
 */

public class TarentoCard extends BaseCard{
    private RecyclerView rv;
    public TarentoCard(@NonNull Context context) {
        super(context);
    }

    public TarentoCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getviewId() {
        return R.layout.darenlayout;
    }

    @Override
    protected void getcardclick() {
        rv= (RecyclerView) mview.findViewById(R.id.sy_rv);
        LinearLayoutManager llm=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(llm);
        rv.setAdapter(new Recyclerviewadapter(rv,getContext()));
    }

    private ArrayList<View> data;

    @Override
    public void bindbean(BaseBean basebean) {
        if (basebean==null){
            return;
        }
        data=new ArrayList<>();
        TarentoBean db= (TarentoBean) basebean;
        data.addAll(db.getList());


    }

    class Recyclerviewadapter extends RecyclerView.Adapter<Recyclerviewadapter.Myviewholder>{
        private RecyclerView rv;
        private Context context;
        private LayoutInflater inflater;

        public Recyclerviewadapter(RecyclerView rv, Context context) {
            this.rv = rv;
            this.context = context;

        }

        @Override
        public Myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v=data.get(viewType);
            return new Myviewholder(v);
        }

        @Override
        public void onBindViewHolder(final Myviewholder holder, int position) {


        }

        @Override
        public int getItemCount() {
            return 3;
        }

        class Myviewholder extends RecyclerView.ViewHolder{
            ImageView img1,img2,img3;
            TextView str1,str2;
            public Myviewholder(View itemView) {
                super(itemView);
                img1= (ImageView) itemView.findViewById(R.id.sydr_img1);

                img2= (ImageView) itemView.findViewById(R.id.sydr_img2);

                img3= (ImageView) itemView.findViewById(R.id.sydr_img3);

                str1= (TextView) itemView.findViewById(R.id.sydr_tv1);

                str2= (TextView) itemView.findViewById(R.id.sydr_tv2);


            }
        }
    }
}
