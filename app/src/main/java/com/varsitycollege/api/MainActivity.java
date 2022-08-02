package com.varsitycollege.api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {



    private final String TAG = "Accuweather";
    Fragment fiveDayWeatherFragment, tideFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fiveDayWeatherFragment = new FiveDayWeather();
        tideFragment = new TideFragment();

        URL testUrl = NetworkUtil.buildURL();
        Log.i(TAG, "Test: "+testUrl);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.weather_frame, fiveDayWeatherFragment);
        transaction.replace(R.id.tide_frame, tideFragment);
        transaction.commit();

    }



}