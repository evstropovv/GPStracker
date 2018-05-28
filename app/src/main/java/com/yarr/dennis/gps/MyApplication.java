package com.yarr.dennis.gps;

import android.app.Application;
import android.os.Environment;
import android.util.Log;
import java.io.IOException;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


    }

//    public  void tryToLog() {
//        if (isExternalStorageWritable()) {
//            try {
//                Process process = Runtime.getRuntime().exec("logcat -d");
//                process = Runtime.getRuntime().exec("logcat -f " + "/storage/emulated/0/" + "LoggingGPS.txt" + " *:S Log.d:D");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        } else if (isExternalStorageReadable()) {
//            // only readable S
//        } else {
//            // not accessible
//        }
//    }
//
//    /* Checks if external storage is available for read and write */
//
//    public boolean isExternalStorageWritable() {
//        String state = Environment.getExternalStorageState();
//        if (Environment.MEDIA_MOUNTED.equals(state)) {
//            return true;
//        }
//        return false;
//    }
//
//
//    /* Checks if external storage is available to at least read */
//
//    public boolean isExternalStorageReadable() {
//        String state = Environment.getExternalStorageState();
//        if (Environment.MEDIA_MOUNTED.equals(state) ||
//                Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
//            return true;
//        }
//        return false;
//
//    }
}
