package com.yangsooplus.myapplication

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.util.*

class MainActivity : AppCompatActivity() {

    val diaryModelList = mutableListOf<DiaryModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef = database.getReference("myDiary")

        val listview = findViewById<ListView>(R.id.mainListView)
        val list_adapter = ListAdapter(diaryModelList)
        listview.adapter = list_adapter

        myRef.child(Firebase.auth.currentUser!!.uid).addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                //snapshot이 모든 데이터 다 들고옴

                diaryModelList.clear()

                for (dirayModel in snapshot.children) {
                    //Log.d("Data", dirayModel.toString())
                    diaryModelList.add(dirayModel.getValue(DiaryModel::class.java)!!)
                }

                list_adapter.notifyDataSetChanged() //리스트뷰의 데이터 갱신
                Log.d("DataModel", diaryModelList.toString())
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })




        val writeButton = findViewById<ImageView>(R.id.writebtn)
        writeButton.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.dialogue, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("오늘의 일기")

            var dateText_database = ""

            val mAlertDialog = mBuilder.show()
            mAlertDialog.findViewById<Button>(R.id.SelectDateBtn)?.setOnClickListener {
                val today = GregorianCalendar()
                val year: Int = today.get(Calendar.YEAR)
                val month: Int = today.get(Calendar.MONTH)
                val date: Int = today.get(Calendar.DATE)

                val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener{
                    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
                        Log.d("Main","${year}, ${month+1},${dayOfMonth}")
                        mAlertDialog.findViewById<Button>(R.id.SelectDateBtn)?.setText("${year}/${month+1}/${dayOfMonth}")
                        dateText_database = "${year}/${month+1}/${dayOfMonth}"
                    }
                }, year, month, date)
                dlg.show()
            }


            val SaveBtn = mAlertDialog.findViewById<Button>(R.id.SaveBtn)
            SaveBtn?.setOnClickListener {

                val Memo = mAlertDialog.findViewById<EditText>(R.id.DiaryContext)?.text.toString()

                // Write a message to the database
                val diarymodel = DiaryModel(dateText_database, Memo)

                val database = Firebase.database
                val myRef = database.getReference("myDiary").child(Firebase.auth.currentUser!!.uid)

                myRef.push().setValue(diarymodel)

                mAlertDialog.dismiss()
            }

        }
    }
}