package com.yangsooplus.ollogbollog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Home_saleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_sale, container, false)
    }

    fun newInstant() : Home_saleFragment{
        val args = Bundle()
        val frag = Home_saleFragment()
        frag.arguments = args
        return frag
    }
}