package com.example.test.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.Dagger.BlockInfoPotion
import com.example.test.R

class BlockElixirAdapter(private val blockList: List<BlockInfoPotion>) :
    RecyclerView.Adapter<BlockElixirAdapter.BlockViewHolder>() {

    inner class BlockViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val blockTextView: TextView = itemView.findViewById(R.id.blockTextView)
        val infoTextView: TextView = itemView.findViewById(R.id.infoTextView)
        val newInfoTextView: TextView = itemView.findViewById(R.id.newInfoTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlockViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_block, parent, false)
        return BlockViewHolder(view)
    }

    override fun onBindViewHolder(holder: BlockViewHolder, position: Int) {
        val blockInfo = blockList[position]
        holder.blockTextView.text = blockInfo.name
        holder.infoTextView.text = blockInfo.effect
        holder.newInfoTextView.text = blockInfo.sideEffect
    }

    override fun getItemCount(): Int {
        return blockList.size
    }
}