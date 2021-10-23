package com.yangsooplus.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.yangsooplus.diceapp.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceImg1 = binding.dice1
        val diceImg2 = binding.dice2

        binding.RollButton.setOnClickListener {
            Toast.makeText(this, "ROLLING...", Toast.LENGTH_SHORT).show()

            //Log.d("MainActivity", Random.nextInt(1, 7).toString())

            val num1 = Random.nextInt(1, 7)
            val num2 = Random.nextInt(1, 7)

            if (num1 == 1) {
                diceImg1.setImageResource(R.drawable.dice_1)
            }
            else if (num1 == 2) {
                diceImg1.setImageResource(R.drawable.dice_2)
            }
            else if (num1 == 3) {
                diceImg1.setImageResource(R.drawable.dice_3)
            }
            else if (num1 == 4) {
                diceImg1.setImageResource(R.drawable.dice_4)
            }
            else if (num1 == 5) {
                diceImg1.setImageResource(R.drawable.dice_5)
            }
            else if (num1 == 6) {
                diceImg1.setImageResource(R.drawable.dice_6)
            }

            if (num2 == 1) {
                diceImg2.setImageResource(R.drawable.dice_1)
            }
            else if (num2 == 2) {
                diceImg2.setImageResource(R.drawable.dice_2)
            }
            else if (num2 == 3) {
                diceImg2.setImageResource(R.drawable.dice_3)
            }
            else if (num2 == 4) {
                diceImg2.setImageResource(R.drawable.dice_4)
            }
            else if (num2 == 5) {
                diceImg2.setImageResource(R.drawable.dice_5)
            }
            else if (num2 == 6) {
                diceImg2.setImageResource(R.drawable.dice_6)
            }

        }

    }
}