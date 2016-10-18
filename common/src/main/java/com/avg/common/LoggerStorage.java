package com.avg.common;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by marek.orgon on 18.10.2016.
 */
public class LoggerStorage implements IStorage {

    @Inject
    public LoggerStorage() {
    }

    @Override
    public void save(String string) {
        Log.e("TAG", "Stare: " + string);
    }
}
