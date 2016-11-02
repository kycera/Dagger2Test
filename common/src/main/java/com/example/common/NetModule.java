package com.example.common;

import dagger.Module;
import dagger.Provides;

/**
 * Created by marek.orgon on 18.10.2016.
 */
@Module
@NetScope
public class NetModule {

    //@LoggerStorageName
    @NetScope
    @Provides
    IStorage storage(LoggerStorage loggerStorage) {
        return loggerStorage;
    }

    @DebugLoggerStorageName
    @Provides
    IStorage debugStorage(DebugLoggerStorage loggerStorage) {
        return loggerStorage;
    }
}
