package com.example.AllFeatureAndroid.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME="TRY";
    public static final int DB_VERSION=1;
    public DatabaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table TRY(" +
                "_id integer primary key AUTOINCREMENT," +
                "NAME text," +
                "DESCRIPTION TEXT," +
                "IMAGE_ID INTEGER" +
                ");");
        insertDrink(db,"coffee","just coffee",1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insertDrink(SQLiteDatabase db,String name,String desc,int imageId){
        ContentValues contentValues= new ContentValues();
        contentValues.put("name",name);
        contentValues.put("DESCRIPTION",desc);
        contentValues.put("IMAGE_ID",imageId);
        db.insert("TRY",null,contentValues);
    }
}
