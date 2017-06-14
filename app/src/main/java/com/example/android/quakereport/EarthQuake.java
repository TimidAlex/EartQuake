package com.example.android.quakereport;

/**
 * Created by Alexandra Mukhina on 14.06.2017.
 */

public class EarthQuake {

    private String getMagnitude ;
    private String getCity;
    private String getData;



    public EarthQuake (String acity, String amag, String adata){

        getMagnitude = amag;
        getCity = acity;
        getData = adata;

    }

    public String getMagnitude () {return getMagnitude;}
    public String getCity () {return getCity;}
    public String getData () {return getData;}


}
