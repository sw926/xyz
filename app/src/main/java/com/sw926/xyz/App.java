package com.sw926.xyz;

import android.app.Application;

import com.sw926.xyz.com.sw926.xyz.data.DaggerDataComponent;
import com.sw926.xyz.com.sw926.xyz.data.DataComponent;

/**
 * Created by sunwei on 5/4/16.
 */
public class App extends Application {

    private DataComponent mDataComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mDataComponent = DaggerDataComponent.builder().build();
    }

    public DataComponent getDataComponent() {
        return mDataComponent;
    }
}
