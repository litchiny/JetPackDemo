package com.litchiny.jetpackdemo.ui.fragment.bill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.litchiny.jetpackdemo.R

/**
 * A simple [Fragment] subclass.
 * Use the [BillFragment2Detail.newInstance] factory method to
 * create an instance of this fragment.
 */
class BillFragment2Detail : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bill_fragment2_detail, container, false)
    }

}