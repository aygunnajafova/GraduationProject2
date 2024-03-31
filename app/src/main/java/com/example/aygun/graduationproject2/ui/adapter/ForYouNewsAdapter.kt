package com.example.aygun.graduationproject2.ui.adapter

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.data.model.ForYouNewsModel
import com.example.aygun.graduationproject2.databinding.ForYouNewsItemBinding

class ForYouNewsAdapter : RecyclerView.Adapter<ForYouNewsAdapter.ForYouNewsItemViewHolder>() {
    private val newsModel = mutableListOf<ForYouNewsModel> (
        ForYouNewsModel(0,"Xəbərlər","#4d5bbd"),
        ForYouNewsModel(1,"Sığorta","#8a36b2"),
        ForYouNewsModel(2,"Tətbiqdə yeniliklər","#4d5bbd"),
        ForYouNewsModel(3,"Bilirdinizmi?","#4d5bbd"),
        ForYouNewsModel(4,"İnvestisiya xəbərləri","#4d5bbd"),
        ForYouNewsModel(5,"Partnyor endirimləri","#4d5bbd")
    )

    inner class ForYouNewsItemViewHolder(private val binding: ForYouNewsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ForYouNewsModel) {
            binding.tvForYouSpecialNewsItemTitle.text = item.title
            when(item.id) {
                //0 -> binding.viewForYouNewsItem.setBackgroundColor(binding.root.context.getColor(R.color.for_you_item4))
            }

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