package com.example.myfadoul.aps001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Reader extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);


        WebView webView = (WebView)findViewById(R.id.webview1);


        Intent  data = getIntent();
        int page =data.getExtras().getInt("page");
        page++;
        webView.loadUrl("file:///android_asset/html/"+page+".html");


    }
}
