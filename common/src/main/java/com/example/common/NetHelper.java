package com.example.common;

import javax.inject.Inject;

/**
 * Created by marek.orgon on 19.10.2016.
 */

public class NetHelper {

    private NetExecutor mNetExecutor;

    @Inject
    public NetHelper() {
    }

    public void setExecutor(NetExecutor netExecutor) {
        mNetExecutor = netExecutor;
    }

    public void doIt() {
        mNetExecutor.callFromCallback();
    }
}
