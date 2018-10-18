package com.example.siddhiparekh11.dagger2example;


import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Application application;

    AppModule(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplicationObject(){
        return application;
    }
}
