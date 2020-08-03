package com.litchiny.jetpackdemo.ui.fragment.statistics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.litchiny.jetpackdemo.R

/**
 * A simple [Fragment] subclass.
 * Use the [StatisticsFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class StatisticsFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_statistics2, container, false)
        view.findViewById<Button>(R.id.btn_click).setOnClickListener {
            findNavController().navigate(R.id.action_statisticsFragment2_to_statisticsFragment2Detail)
        }
        return view
    }


}