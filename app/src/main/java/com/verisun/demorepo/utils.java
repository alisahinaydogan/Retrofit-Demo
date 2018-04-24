package com.verisun.demorepo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class utils {
    public static void printJsonResult(Object o) {

        System.out.print("############################################\n\n");
        //  Log.e("Sentence: \n",""+ sentence.getData());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(o);
        System.out.println(" SIMPLE JSON : \n\n" + json);
        System.out.print("############################################\n\n");
    }
}
