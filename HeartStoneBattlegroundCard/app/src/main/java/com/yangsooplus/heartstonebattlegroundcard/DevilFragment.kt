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


class DevilFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_devil, container, false)

        val Cards = mutableListOf<String>()
        Cards.add("성가신 임프")
        Cards.add("충동적인 마귀")
        Cards.add("나스레짐 감독관")
        Cards.add("악마 간수")
        Cards.add("영혼 포식자")
        Cards.add("카트라나티르")
        Cards.add("거대불악마")
        Cards.add("고리 조련사")
        Cards.add("공허 군주")
        Cards.add("아나이힐란 전투모병관")
        Cards.add("허기진 우르줄")
        Cards.add("굶주린 지옥박쥐")
        Cards.add("어미 임프")


        val BeastRv = view.findViewById<RecyclerView>(R.id.devilRV)
        val rvAdapter = RVAdapter(Cards)
        BeastRv.adapter = rvAdapter
        BeastRv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.beastbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_devilFragment_to_beastFragment)
        }

        view.findViewById<ImageView>(R.id.dragonbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_devilFragment_to_dragonFragment)
        }

        view.findViewById<ImageView>(R.id.elementbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_devilFragment_to_elementFragment)
        }

        view.findViewById<ImageView>(R.id.mechabtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_devilFragment_to_mechaFragment)
        }

        view.findViewById<ImageView>(R.id.piratesbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_devilFragment_to_piratesFragment)
        }


        return view
    }



}