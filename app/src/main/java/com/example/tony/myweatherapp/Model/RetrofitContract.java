package com.example.tony.myweatherapp.Model;

import android.support.annotation.Nullable;

import retrofit2.Call;

/**
 * Created by tony on 10/13/17.
 */

public interface RetrofitContract {

    Call<POJOWeather> getCurrentFromLocation(@Nullable String location, @Nullable String zip);
}
