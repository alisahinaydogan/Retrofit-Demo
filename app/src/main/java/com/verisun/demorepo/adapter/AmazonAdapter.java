package com.verisun.demorepo.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.verisun.demorepo.R;
import com.verisun.demorepo.model.AmazonModel;
import com.verisun.demorepo.utils;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;

public class AmazonAdapter extends RecyclerView.Adapter<AmazonAdapter.ViewHolder>{

        private Context context;

    ArrayList<AmazonModel> amazonModels;
    LayoutInflater inflater;


    public AmazonAdapter(Context context, ArrayList<AmazonModel> data){

        // inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
       // inflater=LayoutInflater.from(context);
        this.context=context;
        this.amazonModels=data;
       // utils.printJsonResult(amazonModels);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


       // View v=inflater.inflate(R.layout.custom_list,parent,false);
        View v =LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_list,parent,false);
        ViewHolder holder= new ViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AmazonModel amaznModel=amazonModels.get(position);

        String name =amaznModel.getName();
        String id =amaznModel.getProductId();
        int price =amaznModel.getPrice();
       // Bitmap perph =amaznModel.getImage();


        String testString = String.valueOf(amazonModels.get(position).getPrice());
        holder.txtName.setText(amazonModels.get(position).getName());
        holder.txtPrice.setText(testString+"\n"+" TL");
        holder.txtId.setText(amazonModels.get(position).getProductId());


        Picasso.with(context)
        .load(amazonModels.get(position).getImage())
        .into(holder.persnInfo);
    }







    @Override
    public int getItemCount() {
        return amazonModels.size();

    }




    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView txtName,txtPrice,txtId;

        ImageView persnInfo;


        public ViewHolder(View itemView) {
            super(itemView);


            txtName=(TextView) itemView.findViewById(R.id.txtNAME);
            txtPrice=(TextView)itemView.findViewById(R.id.txtPrice);
            txtId=(TextView)itemView.findViewById(R.id.txtID);
            persnInfo=(ImageView) itemView.findViewById(R.id.imageViewP);



        }





    }

}
