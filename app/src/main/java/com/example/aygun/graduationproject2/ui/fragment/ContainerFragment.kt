
package com.example.aygun.graduationproject2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.databinding.FragmentContainerBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class ContainerFragment : Fragment() {
    private lateinit var binding: FragmentContainerBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentContainerBinding.inflate(inflater,container,false)

        val containerNavHostFragment = childFragmentManager.findFragmentById(R.id.navHostContainer) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomNavContainer,containerNavHostFragment.navController)

        binding.ivNavigationBottomSheet.setOnClickListener {
            showBottomSheet()
        }

        return binding.root
    }

    private fun showBottomSheet() {
        val dialogView = layoutInflater.inflate(R.layout.fragment_bottom_sheet,null)
        val dialog = BottomSheetDialog(requireContext(),R.style.BottomSheetDialogTheme)
        dialog.setContentView(dialogView)
        dialog.show()
    }
}