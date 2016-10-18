package com.avg.common;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by marek.orgon on 18.10.2016.
 */
@Module
public class CommonModule {
    private Context mContext;

    public CommonModule(Context mContext) {
        this.mContext = mContext;
    }

    @Provides
    public Context getContext() {
        return mContext;
    }
}
