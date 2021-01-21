package com.example.day4act;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Dbhelper extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;
    public Dbhelper(Context context) {
        super(context, "details.db", null, 1);
        sqLiteDatabase=getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query= "create table student(Name text, Location text)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void savdetails(String s1, String s2){
        ContentValues contentValues=new ContentValues();
        contentValues.put("Name",s1);
        contentValues.put("Location",s2);
        sqLiteDatabase.insert("student",null,contentValues);
    }
}
