package com.yangsooplus.mangoplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class BookmarkActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private val contentModelList = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark)

        auth = Firebase.auth
        val database = Firebase.database
        val myRef = database.getReference("bookmark")

        val RecyclerView = findViewById<RecyclerView>(R.id.bookmarkRV)
        val RecyclerViewAdapter = RVAdapter(baseContext, contentModelList)
        RecyclerView.adapter = RecyclerViewAdapter
        RecyclerView.layoutManager = GridLayoutManager(this, 2)




        myRef
            .child(auth.currentUser!!.uid.toString())
            .addValueEventListener(object : ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot) {
                    for (dataModel in snapshot.children) { //database에 있는 ContensModel들 불러오기
                        contentModelList.add(dataModel.getValue(ContentsModel::class.java)!!)
                    }
                    RecyclerViewAdapter.notifyDataSetChanged()
                }

                override fun onCancelled(error: DatabaseError) {
                    Log.w("Bookmark", error.toException())
                }
            })

    }
}