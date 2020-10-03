package com.salesforce.flutter.salesforcepluginexample;

import android.os.Bundle;

import androidx.annotation.NonNull;

import com.salesforce.androidsdk.app.SalesforceSDKManager;
import com.salesforce.flutter.ui.SalesforceFlutterActivity;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends SalesforceFlutterActivity {

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SalesforceSDKManager.initNative(getApplicationContext(), SalesforceFlutterActivity.class);
        super.onCreate(savedInstanceState);
    }
}


