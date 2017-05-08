package com.example.mysqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by TF on 2017/5/2.
 */

public class MySqliteOpenHelper extends SQLiteOpenHelper{

    public MySqliteOpenHelper(Context context) {
        super(context, "data", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists data(_id INTEGER primary key autoincrement,type text not null,data text)");
    }

    @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
