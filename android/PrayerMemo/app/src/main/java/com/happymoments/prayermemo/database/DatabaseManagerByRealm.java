package com.happymoments.prayermemo.database;

import android.util.Log;

import com.happymoments.prayermemo.data.Memo;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class DatabaseManagerByRealm {

    public static void addMemo(final Memo memo) {
        Log.i("test", "DatabaseManager:: addMemo()");
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Log.i("test", "DatabaseManager:: addMemo() execute()");
                memo.setId(realm.where(Memo.class).max("id").intValue() + 1);
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
                Log.e("test", "DatabaseManager:: addMemo() onError() " + error.getMessage());
            }
        });
    }

    public static List<Memo> getMemoList() {
        Log.i("test", "DatabaseManager:: getMemoList()");
        Realm realm = Realm.getDefaultInstance();
        RealmResults<Memo> results = realm.where(Memo.class).findAll();

        Log.i("test", "DatabaseManager:: getMemoList() size=" + results.size());
        List<Memo> memoList = new ArrayList<>();
        for (Memo memo : results) {
            memoList.add(memo);
        }
        return memoList;
    }
}
