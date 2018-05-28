package com.yarr.dennis.gps;

import android.app.Service;
import android.os.Environment;

import java.io.File;
import java.io.IOException;

public class LogManager {
    public static void tryToLog() {

        if (isExternalStorageWritable()) {
            File appDirectory = new File(Environment.getExternalStorageDirectory() + "");
            File logFile = new File(appDirectory, "LogggsGPS" +System.currentTimeMillis()+ Service".txt");
            // create app folder
            if (!appDirectory.exists()) {
                appDirectory.mkdir();
            }
            // clear the previous logcat and then write the new one to the file
            try {
                Process process = Runtime.getRuntime().exec("logcat -c");
                process = Runtime.getRuntime().exec("logcat -f " + logFile + " *:S Log.d:D");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (isExternalStorageReadable()) {
            // only readable
        } else {
            // not accessible
        }
    }

    /* Checks if external storage is available for read and write */

    public static boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }


    /* Checks if external storage is available to at least read */

    public static boolean isExternalStorageReadable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state) ||
                Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            return true;
        }
        return false;

    }
}