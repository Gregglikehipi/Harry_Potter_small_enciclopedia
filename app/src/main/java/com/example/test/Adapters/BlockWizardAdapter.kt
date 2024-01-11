package com.example.test.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.Dagger.BlockInfoWizard
import com.example.test.R

class BlockWizardAdapter(private val blockList: List<BlockInfoWizard>) :
    RecyclerView.Adapter<BlockWizardAdapter.BlockViewHolder>() {

    inner class BlockViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val blockTextView: TextView = itemView.findViewById(R.id.firstname)
        val infoTextView: TextView = itemView.findViewById(R.id.lastname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlockViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.wizard_block, parent, false)
        return BlockViewHolder(view)
    }

    override fun onBindViewHolder(holder: BlockViewHolder, position: Int) {
        val blockInfo = blockList[position]
        holder.blockTextView.text = blockInfo.name
        holder.infoTextView.text = blockInfo.lastname
    }

    override fun getItemCount(): Int {
        return blockList.size
    }
}