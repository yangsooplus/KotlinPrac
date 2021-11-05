package com.yangsooplus.heartstonebattlegroundcard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class PiratesFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_pirates, container, false)

        val Cards = mutableListOf<String>()
        Cards.add("갑판 청소부")
        Cards.add("뱃사람")
        Cards.add("남쪽바다 선장")
        Cards.add("선상 도박꾼")
        Cards.add("요호우거")
        Cards.add("남쪽바다 폭력배")
        Cards.add("바다의 노략꾼")
        Cards.add("짠내 나는 밀수꾼")
        Cards.add("선장 으르렁니")
        Cards.add("허드렛일 약골")
        Cards.add("황금 애호가")
        Cards.add("선장 들창코")
        Cards.add("쌍엄니 토니")
        Cards.add("공포의 제독 엘리자")
        Cards.add("참견쟁이 노략꾼")


        val BeastRv = view.findViewById<RecyclerView>(R.id.piratesRV)
        val rvAdapter = RVAdapter(Cards)
        BeastRv.adapter = rvAdapter
        BeastRv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.beastbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_piratesFragment_to_beastFragment)
        }

        view.findViewById<ImageView>(R.id.devilbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_piratesFragment_to_devilFragment)
        }

        view.findViewById<ImageView>(R.id.dragonbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_piratesFragment_to_dragonFragment)
        }

        view.findViewById<ImageView>(R.id.elementbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_piratesFragment_to_elementFragment)
        }

        view.findViewById<ImageView>(R.id.mechabtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_piratesFragment_to_mechaFragment)
        }



        return view
    }

}