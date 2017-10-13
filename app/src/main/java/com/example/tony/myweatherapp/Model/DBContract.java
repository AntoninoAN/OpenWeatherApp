package com.example.tony.myweatherapp.Model;

import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;

/**
 * Created by tony on 10/13/17.
 */

public interface DBContract {
    void saveCurrentWeather(@Nullable String location, @Nullable String zip, String current);
}
