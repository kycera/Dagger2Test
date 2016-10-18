package com.example.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.common.TwitterClient;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    TwitterClient mTwitterClient;
    @Inject
    TwitterClient mTwitterClient2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getAppComponent(getApplicationContext()).inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        mTwitterClient.tweet("" + mTwitterClient.hashCode());
        mTwitterClient2.tweet("" + mTwitterClient2.hashCode());
    }
}
