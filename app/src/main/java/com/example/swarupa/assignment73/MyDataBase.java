package com.example.swarupa.assignment73;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by swarupa on 07-12-2016.
 */
public class MyDataBase extends SQLiteOpenHelper {

    public MyDataBase(Context context, String name, SQLiteDatabase.CursorFactory factory,

                      int version) {

        super(context, name, factory, version);

// TODO Auto-generated constructor stub

    }

    public void onCreate(SQLiteDatabase db) {

// TODO Auto-generated method stub

        db.execSQL("create table tableimage (name text,age int,image blob);");

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

// TODO Auto-generated method stub


    }
}
