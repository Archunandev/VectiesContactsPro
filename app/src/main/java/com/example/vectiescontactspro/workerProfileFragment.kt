package com.example.vectiescontactspro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vectiescontactspro.databinding.FragmentWorkerProfileBinding


class workerProfileFragment : Fragment() {

    private lateinit var binding: FragmentWorkerProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWorkerProfileBinding.inflate(inflater,container,false)

        return binding.root
    }

}