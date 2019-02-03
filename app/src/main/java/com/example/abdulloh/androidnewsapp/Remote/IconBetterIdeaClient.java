package com.example.abdulloh.androidnewsapp.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IconBetterIdeaClient {
    private static Retrofit retrofit=null;
    public static Retrofit getClient()
    {
        if (retrofit ==null)
        {
            retrofit = new Retrofit.Builder()
   //                 .baseUrl("https://www.google.com/search?biw=1242&bih=525&tbm=isch&sa=1&ei=PJRFXJiJG4_NwAKXrZMw&q=news+120x120&oq=news+120x120&gs_l=img.3...871.7602..8013...2.0..0.298.2190.0j5j5......1....1..gws-wiz-img.......35i39j0j0i67j0i19j0i10i19.3xU_RktfkAI#imgrc=0YQGFddZZgJnyM:")
       //             .baseUrl("https://i.olsh.me/")
                   .baseUrl("https://icons.better-idea.org/")   //ishlamayopkanakan bu syat
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
