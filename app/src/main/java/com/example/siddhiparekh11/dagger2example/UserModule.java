package com.example.siddhiparekh11.dagger2example;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {
    private User user;

    public UserModule(User user){
        this.user=user;
    }

    @Provides
    @Singleton
    public User getUserObject(){
        return user;
    }
}
