package com.yangsooplus.heartstonebattlegroundcard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(val cards: MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        holder.bindItems(cards[position])
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    inner class ViewHolder(cardView : View) : RecyclerView.ViewHolder(cardView) {
        fun bindItems(item : String) {
            val cardtext = itemView.findViewById<TextView>(R.id.cardItemText)
            cardtext.text = item
        }
    }
}