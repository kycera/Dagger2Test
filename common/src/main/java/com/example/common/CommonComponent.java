package com.example.common;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by marek.orgon on 18.10.2016.
 */
@Singleton
@Component(modules = CommonModule.class)
public interface CommonComponent {

    Context context();
}
