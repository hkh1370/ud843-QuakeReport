package com.example.android.quakereport;

public class Earthquake {
    //Declare 3 variable to hold magnitude, place, date data
    private double mag;
    private String place;
    private long date;

    public Earthquake(double iMag, String iPlace, long iDate){
        mag = iMag;
        place = iPlace;
        date = iDate;
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
}
