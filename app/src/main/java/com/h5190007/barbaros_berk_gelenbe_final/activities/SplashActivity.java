package com.h5190007.barbaros_berk_gelenbe_final.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.h5190007.barbaros_berk_gelenbe_final.utils.AlertDialogUtil;
import com.h5190007.barbaros_berk_gelenbe_final.utils.Constants;
import com.h5190007.barbaros_berk_gelenbe_final.utils.NetworkUtil;
import com.h5190007.barbaros_berk_gelenbe_final.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splash();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        recreate();
    }


    private void splash() {
        CountDownTimer countDownTimer = new CountDownTimer(Constants.COUNTDOWN_MILISECONDS, Constants.COUNTDOWN_INTERVAL) {
            @Override
            public void onTick(long millisUntilFinished) {  }

            @Override
            public void onFinish() {
                switchActivity();
            }
        };
        countDownTimer.start();
    }

    private void switchActivity() {
       if (NetworkUtil.checkNetworkConn(getApplicationContext()))
       {
           startActivity(new Intent(getApplicationContext(),ListActivity.class));
           finish();
       }
       else
       {
           AlertDialogUtil.showAlertDialog(
                   this, getString(R.string.alert_no_internet_tit), getString(R.string.alert_no_internet_msg), Constants.ALERT_NO_INTERNET
           );
       }
    }

}