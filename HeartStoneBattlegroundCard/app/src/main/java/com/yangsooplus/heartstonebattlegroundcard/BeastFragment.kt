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


class BeastFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_beast, container, false)

        val Cards = mutableListOf<String>()
        Cards.add("길고양이")
        Cards.add("청소부 하이에나")
        Cards.add("광적인 사우로리스크")
        Cards.add("폴짝개구리")
        Cards.add("하수도 쥐")
        Cards.add("괴물 앵무")
        Cards.add("쥐 떼")
        Cards.add("동굴 히드라")
        Cards.add("사바나 사자")
        Cards.add("되살리는 방울뱀")
        Cards.add("엄마 곰")
        Cards.add("하얀비늘 악어")
        Cards.add("맥스나")
        Cards.add("섬뜩한 방울뱀")
        Cards.add("위대한 늑대 골드린")

        val BeastRv = view.findViewById<RecyclerView>(R.id.beastRV)
        val rvAdapter = RVAdapter(Cards)
        BeastRv.adapter = rvAdapter
        BeastRv.layoutManager = LinearLayoutManager(context)



        view.findViewById<ImageView>(R.id.devilbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_beastFragment_to_devilFragment)
        }

        view.findViewById<ImageView>(R.id.dragonbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_beastFragment_to_dragonFragment)
        }

        view.findViewById<ImageView>(R.id.elementbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_beastFragment_to_elementFragment)
        }

        view.findViewById<ImageView>(R.id.mechabtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_beastFragment_to_mechaFragment)
        }

        view.findViewById<ImageView>(R.id.piratesbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_beastFragment_to_piratesFragment)
        }

        return view
    }

}