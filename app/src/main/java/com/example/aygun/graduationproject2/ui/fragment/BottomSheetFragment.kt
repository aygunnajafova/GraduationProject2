package com.example.aygun.graduationproject2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class BottomSheetFragment : Fragment() {
    private lateinit var binding: FragmentBottomSheetBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBottomSheetBinding.inflate(inflater,container,false)
        return binding.root
    }

    /*fun showBottomSheet() {
        val dialogView = layoutInflater.inflate(R.layout.fragment_bottom_sheet,null)
        val dialog = BottomSheetDialog(requireContext(),R.style.BottomSheetDialogTheme)
        dialog.setContentView(dialogView)
    }*/
}