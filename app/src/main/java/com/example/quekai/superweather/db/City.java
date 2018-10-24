package com.example.quekai.superweather.db;

/**
 * Created by quekai on 2018/10/24.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceCode;

    public int getId(){
        return id;
    }

    public String getCityName(){
        return cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    void setId(int id){
        this.id = id;
    }

    void setCityName(String cityName){
        this.cityName = cityName;
    }

    void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    void  setProvinceCode(int provinceCode){
        this.provinceCode  = provinceCode;
    }
}
