package com.example.vectiescontactspro.view.ui.fragments.workersfrag

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.vectiescontactspro.R
import com.example.vectiescontactspro.databinding.FragmentWorkersListProfileBinding


class workersListProfileFragment : Fragment() {

    private lateinit var binding: FragmentWorkersListProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentWorkersListProfileBinding.inflate(inflater, container, false)

        setupnavigate()
        return binding.root
    }

    private fun setupnavigate() {
        binding.backOnMecProfile.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.workerProfileClick.setOnClickListener {
            findNavController().navigate(R.id.action_workersListProfileFragment_to_workerProfileFragment)
        }
    }

    override fun onResume() {
        super.onResume()
        toolupBar()
    }

    private fun toolupBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            requireActivity().window.setStatusBarColor(Color.TRANSPARENT)
        }
    }


}