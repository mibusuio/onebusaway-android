package org.onebusaway.android;

/**
 * Created by f3r10 on 5/3/17.
 */

public class HelloFragment extends ReactNativeFragment {

    public static final String TAG = "HelloFragment";

    public static HelloFragment newInstance() {
        return new HelloFragment();
    }

    @Override
    public String getMainComponentName() {
        return "HelloWorld";
    }
}
