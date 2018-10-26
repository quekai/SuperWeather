package com.example.quekai.superweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by quekai on 2018/10/25.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
