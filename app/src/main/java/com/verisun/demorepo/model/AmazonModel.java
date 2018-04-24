package com.verisun.demorepo.model;

import android.graphics.Bitmap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AmazonModel {
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("product_id")
    @Expose
    private String productId;


    public void setImage(String image) {
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

}
