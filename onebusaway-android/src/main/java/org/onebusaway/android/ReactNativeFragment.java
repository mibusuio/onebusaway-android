package org.onebusaway.android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.shell.MainReactPackage;

import org.onebusaway.android.app.Application;

import static com.facebook.react.common.ApplicationHolder.getApplication;

/**
 * Created by f3r10 on 5/3/17.
 */

public abstract class ReactNativeFragment extends Fragment  {

private ReactRootView mReactRootView;
private ReactInstanceManager mReactInstanceManager;

// This method returns the name of our top-level component to show
public abstract String getMainComponentName();

    @Override
    public void onAttach(Context context) {
            super.onAttach(context);
            mReactRootView = new ReactRootView(context);
            mReactInstanceManager =
            ((Application) getActivity().getApplication())
            .getReactNativeHost()
            .getReactInstanceManager();

            }

    @Override
    public ReactRootView onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            return mReactRootView;
            }


@Override
public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mReactRootView.startReactApplication(
        mReactInstanceManager,
        getMainComponentName(),
        null
        );
        }




}
