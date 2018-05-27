package com.yarr.dennis.gps;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootUpReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Log.d", "BootUpReceiver " + intent.getAction() );
        startServicee(context);
//        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
//            startServicee(context);
//        }
//        if ("android.intent.action.QUICKBOOT_POWERON".equals(intent.getAction())) {
//            startServicee(context);
//        }
//        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
//            startServicee(context);
//        }
//        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction())) {
//            startServicee(context);
//        }
//        if ("restartApps".equals(intent.getAction())) {
//            startServicee(context);
//        }

    }

    private void startServicee(Context context) {
        Log.d("Log.d", "startService from BootUpReceiver");
        Intent i = new Intent(context, GPSTracker.class);  //MyActivity can be anything which you want to start on bootup...
        i.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        // i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startService(i);
    }

}