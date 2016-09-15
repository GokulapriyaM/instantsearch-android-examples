package com.algolia.instantsearch.examples.media;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.algolia.instantsearch.InstantSearchHelper;
import com.algolia.instantsearch.Searcher;
import com.algolia.search.saas.Client;

public class MainActivity extends AppCompatActivity {

    private static final String ALGOLIA_APP_ID = "latency";
    private static final String ALGOLIA_INDEX_NAME = "youtube";
    private static final String ALGOLIA_API_KEY = "0c9899197c49f80b183adc0f68ea8d78";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        new InstantSearchHelper(this, menu, R.id.action_search,
                new Searcher(new Client(ALGOLIA_APP_ID, ALGOLIA_API_KEY).initIndex(ALGOLIA_INDEX_NAME)));
        return true;
    }
}