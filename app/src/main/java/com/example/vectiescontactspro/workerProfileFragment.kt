package com.example.vectiescontactspro

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.vectiescontactspro.databinding.FragmentWorkerProfileBinding
import android.R
import android.annotation.SuppressLint
import android.os.CountDownTimer
import android.view.*


class workerProfileFragment : Fragment() {

    private lateinit var binding: FragmentWorkerProfileBinding
    private lateinit var cTimer: CountDownTimer
    private lateinit var dTimer: CountDownTimer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWorkerProfileBinding.inflate(inflater, container, false)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            requireActivity().window.setStatusBarColor(Color.parseColor("#2196f3"))
        }

        setRequest()
        return binding.root
    }

    private fun setRequest() {
        binding.btnRequest.setOnClickListener {
            binding.btnRequest.visibility = View.GONE
            binding.timerRequest.visibility = View.VISIBLE
            binding.btnNotRespondPhase1.visibility = View.VISIBLE
            startTimer()
        }
    }

    //start timer function
    private fun startTimer() {
        cTimer = object : CountDownTimer(30000, 1000) {
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                binding.timerRequest.text =
                    "0:${millisUntilFinished / 1000}"
                binding.btnNotRespondPhase1.visibility = View.VISIBLE

            }

            override fun onFinish() {
                binding.timerRequest.visibility = View.GONE
                binding.btnNotRespondPhase1.visibility = View.GONE
                binding.btnOrder.visibility = View.VISIBLE
                startTimer2()

            }
        }
        cTimer.start()
    }

    private fun startTimer2() {
        dTimer = object : CountDownTimer(30000, 1000) {
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                binding.timerRequest.visibility = View.VISIBLE
                binding.imgTimer.visibility = View.VISIBLE
                binding.btnOrder.visibility = View.VISIBLE
                binding.timerRequest.text =
                    "0:${millisUntilFinished / 1000}"

            }

            override fun onFinish() {
                binding.timerRequest.visibility = View.GONE
                binding.btnNotRespondPhase1.visibility = View.GONE
                binding.btnOrder.visibility = View.GONE

            }
        }
        dTimer.start()
    }

    //cancel timer
    private fun cancelTimer() {
        cTimer.cancel()
    }


}