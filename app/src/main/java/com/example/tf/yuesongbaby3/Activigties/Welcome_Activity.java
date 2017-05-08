package com.example.tf.yuesongbaby3.Activigties;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.mysqlite.MainActivity;
import com.example.tf.yuesongbaby3.R;

public class Welcome_Activity extends Activity {
    private Handler hd=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Intent i=new Intent(Welcome_Activity.this,Home_Activity.class);
            startActivity(i);
            overridePendingTransition(R.anim.enteranim,R.anim.exitanim);
            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        hd.sendEmptyMessageDelayed(100,3000);
        MainActivity ma=new MainActivity(Welcome_Activity.this);
        ma.initview();
    }


}
