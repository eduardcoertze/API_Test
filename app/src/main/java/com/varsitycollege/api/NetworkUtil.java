package com.varsitycollege.api;
import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUtil {

    private static final String BASE_URL="https://dataservice.accuweather.com/forecasts/v1/daily/5day/305605";
    private static final String API_KEY="ErpiAZm7dDAZ1L1thBaB1dijeYqG3fdi";
    private static final String PARAM_API_KEY="apikey";
    private static final String METRIC="metric";
    private static final String METRIC_PARAM="true";


    public static URL buildURL(){
        Uri uri = Uri.parse(BASE_URL).buildUpon()
                .appendQueryParameter(PARAM_API_KEY,API_KEY)
                .appendQueryParameter(METRIC_PARAM,METRIC)
                .build();

        URL url = null;

        try {
            url = new URL((uri).toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();

        }

        return url;
    }

}
