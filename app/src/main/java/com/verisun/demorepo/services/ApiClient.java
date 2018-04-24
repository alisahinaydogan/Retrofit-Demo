package com.verisun.demorepo.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASEURL ="https://null-86c43.firebaseio.com/";
    private static Retrofit retrofit=null;

    public static Retrofit getRetrofit()
    {
        if (retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}


