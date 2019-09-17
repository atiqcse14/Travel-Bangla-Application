package com.example.shovan.travelbanglaapp;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by SHOVAN on 1/28/2017.
 */

public class MySQLite extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mydatabase.db";
    private static final String TABLE_NAME = "mytable";
    private static final String COLUMN_1 = "DISTRICT";
    private static final String COLUMN_2 = "INFORMATION";


    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table mytable (DISTRICT text primary key not null," +
            "INFORMATION text not null) " ;

    public MySQLite(Context context) {
        super(context, DATABASE_NAME, null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //db.open();
        db.execSQL(TABLE_CREATE);
        //this.db = db;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        //this.onCreate(db);
    }

    public void insertInformation(Information in)
    {
        db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUMN_1,in.getDistrictName());
        values.put(COLUMN_2,in.getDetails());

        db.insert(TABLE_NAME,null,values);
        db.close();
    }
    public String findDetails(String uname) {
        db = this.getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;

        Cursor cursor = db.rawQuery(query,null);
        String dname, dDetails;
        dDetails = "Not found";
        if(cursor.moveToFirst()) {
            do {
                dname =cursor.getString(cursor.getColumnIndex("DISTRICT"));
                if (dname.equals(uname)) {
                    dDetails = cursor.getString(cursor.getColumnIndex("INFORMATION"));
                    break;
                }
            } while (cursor.moveToNext());
        }
        db.close();
        return  dDetails;
    }

}
