package com.yangsooplus.ollogbollog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Home_brandFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_brand, container, false)
    }

    fun newInstant() : Home_brandFragment{
        val args = Bundle()
        val frag = Home_brandFragment()
        frag.arguments = args
        return frag
    }

}