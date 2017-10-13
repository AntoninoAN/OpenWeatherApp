package com.example.tony.myweatherapp.Model;

import android.support.annotation.Nullable;

import com.example.tony.myweatherapp.API.ApiConfig;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tony on 10/13/17.
 */

public class RetrofitInteractorContract extends RetrofitContract {
    @Override
    public Call<POJOWeather> getCurrentFromLocation(@Nullable String location, @Nullable String zip) {
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(ApiConfig.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory)
    }
}
