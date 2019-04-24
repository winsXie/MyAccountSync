package com.example.myaccountsync.accountsync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MySyncService extends Service {
    private static final Object sSyncAdapterLock = new Object();
    private static MySyncAdapter sSyncAdapter = null;

    public MySyncService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        synchronized (sSyncAdapterLock) {
            if (sSyncAdapter == null) {
                sSyncAdapter = new MySyncAdapter(getApplicationContext(), true);
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return sSyncAdapter.getSyncAdapterBinder();
    }

}
