package com.h5190007.barbaros_berk_gelenbe_final.utils;

import androidx.appcompat.app.AlertDialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;

import com.h5190007.barbaros_berk_gelenbe_final.R;

public class AlertDialogUtil {

    public static void showAlertDialog(Activity activity, String title, String message, int alertType) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(title);
        builder.setCancelable(false);
        builder.setMessage(message);
        switch (alertType) {
            case Constants.ALERT_NO_INTERNET:
                builder.setPositiveButton(activity.getString(R.string.alert_no_internet_posBtn), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        activity.startActivity(new Intent(Settings.ACTION_WIRELESS_SETTINGS));
                    }
                });
                builder.setNegativeButton(activity.getString(R.string.alert_no_internet_negBtn), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        activity.finish();
                    }
                });
                break;
            case Constants.ALERT_EXIT:
                builder.setPositiveButton(activity.getString(R.string.alert_exit_posBtn), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        activity.finish();
                    }
                });
                builder.setNegativeButton(activity.getString(R.string.alert_exit_negBtn), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                break;
        }
        builder.show();
    }

}
