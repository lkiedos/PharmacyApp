package com.example.apteka_prototype.Database;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import java.util.ArrayList;
import java.util.List;
import com.example.apteka_prototype.Model.Rejestr;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class Database extends SQLiteAssetHelper {

    private static final String DB_NAME="rejestr.db";
    private static final int DB_VER=1;

    public Database(Context context) {
        super(context, DB_NAME, null, DB_VER);
    }

    public  List<Rejestr> getRejestr()
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"Id", "Nazwa","Rodzaj","Moc","Postac","Substancja"};
        String tableName = "Rejestr";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect, null,null,null,null,null);
        List<Rejestr> result = new ArrayList<>();
        if(cursor.moveToFirst())
        {
            do{
                Rejestr rejestr = new Rejestr();
                rejestr.setId(cursor.getInt(cursor.getColumnIndexOrThrow("Id")));
                rejestr.setNazwa(cursor.getString(cursor.getColumnIndexOrThrow("Nazwa")));
                rejestr.setRodzaj(cursor.getString(cursor.getColumnIndexOrThrow("Rodzaj")));
                rejestr.setMoc(cursor.getString(cursor.getColumnIndexOrThrow("Moc")));
                rejestr.setPostac(cursor.getString(cursor.getColumnIndexOrThrow("Postac")));
                rejestr.setSubstancja(cursor.getString(cursor.getColumnIndexOrThrow("Substancja")));

                result.add(rejestr);
            }while(cursor.moveToNext());
        }
        return result;
    }

    public List<String> getNames()
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"Nazwa"};
        String tableName = "Rejestr";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect, null,null,null,null,null);
        List<String> result = new ArrayList<>();
        if(cursor.moveToFirst())
        {
            do{
                result.add(cursor.getString(cursor.getColumnIndexOrThrow("Nazwa")));
            }while(cursor.moveToNext());
        }
        return result;
    }

    public List<Rejestr> getRejestrByName(String nazwa)
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"Id", "Nazwa","Rodzaj","Moc","Postac","Substancja"};
        String tableName = "Rejestr";

        qb.setTables(tableName);


        //Cursor cursor = qb.query(db,sqlSelect, "Nazwa ?",new String[]{nazwa}, null,null,null);
        Cursor cursor = qb.query(db,sqlSelect, "Nazwa LIKE ?",new String[]{"%"+nazwa+"%"}, null,null,null);
        List<Rejestr> result = new ArrayList<>();
        if(cursor.moveToFirst())
        {
            do{
                Rejestr rejestr = new Rejestr();
                rejestr.setId(cursor.getInt(cursor.getColumnIndexOrThrow("Id")));
                rejestr.setNazwa(cursor.getString(cursor.getColumnIndexOrThrow("Nazwa")));
                rejestr.setRodzaj(cursor.getString(cursor.getColumnIndexOrThrow("Rodzaj")));
                rejestr.setMoc(cursor.getString(cursor.getColumnIndexOrThrow("Moc")));
                rejestr.setPostac(cursor.getString(cursor.getColumnIndexOrThrow("Postac")));
                rejestr.setSubstancja(cursor.getString(cursor.getColumnIndexOrThrow("Substancja")));

                result.add(rejestr);
            }while(cursor.moveToNext());
        }
        return result;
    }





}
