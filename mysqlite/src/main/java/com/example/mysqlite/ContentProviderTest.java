package com.example.mysqlite;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.telecom.Connection;

/**
 * Created by TF on 2017/5/2.
 */

public class ContentProviderTest extends ContentProvider{
    String path="content://com.example.sqlitetest//data";
    private SQLiteDatabase db;
    @Override
    public boolean onCreate() {
        MySqliteOpenHelper msoh=new MySqliteOpenHelper(getContext());
        db=msoh.getReadableDatabase();
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        Cursor cursor=db.query("data",projection,selection,selectionArgs,null,null,sortOrder);
        return cursor;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        long l=db.insert("data",null,values);
        Uri u= ContentUris.withAppendedId(Uri.parse(path),l);
        return u;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        int delete=db.delete("data",selection,selectionArgs);
        return delete;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        int update=db.update("data",values,selection,selectionArgs);
        return update;
    }
}
