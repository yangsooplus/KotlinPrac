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


class ElementFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_element, container, false)

        val Cards = mutableListOf<String>()
        Cards.add("원기회복의 변형물")
        Cards.add("판다네 정령")
        Cards.add("녹아내린 바위")
        Cards.add("파티의 정령")
        Cards.add("매연정령")
        Cards.add("정지장 정령")
        Cards.add("파지직거리는 회오리")
        Cards.add("눈부신 빛의 정령")
        Cards.add("야생불 정령")
        Cards.add("재활용 망령")
        Cards.add("선술집 폭풍우")
        Cards.add("꼬마 라그")
        Cards.add("온화한 신령")


        val BeastRv = view.findViewById<RecyclerView>(R.id.elementRV)
        val rvAdapter = RVAdapter(Cards)
        BeastRv.adapter = rvAdapter
        BeastRv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.beastbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_elementFragment_to_beastFragment)
        }

        view.findViewById<ImageView>(R.id.devilbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_elementFragment_to_devilFragment)
        }

        view.findViewById<ImageView>(R.id.dragonbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_elementFragment_to_dragonFragment)
        }

        view.findViewById<ImageView>(R.id.mechabtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_elementFragment_to_mechaFragment)
        }

        view.findViewById<ImageView>(R.id.piratesbtn).setOnClickListener {
            it.findNavController().navigate(R.id.action_elementFragment_to_piratesFragment)
        }





        return view
    }

}