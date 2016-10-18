package com.avg.daggertest;

import com.avg.common.NetComponent;

import dagger.Component;

/**
 * Created by marek.orgon on 18.10.2016.
 */
@AppScope
@Component(dependencies = {NetComponent.class}, modules={AppModule.class})
public interface AppConponent {

    void inject(MainActivity act);
}
