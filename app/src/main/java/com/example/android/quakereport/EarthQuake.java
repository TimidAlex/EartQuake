package com.example.android.quakereport;

/**
 * Created by Alexandra Mukhina on 14.06.2017.
 */

public class EarthQuake {

    private Double getMagnitude ;
    private String getCity;
    private String getData;
    private Long getMilliSec;



    public EarthQuake (String acity, Double amag,  long timeMillesec){

        getMagnitude = amag;
        getCity = acity;

    getMilliSec = timeMillesec;
    }



    public Double getMagnitude () {return getMagnitude;}
    public String getCity () {return getCity;}
    public Long getMilliSec() {return  getMilliSec;}


}
