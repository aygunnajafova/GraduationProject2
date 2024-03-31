package com.example.aygun.graduationproject2.ui.fragment.more

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.databinding.FragmentProfileAndParametersBinding

class ProfileAndParametersFragment : Fragment() {
    private lateinit var binding: FragmentProfileAndParametersBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentProfileAndParametersBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}