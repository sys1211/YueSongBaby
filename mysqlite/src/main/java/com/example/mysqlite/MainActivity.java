package com.example.mysqlite;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity {

    private ContentResolver cr;
    private ContentValues cv;
    private String path="content://com.example.sqlitetest//data";
    private Context context;

    public MainActivity(Context context) {
        this.context = context;
    }

    public void initview() {
        RequestQueue rq= Volley.newRequestQueue(context);
        MyStringRequest sr=new MyStringRequest("http://169.254.62.218:8989/SuperManBean", new Response.Listener<String>() {


            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jo=new JSONObject(response);
                    String mpd=jo.getString("mpd");
                    String md5=jo.getString("MD5data");
                    cr=context.getContentResolver();
                    cv=new ContentValues();
                    cv.put("type",md5);
                    cv.put("data",mpd);
                    cr.insert(Uri.parse(path),cv);
                    Log.e("sys","获取成功");
                    Log.e("sys",md5);
                    Log.e("sys",mpd);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("sys","获取失败");
            }
        });
        rq.add(sr);
    }


}
