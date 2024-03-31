package com.example.aygun.graduationproject2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.databinding.FragmentInvestmentBinding

class InvestmentFragment : Fragment() {
    private lateinit var binding: FragmentInvestmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentInvestmentBinding.inflate(inflater,container,false)
        return binding.root
    }
}