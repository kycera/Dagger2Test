package com.example.daggertest;

import android.app.Application;
import android.content.Context;

import com.example.common.CommonComponent;
import com.example.common.CommonModule;
import com.example.common.DaggerCommonComponent;
import com.example.common.DaggerNetComponent;
import com.example.common.NetComponent;

/**
 * Created by marek.orgon on 18.10.2016.
 */
public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        CommonComponent commonComponent = DaggerCommonComponent.builder().commonModule(new CommonModule(this)).build();

        NetComponent netComponent =  DaggerNetComponent.builder().commonComponent(commonComponent).build();

        mAppComponent = DaggerAppComponent.builder().netComponent(netComponent).build();

    }

    public static AppComponent getAppComponent(Context context) {
        return ((App) context).mAppComponent;
    }
}
