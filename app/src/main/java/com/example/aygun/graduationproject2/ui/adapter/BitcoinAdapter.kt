package com.example.aygun.graduationproject2.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.data.model.BitcoinModel
import com.example.aygun.graduationproject2.databinding.BitcoinItemBinding

class BitcoinAdapter(val bitcoins: List<BitcoinModel>) : RecyclerView.Adapter<BitcoinAdapter.BitcoinItemViewHolder>() {

    inner class BitcoinItemViewHolder(val binding: BitcoinItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: BitcoinModel) {
            binding.tvBitcoinItemTitle.text = item.title + " •"
            binding.tvBitcoinItemSubtitle.text = item.info
            binding.tvBitcoinItemPercent.text = "-${item.percentage} %"
            Glide.with(binding.root)
                .load(item.image)
                .into(binding.ivBitcoinItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BitcoinItemViewHolder {
        val binding = BitcoinItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BitcoinItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return bitcoins.size
    }

    override fun onBindViewHolder(holder: BitcoinItemViewHolder, position: Int) {
        holder.bind(bitcoins[position])
    }
}