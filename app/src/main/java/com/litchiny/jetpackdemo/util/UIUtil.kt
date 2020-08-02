package com.litchiny.jetpackdemo.util

import android.view.View
import android.widget.Button
import androidx.navigation.Navigation
import com.litchiny.jetpackdemo.R

object UIUtil {

    fun updateBottomNavigation(view:View){
        view.findViewById<Button>(R.id.btn_satis).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_global_statisticsFragment)
        }
        view.findViewById<Button>(R.id.btn_advanced).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_global_advancedFragment)
        }
        view.findViewById<Button>(R.id.btn_mine).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_global_mineFragment)
        }
        view.findViewById<Button>(R.id.btn_bill).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_global_billFragment)
        }
    }
}