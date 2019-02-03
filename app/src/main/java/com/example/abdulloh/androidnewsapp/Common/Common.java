package com.example.abdulloh.androidnewsapp.Common;

import com.example.abdulloh.androidnewsapp.Interface.IconBetterIdeaService;
import com.example.abdulloh.androidnewsapp.Interface.NewsService;
import com.example.abdulloh.androidnewsapp.Model.IconBetterIdea;
import com.example.abdulloh.androidnewsapp.Remote.IconBetterIdeaClient;
import com.example.abdulloh.androidnewsapp.Remote.RetrofitClient;

public class Common {
    public static final String API_KEY = "b0e0468d42ec4e9eab0431426862bb1c";
    private static final String BASE_URL = "https://newsapi.org/";

//    private static final String API_KEY = "b0e0468d42ec4e9eab0431426862bb1c";

    public static NewsService getNewsService() {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService() {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    //https://newsapi.org/v2/everything?q=bitcoin&apiKey=b0e0468d42ec4e9eab0431426862bb1c
    public static String getAPIUrl(String source, String sortBy, String apiKEY) {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }

}
