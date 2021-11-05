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


class DragonFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_dragon, container, false)

        val Cards = mutableListOf<String>()
        Cards.add("새끼 붉은용")
        Cards.add("진화하는 오색날개")
        Cards.add("문양 수호자")
        Cards.add("청동 감시자")
        Cards.add("타렉고사")
        Cards.add("황혼의 사절")
        Cards.add("귀중한 고취비룡")
        Cards.add("용기병 집행자")
        Cards.add("푸른비늘혈족 맹독전사")
        Cards.add("프레스톨의 화염혈족")
        Cards.add("무르도즈노")
        Cards.add("폭군 서슬송곳니")
        Cards.add("비전의 위상 칼렉고스")


        val BeastRv = view.findViewById<RecyclerView>(R.id.dragonRV)
        val rvAdapter = RVAdapter(Cards)
        BeastRv.adapter = rvAdapter
        BeastRv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.beastbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_dragonFragment_to_beastFragment)
        }

        view.findViewById<ImageView>(R.id.devilbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_dragonFragment_to_devilFragment)
        }

        view.findViewById<ImageView>(R.id.elementbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_dragonFragment_to_elementFragment)
        }

        view.findViewById<ImageView>(R.id.mechabtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_dragonFragment_to_mechaFragment)
        }

        view.findViewById<ImageView>(R.id.piratesbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_dragonFragment_to_piratesFragment)
        }



        return view
    }

}