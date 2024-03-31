package com.example.aygun.graduationproject2.ui.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.databinding.FragmentSingleCardBinding

class SingleCardFragment : Fragment() {
    private lateinit var binding: FragmentSingleCardBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSingleCardBinding.inflate(inflater,container,false)
        return binding.root
    }
}