package com.litchiny.jetpackdemo.ui.fragment.advanced

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
 * Use the [AdvancedFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class AdvancedFragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_advanced2, container, false)
        view.findViewById<Button>(R.id.btn_click).setOnClickListener {
            findNavController().navigate(R.id.action_advancedFragment2_to_advancedFragment2Detail)
        }
        return view
    }
}