package com.example.android.quakereport;

public class Earthquake {
    private double mag;
    private String name;
    private long date;
    private String website;

    public Earthquake(double i,String n,long d,String w){
        mag=i;
        name=n;
        date=d;
        website=w;
    }

    public double getMag() {
        return mag;
    }

    public String getName() {
        return name;
    }

    public long getTimeInMilliseconds() {
        return date;
    }

    public String getWebsite() {
        return website;
    }
}
