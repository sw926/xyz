package com.sw926.xyz.com.sw926.xyz.data;

import com.sw926.xyz.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sunwei on 5/3/16.
 */
@Singleton
@Component(modules = DataModule2.class)
public interface DataComponent {
    void inject(MainActivity mainActivity);
}
