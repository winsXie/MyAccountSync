package com.example.myaccountsync.accountsync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.util.Log;

public class MySyncAdapter extends AbstractThreadedSyncAdapter {
    public MySyncAdapter(Context context, boolean autoInitialize) {
        super(context, autoInitialize);
    }

    public MySyncAdapter(Context context, boolean autoInitialize, boolean allowParallelSyncs) {
        super(context, autoInitialize, allowParallelSyncs);
    }

    @Override
    public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {
        Log.i("AccountSync", "onPerformSync: ");
    }
}
