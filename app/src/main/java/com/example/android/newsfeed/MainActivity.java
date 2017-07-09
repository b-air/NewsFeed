package com.example.android.newsfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<News> news = new ArrayList<>();

        //DUMMY DATA TODO: Delete before prod
        news.add(new News("SpaceX becomes first to re-fly used rocket", "2017-03-30","https://www.theguardian.com/science/2017/mar/30/spacex-falcon-9-elon-musk-reusable-rocket"));
        news.add(new News("SpaceX becomes first to re-fly used rocket", "2017-03-30","https://www.theguardian.com/science/2017/mar/30/spacex-falcon-9-elon-musk-reusable-rocket"));
        news.add(new News("SpaceX becomes first to re-fly used rocket", "2017-03-30","https://www.theguardian.com/science/2017/mar/30/spacex-falcon-9-elon-musk-reusable-rocket"));
        news.add(new News("SpaceX becomes first to re-fly used rocket", "2017-03-30","https://www.theguardian.com/science/2017/mar/30/spacex-falcon-9-elon-musk-reusable-rocket"));
        news.add(new News("SpaceX becomes first to re-fly used rocket", "2017-03-30","https://www.theguardian.com/science/2017/mar/30/spacex-falcon-9-elon-musk-reusable-rocket"));

        NewsAdapter adapter = new NewsAdapter(this, news);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        //TODO: add setOnItemClickListener
    }


}
