package com.example.aygun.graduationproject2.ui.adapter

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.data.model.ForYouNewsModel
import com.example.aygun.graduationproject2.databinding.ForYouNewsItemBinding

class ForYouNewsAdapter(private val newsModel: List<ForYouNewsModel>) : RecyclerView.Adapter<ForYouNewsAdapter.ForYouNewsItemViewHolder>() {

    inner class ForYouNewsItemViewHolder(private val binding: ForYouNewsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ForYouNewsModel) {
            Glide.with(binding.root)
                .load(item.image)
                .into(binding.ivForYouNewsItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForYouNewsItemViewHolder {
        val binding = ForYouNewsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ForYouNewsItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return newsModel.size
    }

    override fun onBindViewHolder(holder: ForYouNewsItemViewHolder, position: Int) {
        holder.bind(newsModel[position])
    }
}