package com.example.tony.myweatherapp.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tony on 10/13/17.
 */

public class DBHelperWeather extends SQLiteOpenHelper {


    private static final int dbversion=1;
    private static final String dbname="DB_Weather";
    private static final String WEATHER_TABLE_NAME = "WEATHER_TABLE";
    private static final String LOCATION = "location";
    private static final String WEATHER_ID = "_id";
    private static final String ZIP = "zip";
    private static final String CURRENT = "current";
    private static final java.lang.String WEATHER_CREATE_QUERY = "CREATE TABLE"+
            WEATHER_TABLE_NAME+"("+
            WEATHER_ID+" INTEGER PRIMARY KEY"+
            LOCATION+" TEXT"+
            ZIP+" TEXT"+
            CURRENT+" TEXT)";
    private static final java.lang.String WEATHER_DROP_QUERY = "DROP TABLE IF EXISTS ";

    public DBHelperWeather(Context context){
        super(context, dbname, null, dbversion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(WEATHER_CREATE_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(WEATHER_DROP_QUERY+WEATHER_TABLE_NAME);
    }
}
