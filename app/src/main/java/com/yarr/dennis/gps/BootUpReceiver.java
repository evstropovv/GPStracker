package com.yarr.dennis.gps;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootUpReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        tryToStopService(context);
        startServicee(context);
    }

    private void tryToStopService(Context context){
        Intent intent = new Intent(context, GPSTracker.class);
        context.stopService(intent);
    }

    private void startServicee(Context context) {
        Intent i = new Intent(context, GPSTracker.class);
        i.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        context.startService(i);
    }
}