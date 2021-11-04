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

        val SayingList = mutableListOf<ListViewModel>() //문자열 리스트
        SayingList.add(ListViewModel("열 길 물속은 알아도 한 길 사람 속은 모른다.",
            "아무리 깊은 물이라도 그 깊이를 헤아릴 수 있지만 사람의 속마음은 도무지 알 수 없다."))
        SayingList.add(ListViewModel("호랑이 그리려다 고양이 그린다.",
            "자신의 능력에 어울리지 않게 너무 큰 욕심을 부리다 보면 세웠던 목적을 이루지 못하고 엉뚱한 결과를 초래한다."))
        SayingList.add(ListViewModel("사촌이 땅을 사면 배가 아프다.",
            "가까운 사람이 잘 되는 것을 기뻐해 주지는 않고 오히려 질투하고 시기하는 경우"))
        SayingList.add(ListViewModel("아닌 밤중에 홍두깨.",
            "느닷없는 일을 당했다."))
        SayingList.add(ListViewModel("물이 깊어야 고기가 모인다.",
            "큰 덕망이 있어야 남이 따르게 된다."))
        SayingList.add(ListViewModel("개구리 올챙이 적 생각 못 한다.",
            "형편이나 사정이 전에 비하여 나아진 사람이 지난날의 미천하거나 가난하던 때의 일을 생각지 아니하고 처음부터 잘난 체 뽐냄"))
        SayingList.add(ListViewModel("첫술에 배부를까.",
            "첫 번부터 곧 만족할 수 없으니, 급히 서두른다고 되는 것은 아니다."))
        SayingList.add(ListViewModel("빈대 잡으려고 초가삼간 태운다.",
            "손해를 크게 볼 것을 생각지 아니하고 자기에게 마땅치 아니한 것을 없애려고 그저 덤비기만 한다."))
        SayingList.add(ListViewModel("우물 안 개구리.",
            "넓은 세상을 알지 못하고 저만 잘난 줄로 아는 사람"))
        SayingList.add(ListViewModel("가루는 칠수록 고와지고, 말은 할수록 거칠어진다.",
            "가루는 체에 칠수록 고와지지만 말은 이 입에서 저 입으로 담을수록 마침내는 말다툼까지 가게 되니 말을 삼가라."))
        SayingList.add(ListViewModel("쇠뿔은 단김에 빼라.",
            "든든히 박힌 소의 뿔을 뽑으려면 달아올랐을 때 빼야 한다는 뜻으로, 무엇이든지 마음먹었으면 망설이지 말고 끝을 맺어야 된다."))
        SayingList.add(ListViewModel("모난 돌이 정 맞는다.",
            "두각을 나타내는 사람이 남에게 미움을 받는다는 말로 너무 강직한 사람이 남에게 공박을 받는다."))
        SayingList.add(ListViewModel("쥐구멍에도 볕 들 날 있다.",
            "쥐구멍은 작은 구멍이라 항상 어둡지만 가끔은 햇빛이 비칠 날이 있듯이, 몹시 고생을 하는 삶도 좋은 때가 있다."))
        SayingList.add(ListViewModel("달도 차면 기운다.",
            "세상의 온갖 것이 한번 번성하면 다시 쇠하기 마련."))
        SayingList.add(ListViewModel("거미는 작아도 줄만 잘 친다.",
            "모양은 비록 작아도 제 할 일은 다 한다."))
        SayingList.add(ListViewModel("원님 덕에 나팔분다.",
            "남의 덕으로 분에 넘치는 대접을 받았음."))
        SayingList.add(ListViewModel("급하면 바늘허리에 실 매어 쓸까?",
            "아무리 급하더라도 모든 일에는 일정한 차례와 순서를 밟아야 함."))




        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSayingBtn.setOnClickListener {
            val intent = Intent(this, SayingActivity::class.java)
            startActivity(intent)
        }
        binding.SayingTextView.setText( SayingList.random().Saying)


        binding.ChangeSayingBtn.setOnClickListener {
            binding.SayingTextView.setText(SayingList.random().Saying)
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