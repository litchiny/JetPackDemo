package com.litchiny.jetpackdemo.ui.fragment.mine

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
 * Use the [MineFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class MineFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mine2, container, false)
        view.findViewById<Button>(R.id.btn_click).setOnClickListener {
            findNavController().navigate(R.id.action_mineFragment2_to_mineFragment2Detail)
        }
        return view
    }

}