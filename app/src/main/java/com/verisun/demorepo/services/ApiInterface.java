package com.verisun.demorepo.services;

import com.verisun.demorepo.model.AmazonModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET(".json")
    Call<List<AmazonModel>> getAmazon();

}
