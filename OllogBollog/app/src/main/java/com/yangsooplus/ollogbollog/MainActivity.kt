package com.yangsooplus.ollogbollog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_host_fragment)
        val main_bottom_navigation = findViewById<BottomNavigationView>(R.id.main_bottom_navigation)


        NavigationUI.setupWithNavController(main_bottom_navigation, navController)
    }

}