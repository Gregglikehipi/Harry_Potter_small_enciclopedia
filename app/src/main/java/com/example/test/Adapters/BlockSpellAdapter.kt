package com.example.test.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.Dagger.BlockInfoSpell
import com.example.test.R

class BlockSpellAdapter(private val blockList: List<BlockInfoSpell>) :
    RecyclerView.Adapter<BlockSpellAdapter.BlockViewHolder>() {

    inner class BlockViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val blockTextView: TextView = itemView.findViewById(R.id.name)
        val infoTextView: TextView = itemView.findViewById(R.id.incantation)
        val newInfoTextView: TextView = itemView.findViewById(R.id.effect)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlockViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.spell_block, parent, false)
        return BlockViewHolder(view)
    }

    override fun onBindViewHolder(holder: BlockViewHolder, position: Int) {
        val blockInfo = blockList[position]
        holder.blockTextView.text = blockInfo.name
        holder.infoTextView.text = blockInfo.incantation
        holder.newInfoTextView.text = blockInfo.effect
    }

    override fun getItemCount(): Int {
        return blockList.size
    }
}