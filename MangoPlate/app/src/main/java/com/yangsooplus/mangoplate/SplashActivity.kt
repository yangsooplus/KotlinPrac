package com.yangsooplus.mangoplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SplashActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        auth = Firebase.auth

        if (auth.currentUser?.uid == null) { //회원가입X -> JoinActivity로
            Handler().postDelayed({startActivity(Intent(this, JoinActivity::class.java))
                finish()}, 2500)
        }
        else { //회원가입O -> MainActivity
            Handler().postDelayed({startActivity(Intent(this, MainActivity::class.java))
                finish()}, 2500)

        }


    }
}