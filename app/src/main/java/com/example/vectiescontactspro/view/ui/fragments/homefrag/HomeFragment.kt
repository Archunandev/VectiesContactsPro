package com.example.vectiescontactspro.view.ui.fragments.homefrag

import android.graphics.Color
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.vectiescontactspro.databinding.FragmentHomeBinding
import com.example.vectiescontactspro.model.hintName
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    var servicesArrayList: ArrayList<hintName> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

            setUpCardBackground()

        return binding.root

    }

    fun setUpCardBackground() {

        binding.workersCard.setOnClickListener {
            val slideUp: Animation = AnimationUtils.loadAnimation(
                context,
                com.example.vectiescontactspro.R.anim.view_gone_visible
            )
            val fadeout: Animation = AnimationUtils.loadAnimation(
                context,
                com.example.vectiescontactspro.R.anim.view_fate_out
            )
            binding.workersTxt.setTextColor(Color.WHITE)
            binding.emerTxt.setTextColor(Color.BLACK)
            binding.supportTxt.setTextColor(Color.BLACK)
            binding.workersCard.setCardBackgroundColor(resources.getColor(com.example.vectiescontactspro.R.color.primaryColor))
            binding.emerCard.setCardBackgroundColor(resources.getColor(com.example.vectiescontactspro.R.color.white))
            binding.supportCard.setCardBackgroundColor(resources.getColor(com.example.vectiescontactspro.R.color.white))
            binding.emerList1.visibility = View.GONE
            binding.emerList2.visibility = View.GONE
            binding.workersList1.visibility = View.VISIBLE
            binding.workersList2.visibility = View.VISIBLE
            binding.workersList1.startAnimation(slideUp)
            binding.workersList2.startAnimation(slideUp)
            binding.emerList1.startAnimation(fadeout)
            binding.emerList2.startAnimation(fadeout)
            binding.supportList1.visibility = View.GONE
            binding.supportList1.startAnimation(fadeout)

        }

        binding.emerCard.setOnClickListener {
            val slideUp: Animation = AnimationUtils.loadAnimation(
                context,
                com.example.vectiescontactspro.R.anim.view_gone_visible
            )
            val fadeout: Animation = AnimationUtils.loadAnimation(
                context,
                com.example.vectiescontactspro.R.anim.view_fate_out
            )
            binding.workersCard.setCardBackgroundColor(resources.getColor(com.example.vectiescontactspro.R.color.white))
            binding.emerCard.setCardBackgroundColor(resources.getColor(com.example.vectiescontactspro.R.color.primaryColor))
            binding.supportCard.setCardBackgroundColor(resources.getColor(com.example.vectiescontactspro.R.color.white))
            binding.workersList1.visibility = View.GONE
            binding.workersList2.visibility = View.GONE
            binding.emerList1.visibility = View.VISIBLE
            binding.emerList2.visibility = View.VISIBLE
            binding.workersTxt.setTextColor(Color.BLACK)
            binding.emerTxt.setTextColor(Color.WHITE)
            binding.supportTxt.setTextColor(Color.BLACK)
            binding.emerList1.startAnimation(slideUp)
            binding.emerList2.startAnimation(slideUp)
            binding.workersList1.startAnimation(fadeout)
            binding.workersList2.startAnimation(fadeout)
            binding.supportList1.visibility = View.GONE
            binding.supportList1.startAnimation(fadeout)
        }

        binding.supportCard.setOnClickListener {
            val slideUp: Animation = AnimationUtils.loadAnimation(
                context,
                com.example.vectiescontactspro.R.anim.view_gone_visible
            )
            val fadeout: Animation = AnimationUtils.loadAnimation(
                context,
                com.example.vectiescontactspro.R.anim.view_fate_out
            )
            binding.workersCard.setCardBackgroundColor(resources.getColor(com.example.vectiescontactspro.R.color.white))
            binding.emerCard.setCardBackgroundColor(resources.getColor(com.example.vectiescontactspro.R.color.white))
            binding.supportCard.setCardBackgroundColor(resources.getColor(com.example.vectiescontactspro.R.color.primaryColor))
            binding.workersList1.visibility = View.GONE
            binding.workersList2.visibility = View.GONE
            binding.emerList1.visibility = View.GONE
            binding.emerList2.visibility = View.GONE
            binding.supportList1.visibility = View.VISIBLE
            binding.workersTxt.setTextColor(Color.BLACK)
            binding.emerTxt.setTextColor(Color.BLACK)
            binding.supportTxt.setTextColor(Color.WHITE)
            binding.emerList1.startAnimation(fadeout)
            binding.emerList2.startAnimation(fadeout)
            binding.workersList1.startAnimation(fadeout)
            binding.workersList2.startAnimation(fadeout)
            binding.supportList1.startAnimation(slideUp)

        }

        binding.mechQuikAccess.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToWorkersListFragment("arjun")
            )

        }

    }


}