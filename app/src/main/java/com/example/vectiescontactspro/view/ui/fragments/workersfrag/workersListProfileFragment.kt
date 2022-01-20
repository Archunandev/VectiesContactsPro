package com.example.vectiescontactspro.view.ui.fragments.workersfrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vectiescontactspro.databinding.FragmentWorkersListProfileBinding


class workersListProfileFragment : Fragment() {

    private lateinit var binding: FragmentWorkersListProfileBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentWorkersListProfileBinding.inflate(inflater, container, false)


        return binding.root
    }


}