package com.happymoments.prayermemo.database;

import android.content.Context;
import android.util.Log;

import com.happymoments.prayermemo.data.Memo;

import io.realm.Realm;

public class DatabaseManagerByRealm {

    public static void addMemo(Context context, final Memo memo) {
        Log.i("test", "DatabaseManager:: addMemo()");
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Log.i("test", "DatabaseManager:: addMemo() execute()");
                /*Memo memo2 = realm.createObject(Memo.class);
                memo2.setTitle(memo.getTitle());
                memo2.setContent(memo.getContent());*/
                realm.copyToRealm(memo);
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Log.i("test", "DatabaseManager:: addMemo() onSuccess()");
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Log.e("test", "DatabaseManager:: addMemo() onError()");
            }
        });
        //realm.beginTransaction();

        //realm.commitTransaction();
    }
}
