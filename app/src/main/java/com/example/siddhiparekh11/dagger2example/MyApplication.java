package com.example.siddhiparekh11.dagger2example;


import android.app.Application;



public class MyApplication extends Application {
    private ComponentInteractor componentInteractor;
    private User user;

    @Override
    public void onCreate() {
        super.onCreate();
        user = new User("Siddhi","Parekh");
        componentInteractor = DaggerComponentInteractor.builder()
                                .appModule(new AppModule(this))
                                .userModule(new UserModule(user)).build();
    }

    public ComponentInteractor getComponentInteractor(){
        return componentInteractor;
    }
}
