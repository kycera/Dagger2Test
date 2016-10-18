package com.example.common;

import dagger.Component;

/**
 * Created by marek.orgon on 18.10.2016.
 */
@NetScope
@Component(dependencies = CommonComponent.class, modules = {NetModule.class})
public interface NetComponent {


    NetExecutor netExecutor();
}
