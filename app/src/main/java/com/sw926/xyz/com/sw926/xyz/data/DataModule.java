package com.sw926.xyz.com.sw926.xyz.data;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sunwei on 5/3/16.
 */
@Module
public class DataModule {

    @Provides
    HttpEngine provideHttpEngine() {
        return new OkHttpEngine();
    }
}
