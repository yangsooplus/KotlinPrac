package com.yangsooplus.mangoplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)



        val webView = findViewById<WebView>(R.id.WebView)
        webView.loadUrl(intent.getStringExtra("url").toString())
    }
}