package com.example.aygun.graduationproject2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.databinding.FragmentHomeBinding
import com.example.aygun.graduationproject2.ui.adapter.HomeViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeViewPagerAdapter: HomeViewPagerAdapter
    private lateinit var homeViewPager: ViewPager2
    private lateinit var homeTabLayout: TabLayout
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTabLayout()
    }

    private fun setTabLayout() {
        homeViewPager = binding.viewPagerHome
        homeTabLayout = binding.tabLayoutHome
        homeViewPagerAdapter = HomeViewPagerAdapter(requireActivity().supportFragmentManager,lifecycle)
        homeViewPager.adapter = homeViewPagerAdapter

        TabLayoutMediator(homeTabLayout,homeViewPager) {tab, position ->
            when(position) {
                0 -> tab.text = "Kartlar"
                1 -> tab.text = "Hesablar"
                2 -> tab.text = "Kreditlər"
                3 -> tab.text = "Depozitlər"
            }
        }.attach()
    }
}