package com.example.daggertest;

import com.example.common.NetComponent;

import dagger.Component;

/**
 * Created by marek.orgon on 18.10.2016.
 */
@AppScope
@Component(dependencies = {NetComponent.class}, modules={AppModule.class})
public interface AppComponent {

    void inject(MainActivity act);
}
