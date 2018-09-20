package br.com.santander.santanderchallenge.util;

import android.util.Log;

public class Logger {
    private static final String TAG = "SantanderChallenge";

    public static void d(String msg) {
        Log.d(TAG, msg);
    }

    public static void e(String msg) {
        Log.e(TAG, msg);
    }

    public static void e(Throwable t) {
        Log.e(TAG, t.getMessage(), t);
    }
}
