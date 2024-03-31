package com.example.aygun.graduationproject2.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.aygun.graduationproject2.ui.fragment.home.AccountsFragment
import com.example.aygun.graduationproject2.ui.fragment.home.CardsFragment
import com.example.aygun.graduationproject2.ui.fragment.home.CreditsFragment
import com.example.aygun.graduationproject2.ui.fragment.home.DepositsFragment

class HomeViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CardsFragment()
            1 -> AccountsFragment()
            2 -> CreditsFragment()
            3 -> DepositsFragment()

            else -> Fragment()
        }
    }



}