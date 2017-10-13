package com.example.tony.myweatherapp.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by tony on 10/12/17.
 */

public interface ApiInteractor {
    @GET("data/2.5/weather")
    Call< POJOWeather > weatherCity(@Query("q") String city,@Query("units") String metrics);
    @GET("data/2.5/weather")
    Call<POJOWeather> weatherZip(@Query("zip") String zipcode,@Query("units") String metrics);
}
