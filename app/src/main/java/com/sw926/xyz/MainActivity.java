package com.sw926.xyz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.sw926.xyz.com.sw926.xyz.data.HttpEngine;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject HttpEngine mHttpEngine;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App)getApplication()).getDataComponent().inject(this);

        mTextView = (TextView) findViewById(R.id.tv_text);
        mTextView.setText(mHttpEngine.getTag());
    }
}
