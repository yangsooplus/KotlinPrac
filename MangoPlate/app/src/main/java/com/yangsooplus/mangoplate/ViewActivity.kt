package com.yangsooplus.mangoplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class ViewActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        auth = Firebase.auth

        val url = intent.getStringExtra("url").toString()
        val titleText = intent.getStringExtra("titleText").toString()
        val imageUrl = intent.getStringExtra("imageUrl").toString()


        val webView = findViewById<WebView>(R.id.WebView)
        webView.loadUrl(url)

        val SaveBookmark = findViewById<TextView>(R.id.SaveBookmark)


        // Write a message to the database
        val database = Firebase.database

        SaveBookmark.setOnClickListener {
            val myRef = database.getReference("bookmark")
            myRef
                .child(auth.currentUser!!.uid)
                .push()
                .setValue(ContentsModel(url, imageUrl, titleText))
        }



    }
}