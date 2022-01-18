package com.example.vectiescontactspro.view.ui.fragments.workersfrag

import android.os.Bundle
import android.transition.Slide
import android.util.Log
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.navArgs
import com.example.vectiescontactspro.databinding.FragmentWorkersListBinding


class WorkersListFragment : Fragment() {
    private lateinit var binding: FragmentWorkersListBinding
    private val args: WorkersListFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentWorkersListBinding.inflate(inflater,container,false)
        setUpCardBackground()
        return binding.root
    }

    private fun setUpCardBackground() {
        val slideUp: Animation = AnimationUtils.loadAnimation(
            context,
            com.example.vectiescontactspro.R.anim.view_gone_visible
        )
        val slide = Slide()
        slide.slideEdge = Gravity.START
        slide.duration = 400
        slide.interpolator = AccelerateDecelerateInterpolator()
        binding.firstList1.startAnimation(slideUp)
        binding.firstList2.startAnimation(slideUp)
        binding.firstList3.startAnimation(slideUp)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("TAG", "onViewCreated: ${args.workername}" )
    }

}