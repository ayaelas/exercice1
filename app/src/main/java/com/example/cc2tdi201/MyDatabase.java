package com.example.cc2tdi201;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabase extends SQLiteOpenHelper {
    public static String DB_NAME="« societes.db";
    public static String TABLE_NAME="Societe";
    public static String COL1="ID";
    public static String COL2="NBEMPLOYE";
    public static String COL3="NOM";
    public static String COL4="ACTIVITE";
    public MyDatabase(Context c){
        super(c,DB_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table " + TABLE_NAME + "("+COL1+" integer primary key autoincrement,"+COL2+" INTEGER,"+COL3+" TEXT,"+COL4+"TEXT) ";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql= "DROP TABLE " + TABLE_NAME;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase); 
    }

}
