package com.example.siddhiparekh11.dagger2example;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={AppModule.class,UserModule.class})
public interface ComponentInteractor {

    void inject(MainActivity mainActivity);

}
