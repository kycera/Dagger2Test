package com.avg.common;

import javax.inject.Inject;

/**
 * Created by marek.orgon on 18.10.2016.
 */
public class TwitterClient {

    @Inject
    NetExecutor mNetExecutor;

    @Inject
    public TwitterClient() {
    }

    public void tweet(String tweet) {
        mNetExecutor.post("twitter " + tweet + " ");
    }
}
