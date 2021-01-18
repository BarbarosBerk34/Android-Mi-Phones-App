package com.h5190007.barbaros_berk_gelenbe_final.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtil {

    public static boolean checkNetworkConn(Context context)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
