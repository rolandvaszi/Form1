package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FromFragment fragment = new FromFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.FormContainer, fragment).commit();
    }
}
