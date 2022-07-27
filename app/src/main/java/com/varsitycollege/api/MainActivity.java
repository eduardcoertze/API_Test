package com.varsitycollege.api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.net.URL;

public class MainActivity extends AppCompatActivity {



    private final String TAG = "Accuweather";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        URL testUrl = NetworkUtil.buildURL();
        Log.i(TAG, "Test: "+testUrl);


    }
}