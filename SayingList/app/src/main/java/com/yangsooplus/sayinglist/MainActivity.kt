package com.yangsooplus.sayinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ListView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.yangsooplus.sayinglist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var isDouble = false
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val SayingList = mutableListOf<String>() //문자열 리스트
        SayingList.add("열 길 물속은 알아도 한 길 사람 속은 모른다.")
        SayingList.add("호랑이 그리려다 고양이 그린다.")
        SayingList.add("사촌이 땅을 사면 배가 아프다")
        SayingList.add("아닌 밤중에 홍두깨.")
        SayingList.add("물이 깊어야 고기가 모인다.")
        SayingList.add("개구리 올챙이 적 생각 못 한다.")
        SayingList.add("첫술에 배부를까.")
        SayingList.add("빈대 잡으려고 초가삼간 태운다.")
        SayingList.add("우물 안 개구리.")
        SayingList.add("가루는 칠수록 고와지고, 말은 할수록 거칠어진다.")
        SayingList.add("쇠뿔은 단김에 빼라.")
        SayingList.add("모난 돌이 정 맞는다.")
        SayingList.add("쥐구멍에도 볕 들 날 있다.")
        SayingList.add("달도 차면 기운다.")
        SayingList.add("거미는 작아도 줄만 잘 친다.")
        SayingList.add("원님 덕에 나팔분다.")
        SayingList.add("급하면 바늘허리에 실 매어 쓸까?")


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSayingBtn.setOnClickListener {
            val intent = Intent(this, SayingActivity::class.java)
            startActivity(intent)
        }
        binding.SayingTextView.setText( SayingList.random())


        binding.ChangeSayingBtn.setOnClickListener {
            binding.SayingTextView.setText(SayingList.random())
        }
    }

    override fun onBackPressed() {

        if (isDouble) {
            finish()
        }
        else {
            isDouble = true
            Toast.makeText(this,  "뒤로가기 한 번 더 눌러 종료", Toast.LENGTH_LONG).show()

        }

        Handler().postDelayed({isDouble = false}, 2000) //2초 후 false로 설정
    }

}