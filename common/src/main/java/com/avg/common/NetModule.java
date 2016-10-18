package com.avg.common;

import dagger.Module;
import dagger.Provides;

/**
 * Created by marek.orgon on 18.10.2016.
 */
@Module
@NetScope
public class NetModule {

    @LoggerStarageName
    @Provides
    IStorage storage() {
        return new LoggerStorage();
    }
}
