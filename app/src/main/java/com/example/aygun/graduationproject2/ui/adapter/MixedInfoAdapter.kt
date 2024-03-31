package com.example.aygun.graduationproject2.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.data.model.MixedInfoModel
import com.example.aygun.graduationproject2.databinding.MixedInfoItemBinding

class MixedInfoAdapter(val list: List<MixedInfoModel>) : RecyclerView.Adapter<MixedInfoAdapter.MixedInfoItemViewHolder>() {

    inner class MixedInfoItemViewHolder(private val binding: MixedInfoItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MixedInfoModel,position: Int) {
            binding.tvMixedItemTitle.text = item.title
            binding.tvMixedItemSubtitle.text = item.subtitle
            when(position) {
                0 -> binding.ivMixedItem.setImageResource(R.drawable.cashbackicon)
                1 -> binding.ivMixedItem.setImageResource(R.drawable.edvicon)
                2 -> binding.ivMixedItem.setImageResource(R.drawable.milesicon)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MixedInfoItemViewHolder {
        val binding = MixedInfoItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MixedInfoItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MixedInfoItemViewHolder, position: Int) {
        holder.bind(list[position],position)
    }
}
