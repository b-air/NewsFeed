package com.example.android.newsfeed;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by bruno on 09/07/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String LOG_TAG = NewsAdapter.class.getSimpleName();

    //Constructor
    public NewsAdapter(Activity context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // Check - inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list, parent, false);
        }

        //get object
        News currentNews = getItem(position);

        //Find and set date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_label);
        dateTextView.setText(currentNews.getDate());

        //Find and set section
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section_label);
        sectionTextView.setText(currentNews.getSection());

        //Find and set title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_label);
        titleTextView.setText(currentNews.getTitle());

        //Find and set url
        TextView urlTextView = (TextView) listItemView.findViewById(R.id.url_label);
        urlTextView.setText(currentNews.getNewsUrl());

        return listItemView;
    }
}
