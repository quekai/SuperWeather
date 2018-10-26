package com.example.quekai.superweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by quekai on 2018/10/25.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
