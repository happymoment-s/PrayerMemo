package com.happymoments.prayermemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.happymoments.prayermemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mFolderNameTextView;
    private ImageView mAddMemoImageView;
    private ImageView mSearchImageView;
    private ImageView mSettingImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    //------- view -------
    private void initView() {
        mFolderNameTextView = (TextView) findViewById(R.id.header_folder_name_textView);
        mAddMemoImageView = (ImageView) findViewById(R.id.header_add_memo_imageView);
        mSearchImageView = (ImageView) findViewById(R.id.header_search_imageView);
        mSettingImageView = (ImageView) findViewById(R.id.header_setting_imageView);
    }

    private void initData() {
        mFolderNameTextView.setOnClickListener(this);
        mAddMemoImageView.setOnClickListener(this);
        mSearchImageView.setOnClickListener(this);
        mSettingImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.header_folder_name_textView:
                break;
            case R.id.header_add_memo_imageView:
                break;
            case R.id.header_search_imageView:
                break;
            case R.id.header_setting_imageView:
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
