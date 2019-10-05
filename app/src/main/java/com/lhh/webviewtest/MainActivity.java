package com.lhh.webviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.web_view);
        //webview的getSetings()方法可以去设置一些浏览器的属性，这里让webview支持JavaScript脚本
        //android9.0要加上  android:usesCleartextTraffic="true"才能显示
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.baidu.com");
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){


        }
    }
}
