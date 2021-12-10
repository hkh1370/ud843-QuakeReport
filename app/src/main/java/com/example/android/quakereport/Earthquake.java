package com.example.android.quakereport;

public class Earthquake {
    //Declare 3 variable to hold magnitude, place, date data
    private double mag;
    private String place;
    private long date;
    private String url;

    public Earthquake(double iMag, String iPlace, long iDate, String iUrl){
        mag = iMag;
        place = iPlace;
        date = iDate;
        url = iUrl;
    }

    public double getMag() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public long getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}
