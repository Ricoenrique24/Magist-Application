package com.example.projectakhir.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {
    private static final String baseURL = "http://192.168.26.136/tree-ace-app/";
    private static Retrofit retro;

    public static Retrofit connectRetro(){
        if (retro==null){
            retro = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retro;
    }
}
