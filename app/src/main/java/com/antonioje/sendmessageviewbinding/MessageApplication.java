package com.antonioje.sendmessageviewbinding;

import android.app.Application;
import android.util.Log;
public class MessageApplication extends Application {
    public static final String TAG = "MessageApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"Message Application -> onCreate()");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG,"Message Application -> onCreate()");
    }
}
