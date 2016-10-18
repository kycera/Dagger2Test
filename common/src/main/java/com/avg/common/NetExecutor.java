package com.avg.common;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by marek.orgon on 18.10.2016.
 */
public class NetExecutor {

    IStorage mStorage;

    @Inject
    public NetExecutor(Context context, @LoggerStarageName IStorage storage, ISender sender) {
        mStorage = storage;
    }

    public void post(String post) {
        Log.e("TAG", post + " " + this.hashCode());
        mStorage.save(post);
    }
}
