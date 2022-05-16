package com.example.sao_nicolau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ScreenWebView extends AppCompatActivity {
    android.webkit.WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_web_view);

        webView1 = (android.webkit.WebView) findViewById(R.id.wv1);
        webView1.loadUrl("https://www.capeverde.co.uk/guide/sao-nicolau");

    }
}