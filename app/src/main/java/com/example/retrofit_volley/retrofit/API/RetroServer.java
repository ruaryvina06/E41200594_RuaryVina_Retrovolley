package com.example.retrofit_volley.retrofit.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {

    private static final String baseURL = "http://10.107.70.5/koneksiAPI/retrofit/";
    private static Retrofit retro;

    public static Retrofit konekRetrofit() {
        if (retro == null) {
            retro = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retro;
    }

    public static APIRequestData getUserService(){
        APIRequestData userService = konekRetrofit().create(APIRequestData.class);

        return userService;
    }

}
