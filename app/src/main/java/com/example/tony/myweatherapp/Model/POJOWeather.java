package com.example.tony.myweatherapp.Model;

/**
 * Created by tony on 10/13/17.
 */

public class POJOWeather {
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    private String city;
    private String zip;
    private String current;


}
