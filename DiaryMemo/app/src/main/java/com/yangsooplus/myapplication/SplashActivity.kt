package com.yangsooplus.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import java.lang.Exception

class SplashActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        auth = Firebase.auth

        try {
            Log.d("Splash", auth.currentUser!!.uid)
            Toast.makeText(this, "현재 로그인이 되어있습니다", Toast.LENGTH_LONG).show()
            //스플래시 출력 후 전환
            Handler().postDelayed(
                {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }, 3000)

        } catch (e: Exception) {
            Log.d("Splash", "회원가입 필요")

            auth.signInAnonymously()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "비회원 로그인 성공", Toast.LENGTH_LONG).show()

                        //로그인 후 전환
                        Handler().postDelayed(
                            {
                                startActivity(Intent(this, MainActivity::class.java))
                                finish()
                            }, 3000)

                    } else {
                        Toast.makeText(this, "비회원 로그인 실패", Toast.LENGTH_LONG).show()
                    }
                }
        }





    }
}