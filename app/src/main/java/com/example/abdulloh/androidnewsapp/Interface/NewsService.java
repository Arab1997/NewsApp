package com.example.abdulloh.androidnewsapp.Interface;


import com.example.abdulloh.androidnewsapp.Common.Common;
import com.example.abdulloh.androidnewsapp.Model.News;
import com.example.abdulloh.androidnewsapp.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by reale on 10/4/2017.
 */

public interface NewsService {
//    @GET("v1/sources?language=en")
//    @GET("v2/sources?apiKey=b0e0468d42ec4e9eab0431426862bb1c")
    @GET("v2/sources?apiKey=" + Common.API_KEY)
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}