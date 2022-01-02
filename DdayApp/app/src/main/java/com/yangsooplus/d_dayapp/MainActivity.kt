package com.yangsooplus.d_dayapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startbtn)
        val endButton = findViewById<Button>(R.id.endbtn)


        val calender_start = Calendar.getInstance()
        val calender_end = Calendar.getInstance()

        startButton.setOnClickListener {
            val today = GregorianCalendar()
            val year = today.get(Calendar.YEAR)
            val month = today.get(Calendar.MONTH)
            val day = today.get(Calendar.DATE)

            val DateDialog = DatePickerDialog(this, object: DatePickerDialog.OnDateSetListener{
                override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                    calender_start.set(year, month+1, dayOfMonth)
                }

            }, year, month, day)
            DateDialog.show()
        }

        endButton.setOnClickListener {
            val today = GregorianCalendar()
            val year = today.get(Calendar.YEAR)
            val month = today.get(Calendar.MONTH)
            val day = today.get(Calendar.DATE)

            val DateDialog = DatePickerDialog(this, object: DatePickerDialog.OnDateSetListener{
                override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                    calender_end.set(year, month+1, dayOfMonth)

                    val Dday = TimeUnit.MILLISECONDS.toDays(calender_end.timeInMillis - calender_start.timeInMillis)
                    findViewById<TextView>(R.id.CntDateText).setText(Dday.toString())
                }

            }, year, month, day)
            DateDialog.show()
        }
    }
}