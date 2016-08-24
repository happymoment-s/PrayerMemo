package com.happymoments.prayermemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.happymoments.prayermemo.R;
import com.happymoments.prayermemo.data.Memo;
import com.happymoments.prayermemo.database.DatabaseManagerByRealm;

public class MainActivity extends AppCompatActivity {

    EditText mTitleEditText;
    EditText mContentEditText;
    Button mAddButton;
    Button mGetButton;
    TextView mMemoListTextView;

    //DatabaseManagerByRealm mDatabaseManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        mTitleEditText = (EditText) findViewById(R.id.editText);
        mContentEditText = (EditText) findViewById(R.id.editText2);
        mAddButton = (Button) findViewById(R.id.button);
        mGetButton = (Button) findViewById(R.id.button2);
        mMemoListTextView = (TextView) findViewById(R.id.textView);
    }

    private void initData() {
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Memo memo = new Memo();
                memo.setTitle(mTitleEditText.getText().toString());
                memo.setContent(mContentEditText.getText().toString());
                DatabaseManagerByRealm.addMemo(MainActivity.this, memo);
                mTitleEditText.setText("");
                mContentEditText.setText("");
            }
        });
    }
}
