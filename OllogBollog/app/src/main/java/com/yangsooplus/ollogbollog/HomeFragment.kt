package com.yangsooplus.ollogbollog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

    //navigate 문제 발생시 global 이동
    //https://medium.com/harrythegreat/android-navigation-component-%EA%B0%9C%EB%85%90%EA%B3%BC-%ED%8A%9C%ED%86%A0%EB%A6%AC%EC%96%BC-1-5ac6ac081643
    //https://beomseok95.tistory.com/190
}