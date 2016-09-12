package com.happymoments.prayermemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.happymoments.prayermemo.R;

public class MemoActivity extends Activity implements View.OnClickListener {
    public final String TAG = MemoActivity.this.getClass().getSimpleName();

    private LinearLayout mFolderNameLayout;
    private ImageView mAddMemoImageView;
    private ImageView mSearchImageView;
    private ImageView mSettingImageView;

    private ImageView mCancelMemoImageView;
    private ImageView mSaveMemoImageView;
    private ImageView mSettingMemoImageView;
    private EditText mMemoBodyEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);


        initView();
        initData();
    }

    //------- view --------
    private void initView() {
        mFolderNameLayout = (LinearLayout) findViewById(R.id.header_folder_name_linearLayout);
        mAddMemoImageView = (ImageView) findViewById(R.id.header_add_memo_imageView);
        mSearchImageView = (ImageView) findViewById(R.id.header_search_imageView);
        mSettingImageView = (ImageView) findViewById(R.id.header_setting_imageView);

        mCancelMemoImageView = (ImageView) findViewById(R.id.header_cancel_memo_imageView);
        mSaveMemoImageView = (ImageView) findViewById(R.id.header_save_memo_imageView);
        mSettingMemoImageView = (ImageView) findViewById(R.id.header_setting_memo_imageView);
        mMemoBodyEditText = (EditText) findViewById(R.id.activity_memo_body_editText);
    }

    private void initData() {
        // folderName, addMemo, search, setting 위젯 숨김
        mFolderNameLayout.setVisibility(View.GONE);
        mAddMemoImageView.setVisibility(View.GONE);
        mSearchImageView.setVisibility(View.GONE);
        mSettingImageView.setVisibility(View.GONE);
        mCancelMemoImageView.setVisibility(View.VISIBLE);
        mSaveMemoImageView.setVisibility(View.VISIBLE);
        mSettingMemoImageView.setVisibility(View.VISIBLE);

        mCancelMemoImageView.setOnClickListener(this);
        mSaveMemoImageView.setOnClickListener(this);
        mSettingMemoImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.header_cancel_memo_imageView:
                Log.i(TAG, "onClick() id=header_cancel_memo_imageView");
                finish();
                break;
            case R.id.header_save_memo_imageView:
                Log.i(TAG, "onClick() id=header_save_memo_imageView");
                break;
            case R.id.header_setting_memo_imageView:
                Log.i(TAG, "onClick() id=header_setting_memo_imageView");
                break;
        }
    }
    //======= view =======




    //------- activity cycle --------
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    //======= activity cycle =======

}
