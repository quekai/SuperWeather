package com.example.quekai.superweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by quekai on 2018/10/24.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
