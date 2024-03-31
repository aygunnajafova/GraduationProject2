package com.example.aygun.graduationproject2.ui.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.databinding.FragmentCardsBinding

class CardsFragment : Fragment() {
    private lateinit var binding: FragmentCardsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCardsBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}