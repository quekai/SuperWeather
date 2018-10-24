package com.example.quekai.superweather.db;

/**
 * Created by quekai on 2018/10/24.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }

    public String getCountryName(){
        return countryName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public int getCityId(){
        return cityId;
    }

    void setId(int id){
        this.id = id;
    }

    void setCountryName(String countryName){
        this.countryName = countryName;
    }

    void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    void setCityId(int cityId){
        this.cityId = cityId;
    }

}
