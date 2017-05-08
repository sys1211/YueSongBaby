package com.example.tf.yuesongbaby3.Fragments;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tf.yuesongbaby3.Beans.TarentoBean;
import com.example.tf.yuesongbaby3.Beans.FLRWBean;
import com.example.tf.yuesongbaby3.Beans.RmztBean;
import com.example.tf.yuesongbaby3.Beans.HomePagervpbean;
import com.example.tf.yuesongbaby3.Beans.RecommendtalentBean;
import com.example.tf.yuesongbaby3.Beans.SpecialBean;
import com.example.tf.yuesongbaby3.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by TF on 2017/4/19.
 */

public class DataListFragment extends BaseFragment {
    @Override
    protected int getFragmnetView() {
        return R.layout.recyclerlayout;
    }


    @Override
    protected int getRecyclerview() {
        return R.id.base_rv;
    }

    private ArrayList<String> rollviewpagelist;
    private ArrayList<View> recyclerviewlist;
    private String path="content://com.example.sqlitetest//data";
    @Override
    public void initview() throws JSONException {
        init();
//        RequestQueue mQueue = Volley.newRequestQueue(getContext());
//        MyStringRequest stringRequest = new MyStringRequest("http://169.254.62.218:8989/SuperManBean",
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//
//
//
//                        try {
        ContentResolver cr=getActivity().getContentResolver();
        Cursor c=cr.query(Uri.parse(path),null,null,null,null);
        String response = null;
        if (c!=null) {
            while (c.moveToNext()) {
                response = c.getString(c.getColumnIndex("data"));
                String md5 = c.getString(c.getColumnIndex("type"));
                Log.e("sys", md5);

            }
        }
                            JSONObject jo = new JSONObject(response);
                            JSONObject jo1=jo.getJSONObject("rollviewpager");
                            String rollviewpageimg1=jo1.getString("StrPicUrl1");
                            String rollviewpageimg2=jo1.getString("StrPicUrl2");
                            String rollviewpageimg3=jo1.getString("StrPicUrl3");
                            String rollviewpageimg4=jo1.getString("StrPicUrl4");
                            rollviewpagelist=new ArrayList<>();
                            rollviewpagelist.add(rollviewpageimg1);
                            rollviewpagelist.add(rollviewpageimg2);
                            rollviewpagelist.add(rollviewpageimg3);
                            rollviewpagelist.add(rollviewpageimg4);
                            HomePagervpbean sb = new HomePagervpbean();
                            sb.setList(rollviewpagelist);
                            list.add(sb);


                            FLRWBean fb = new FLRWBean();
                            list.add(fb);


                            RecommendtalentBean tb = new RecommendtalentBean();
                            list.add(tb);


                            JSONObject jo2=jo.getJSONObject("superman");
                            String bgimg=jo2.getString("StrBackPicUrl");
                            String headimg=jo2.getString("StrHeadPicUrl");
                            String attention=jo2.getString("jiaguanzhu");
                            String name=jo2.getString("StrName");
                            String StrIntroduce=jo2.getString("StrIntroduce");
                            View view2=LayoutInflater.from(getContext()).inflate(R.layout.darenitemlayout,null);
                            ImageView img1= (ImageView) view2.findViewById(R.id.sydr_img1);
                            Glide.with(getContext())
                                    .load(bgimg)
                                    .into(img1);
                            ImageView img2= (ImageView) view2.findViewById(R.id.sydr_img2);
                            Glide.with(getContext())
                                    .load(headimg)
                                    .into(img2);
                            ImageView img3= (ImageView) view2.findViewById(R.id.sydr_img3);
                            Glide.with(getContext())
                                    .load(attention)
                                    .into(img3);
                            TextView tv1= (TextView) view2.findViewById(R.id.sydr_tv1);
                            tv1.setText(name);
                            TextView tv2= (TextView) view2.findViewById(R.id.sydr_tv2);
                            tv2.setText(StrIntroduce);
                            recyclerviewlist=new ArrayList<>();
                            recyclerviewlist.add(view2);
                            recyclerviewlist.add(view2);
                            recyclerviewlist.add(view2);
                            TarentoBean db = new TarentoBean();
                            db.setList(recyclerviewlist);
                            list.add(db);


                            RmztBean rb = new RmztBean();
                            list.add(rb);

                            JSONObject jo3=jo.getJSONObject("hots");
                            String StrPicUrl1=jo3.getString("StrPicUrl1");
                            String StrPicUrl2=jo3.getString("StrPicUrl2");
                            String StrPicUrl3=jo3.getString("StrPicUrl3");
                            String StrPicUrl4=jo3.getString("StrPicUrl4");
                            View view3=LayoutInflater.from(getContext()).inflate(R.layout.zhuantilayout,null);
                            ImageView zt_img1= (ImageView) view3.findViewById(R.id.zt_img1);
                            Glide.with(getContext())
                                    .load(StrPicUrl1)
                                    .into(zt_img1);
                            ImageView zt_img2= (ImageView) view3.findViewById(R.id.zt_img2);
                            Glide.with(getContext())
                                    .load(StrPicUrl2)
                                    .into(zt_img2);
                            ImageView zt_img3= (ImageView) view3.findViewById(R.id.zt_img3);
                            Glide.with(getContext())
                                    .load(StrPicUrl3)
                                    .into(zt_img3);
                            ImageView zt_img4= (ImageView) view3.findViewById(R.id.zt_img4);
                            Glide.with(getContext())
                                    .load(StrPicUrl4)
                                    .into(zt_img4);
                            SpecialBean zb = new SpecialBean();
                            list.add(zb);

                            adapter.notifyDataSetChanged();
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
//
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                    }
//                });
//        mQueue.add(stringRequest);






    }


}