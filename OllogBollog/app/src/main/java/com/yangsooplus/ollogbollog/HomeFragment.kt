package com.yangsooplus.ollogbollog

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val tab_viewpager = view.findViewById<ViewPager>(R.id.home_tab_viewpage)
        tab_viewpager!!.adapter = PagerAdapter(childFragmentManager)
        tab_viewpager!!.currentItem = 0

        val tabLayout = view.findViewById<View>(R.id.home_tab_layout) as TabLayout
        tabLayout.setupWithViewPager(tab_viewpager)

        tabLayout.getTabAt(0)!!.text = "홈"
        tabLayout.getTabAt(1)!!.text = "Brand"
        tabLayout.getTabAt(2)!!.text = "베스트"
        tabLayout.getTabAt(3)!!.text = "세일"

        tabLayout.setTabTextColors(Color.GRAY, Color.BLACK)
        tabLayout.setSelectedTabIndicatorColor(Color.BLACK)

        tab_viewpager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab!!.select()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }


        })


        return view
    }


    inner class PagerAdapter(childFragmentManager: FragmentManager) :
        FragmentStatePagerAdapter(childFragmentManager) {
        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> Home_homeFragment()
                1 -> Home_brandFragment()
                2 -> Home_bestFragment()
                3 -> Home_saleFragment()
                else -> Home_homeFragment()
            }
        }

        override fun getCount(): Int = 4
    }

}


    //이거 하고 있었음
    //https://korean-otter.tistory.com/entry/android-kotlin-TabLayout%EA%B3%BC-ViewPager%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0


    //navigate 문제 발생시 global 이동
    //https://medium.com/harrythegreat/android-navigation-component-%EA%B0%9C%EB%85%90%EA%B3%BC-%ED%8A%9C%ED%86%A0%EB%A6%AC%EC%96%BC-1-5ac6ac081643
    //https://beomseok95.tistory.com/190
