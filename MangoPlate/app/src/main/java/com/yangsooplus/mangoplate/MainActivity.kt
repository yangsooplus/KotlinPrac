package com.yangsooplus.mangoplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val itemList = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        itemList.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/L0_DP3NYGftr",
                "https://mp-seoul-image-production-s3.mangoplate.com/619788_1614148920163787.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80",
                "랜디스도넛 연남점"
            )
        )

        itemList.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/I8D_OUKXpiVQ",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/535867_1490107376542571.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80",
                "올드페리도넛"
            )
        )

        itemList.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/euMIlY61D6",
                "https://mp-seoul-image-production-s3.mangoplate.com/777980_1577643725940914.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80",
                "구법원"
            )
        )

        itemList.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/R1Xmc21-BsXx",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/50507_1474195571408699.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80",
                "더달다"
            )
        )

        itemList.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/MM6N9q_9i2-F",
                "https://mp-seoul-image-production-s3.mangoplate.com/412085/26737_1612938370449_18906?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80",
                "베리도넛"
            )
        )

        itemList.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/6Oxpnt_ojLJ1",
                "https://mp-seoul-image-production-s3.mangoplate.com/957883_1639210216783150.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80",
                "도넛정수"
            )
        )

        itemList.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/JluFhPWWdl_5",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/495395_1487228029562118.jpg?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80",
                "Stans Donuts"
            )
        )

        itemList.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/4gnWyB-Oy8Pg",
                "https://mp-seoul-image-production-s3.mangoplate.com/472598/1656652_1636973939635_36102?fit=around|359:240&crop=359:240;*,*&output-format=jpg&output-quality=80",
                "오예에도넛"
            )
        )

        val RecyclerView = findViewById<RecyclerView>(R.id.RV)
        val RecyclerViewAdapter = RVAdapter(baseContext, itemList)
        RecyclerView.adapter = RecyclerViewAdapter

        RecyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}