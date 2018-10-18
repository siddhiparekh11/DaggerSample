package com.example.siddhiparekh11.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApplication)getApplication()).getComponentInteractor().inject(this);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txtFullName);
        textView.setText(user.firstName+" "+user.lastName);

    }
}
