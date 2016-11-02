package com.example.common;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by marek.orgon on 18.10.2016.
 */
@NetScope
public class NetExecutor {

    private IStorage mStorage;
    private IStorage mStorage2;
    private IStorage mStorageDebug;

    private NetHelper mHelper;

    @Inject
    public NetExecutor(Context context, IStorage storage, IStorage storage2, @DebugLoggerStorageName IStorage debugStorage/*, NetHelper netHelper*/) {
        mStorage = storage;
        mStorage2 = storage;
        mStorageDebug = debugStorage;

        /*mHelper = netHelper;
        netHelper.setExecutor(this);*/

        Log.e("TAG", "" + storage.getClass().getSimpleName() + storage.hashCode()
                + " " + storage2.getClass().getSimpleName() + storage2.hashCode()
                + " " + debugStorage.getClass().getSimpleName() + debugStorage.hashCode());
    }

    @Inject
    public void setHelper(NetHelper netHelper) {
        mHelper = netHelper;
        netHelper.setExecutor(this);
    }

    public void callFromCallback() {
        Log.e("TAG", "from helper " + this.hashCode());
    }

    public void post(String post) {
        Log.e("TAG", post + " " + this.hashCode());
        mStorage.save(post);
        mStorage2.save(post);
        mStorageDebug.save(post);
        mHelper.doIt();
    }
}
