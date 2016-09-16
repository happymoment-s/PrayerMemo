package com.happymoments.prayermemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.happymoments.prayermemo.data.Memo;

import java.util.List;

public class MemoAdapter extends BaseAdapter {
    private Context mContext;
    private List<Memo> mMemoList;

    public MemoAdapter(Context context, List<Memo> memoList) {
        this.mContext = context;
        this.mMemoList = memoList;
    }

    @Override
    public int getCount() {
        if (mMemoList != null) {
            return mMemoList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        if (mMemoList != null) {
            return mMemoList.get(i);
        }
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
