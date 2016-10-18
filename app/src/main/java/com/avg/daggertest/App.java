package com.avg.daggertest;

import android.app.Application;
import android.content.Context;

import com.avg.common.CommonComponent;
import com.avg.common.CommonModule;
import com.avg.common.DaggerCommonComponent;
import com.avg.common.DaggerNetComponent;
import com.avg.common.NetComponent;

/**
 * Created by marek.orgon on 18.10.2016.
 */

public class App extends Application {

    private AppConponent mAppConponent;

    @Override
    public void onCreate() {
        super.onCreate();

        CommonComponent commonComponent = DaggerCommonComponent.builder().commonModule(new CommonModule(this)).build();

        NetComponent netComponent =  DaggerNetComponent.builder().commonComponent(commonComponent).build();

        mAppConponent = DaggerAppConponent.builder().netComponent(netComponent).build();

    }

    public static AppConponent getAppComponent(Context context) {
        return ((App) context).mAppConponent;
    }
}
