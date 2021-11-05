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

class MechaFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_mecha, container, false)

        val Cards = mutableListOf<String>()
        Cards.add("아기늑대로봇")
        Cards.add("초소형 미라")
        Cards.add("강철니 표범로봇")
        Cards.add("콰광로봇")
        Cards.add("허수아비골렘")
        Cards.add("깡통나사 고물로봇")
        Cards.add("반사로봇")
        Cards.add("증식하는 위협")
        Cards.add("기계보행전차")
        Cards.add("기계 알")
        Cards.add("기름 로봇")
        Cards.add("안녕모듈")
        Cards.add("천상의 기계멀록")
        Cards.add("전투 절단기 4000")
        Cards.add("오메가 섬멸로봇")

        val BeastRv = view.findViewById<RecyclerView>(R.id.mechaRV)
        val rvAdapter = RVAdapter(Cards)
        BeastRv.adapter = rvAdapter
        BeastRv.layoutManager = LinearLayoutManager(context)


        view.findViewById<ImageView>(R.id.beastbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_mechaFragment_to_beastFragment)
        }

        view.findViewById<ImageView>(R.id.devilbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_mechaFragment_to_devilFragment)
        }

        view.findViewById<ImageView>(R.id.dragonbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_mechaFragment_to_dragonFragment)
        }

        view.findViewById<ImageView>(R.id.elementbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_mechaFragment_to_elementFragment)
        }

        view.findViewById<ImageView>(R.id.piratesbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_mechaFragment_to_piratesFragment)
        }


        return view
    }

}