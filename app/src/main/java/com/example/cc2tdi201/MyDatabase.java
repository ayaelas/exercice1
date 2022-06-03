package com.example.cc2tdi201;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class MyDatabase extends SQLiteOpenHelper {
    public static String dbname="« societes.db";
    public static String table="Societe";
    public static String COL1="ID";
    public static String COL2="NBEMPLOYE";
    public static String COL3="NOM";
    public static String COL4="ACTIVITE";

    public MyDatabase(Context c){
        super(c,dbname,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table " + table + "("+COL1+" integer primary key autoincrement,"+COL2+" INTEGER,"+COL3+" TEXT,"+COL4+"TEXT) ";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql= "DROP TABLE " + table;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }

    public static long AddSociete(SQLiteDatabase db, Societe  e){
        ContentValues s= new ContentValues();
        s.put(COL2,e.getNbemploye());
        s.put(COL3,e.getNom());
        s.put(COL4,e.getActivite());
        return db.insert(table,null,s);
    }

    public static long UpdateSociete(SQLiteDatabase db, Societe e){
        ContentValues a = new ContentValues();
       a.put(COL2,e.getNbemploye());
        a.put(COL3,e.getNom());
        a.put(COL4,e.getActivite());
        return db.update(table,a,"id="+e.getId(),null);
    }
    public static long DeleteSociete(SQLiteDatabase db, int id){
        return db.delete(table,"id="+id,null);
    }



}
