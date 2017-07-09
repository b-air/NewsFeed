package com.example.android.newsfeed;

/**
 * Created by bruno on 09/07/2017.
 */

public class News {

    //Define var
    private String mTitle;
    private String mDate;
    private String mNewsUrl;

    //Constructor
    public News(String title, String date, String newsUrl){
        mTitle = title;
        mDate = date;
        mNewsUrl = newsUrl;
    }

    //Get
    public String getTitle(){ return mTitle;}
    public String getDate(){ return mDate;}
    public String getNewsUrl(){ return mNewsUrl;}
}
