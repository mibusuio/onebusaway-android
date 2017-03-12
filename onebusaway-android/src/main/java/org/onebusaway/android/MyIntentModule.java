package org.onebusaway.android;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

import org.onebusaway.android.ui.HomeActivity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by f3r10 on 11/3/17.
 */


public class MyIntentModule extends ReactContextBaseJavaModule {

    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";


    public MyIntentModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Log.d("MyIntentModule", "MyIntentModule");
    }

    @Override public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put(DURATION_SHORT_KEY, 1);
        constants.put(DURATION_LONG_KEY, 2);
        return constants;
    }

    @Override
    public String getName() {
        return "MyIntent";
    }

    @ReactMethod
    public void callIntent(String screen){
        Log.d("MyIntentModule", "screen " + screen);
        Activity currentActivity = getCurrentActivity();
        Intent intent = MyReactActivity.makeIntent(currentActivity);
        currentActivity.startActivity(intent);
    }
}
