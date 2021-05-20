package com.mdaithub.demodatabase;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {

    public MyDBHelper(Activity activity)
    {
        super(activity, "MyDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table UserDetails(userID integer AUTOINCREMENT, name text, phone text, email text, password text)");
//        db.execSQL("create table UserDetails(userID integer AUTOINCREMENT, name text, phone text, email text, password text)");
//        db.execSQL("create table UserDetails(userID integer AUTOINCREMENT, name text, phone text, email text, password text)");
//        db.execSQL("create table UserDetails(userID integer AUTOINCREMENT, name text, phone text, email text, password text)");
//        db.execSQL("create table UserDetails(userID integer AUTOINCREMENT, name text, phone text, email text, password text)");
//        db.execSQL("create table UserDetails(userID integer AUTOINCREMENT, name text, phone text, email text, password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
