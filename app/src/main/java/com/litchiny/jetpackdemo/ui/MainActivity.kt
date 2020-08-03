package com.litchiny.jetpackdemo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.litchiny.jetpackdemo.R

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration:AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_fragment)
        //设置Toolbar与Navigation绑定
//        appBarConfiguration = AppBarConfiguration(navGraph = navController.graph)
//        setupActionBarWithNavController(navController,appBarConfiguration)

        findViewById<BottomNavigationView>(R.id.bottom_nav)
            .setupWithNavController(navController)
    }
}