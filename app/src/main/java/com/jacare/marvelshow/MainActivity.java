package com.jacare.marvelshow;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.preview_screen)protected WebView previewScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        startPreview();
    }

    protected void startPreview(){
        WebSettings webSettings = previewScreen.getSettings();
        webSettings.setJavaScriptEnabled(true);
        previewScreen.loadUrl("https://marvelapp.com/jdfej6");
    }

}
