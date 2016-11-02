package com.example.common;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by marek.orgon on 19.10.2016.
 */
public class DebugLoggerStorage implements IStorage {

    @Inject
    public DebugLoggerStorage() {
    }

    @Override
    public void save(String string) {
        Log.d("TAG", string);
    }
}
