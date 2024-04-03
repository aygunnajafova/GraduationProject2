package com.example.aygun.graduationproject2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.data.model.ForYouNewsModel
import com.example.aygun.graduationproject2.data.model.MixedInfoModel
import com.example.aygun.graduationproject2.databinding.FragmentForYouBinding
import com.example.aygun.graduationproject2.ui.adapter.ForYouNewsAdapter
import com.example.aygun.graduationproject2.ui.adapter.MixedInfoAdapter
import com.example.aygun.graduationproject2.ui.adapter.PartnersAdapter

class ForYouFragment : Fragment() {
    private lateinit var binding: FragmentForYouBinding
    private lateinit var newsAdapter: ForYouNewsAdapter
    private lateinit var mixedInfoAdapter: MixedInfoAdapter
    private lateinit var partnersAdapter: PartnersAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentForYouBinding.inflate(inflater,container,false)
        newsAdapter = ForYouNewsAdapter( mutableListOf(
            ForYouNewsModel(0,"Xəbərlər",R.drawable.news_img1),
            ForYouNewsModel(1,"Sığorta",R.drawable.news_img2),
            ForYouNewsModel(2,"Tətbiqdə yeniliklər",R.drawable.news_img3),
            ForYouNewsModel(3,"Bilirdinizmi?",R.drawable.news_img4),
            ForYouNewsModel(4,"İnvestisiya xəbərləri",R.drawable.news_img5),
            ForYouNewsModel(5,"Partnyor endirimləri",R.drawable.news_img6)
        ))
        binding.rvForYouNews.adapter = newsAdapter

        mixedInfoAdapter = MixedInfoAdapter(mutableListOf<MixedInfoModel>(
            MixedInfoModel(0,"Cashback","0.98 ₼",""),
            MixedInfoModel(1,"ƏDV","0 ₼",""),
            MixedInfoModel(2,"Miles","Sifariş et",""),
        ))
        binding.rvForYouMixedInfo.adapter = mixedInfoAdapter

        partnersAdapter = PartnersAdapter()
        binding.rvForYouPartners.adapter = partnersAdapter

        return binding.root
    }
}