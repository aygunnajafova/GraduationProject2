package com.example.aygun.graduationproject2.ui.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.databinding.FragmentAccountsBinding

class AccountsFragment : Fragment() {
    private lateinit var binding: FragmentAccountsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAccountsBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}