package com.example.med_amine.android_app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Med-Amine on 12/02/2016.
 */
public class Navigator extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator);
        String webSite=getIntent().getStringExtra("WebSite");
        WebView mywebView=(WebView) findViewById(R.id.webView);
        WebSettings setting = mywebView.getSettings();
        setting.setJavaScriptEnabled(true);
        mywebView.loadUrl(webSite);
    }
}
