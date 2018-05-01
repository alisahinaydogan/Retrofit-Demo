package com.verisun.demorepo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.verisun.demorepo.R;
import com.verisun.demorepo.adapter.AmazonAdapter;
import com.verisun.demorepo.model.AmazonModel;
import com.verisun.demorepo.services.ApiClient;
import com.verisun.demorepo.services.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiInterface apiInterface;
    RecyclerView recyclerView;
    AmazonAdapter amazonAdapter;
    ArrayList<AmazonModel> amazonModels1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiClient.getRetrofit().create(ApiInterface.class);
        Call<List<AmazonModel>> call=apiInterface.getAmazon();

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);




        call.enqueue(new Callback<List<AmazonModel>>() {
            @Override
            public void onResponse(Call<List<AmazonModel>> call, Response<List<AmazonModel>> response) {



                List<AmazonModel> amazonModels= new ArrayList<>();
                amazonModels=response.body();

              amazonModels1=new  ArrayList<AmazonModel>(amazonModels) ;

                amazonAdapter = new AmazonAdapter(getApplicationContext(),amazonModels1);
                recyclerView.setAdapter(amazonAdapter);

                LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getApplicationContext());
                linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(linearLayoutManager);
                //utils.printJsonResult(amazonModels1);


            }

            @Override
            public void onFailure(Call<List<AmazonModel>> call, Throwable t) {

            }
        });



    }
}
