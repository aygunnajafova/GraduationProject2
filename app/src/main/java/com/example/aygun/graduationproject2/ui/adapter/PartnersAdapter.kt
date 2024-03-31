package com.example.aygun.graduationproject2.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.databinding.PartnersItemBinding

class PartnersAdapter : RecyclerView.Adapter<PartnersAdapter.PartnersItemViewHolder>() {

    inner class PartnersItemViewHolder(private val binding: PartnersItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            when(position) {
                0 -> binding.ivPartnersItem.setImageResource(R.drawable.partnersimage)
                1 -> binding.ivPartnersItem.setImageResource(R.drawable.partnersimage2)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PartnersItemViewHolder {
        val binding = PartnersItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PartnersItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 2
    }

    override fun onBindViewHolder(holder: PartnersItemViewHolder, position: Int) {
        holder.bind(position)
    }
}