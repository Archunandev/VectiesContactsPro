package com.example.vectiescontactspro.view.ui.login

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.transition.Slide
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.example.vectiescontactspro.R
import com.example.vectiescontactspro.databinding.ActivitySingnUpBinding
import com.example.vectiescontactspro.view.ui.dashboard.DashBordActivity
import com.example.vectiescontactspro.view.utils.Utils.Companion.openActivity

class SingnUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySingnUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingnUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        toolupBar()
        sendotp()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setupWindowAnimations1()
            //  setupWindowAnimations2()
        }

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupWindowAnimations1() {
        val slide = Slide()
        slide.slideEdge = Gravity.START
        slide.duration = 400
        slide.interpolator = AccelerateDecelerateInterpolator()
        // window.exitTransition = slide
        window.enterTransition = slide
    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupWindowAnimations2() {
        val slide = Slide()
        slide.slideEdge = Gravity.END
        slide.duration = 400
        slide.interpolator = AccelerateDecelerateInterpolator()
        window.exitTransition = slide
        //  window.enterTransition = slide
    }


    private fun sendotp() {
        binding.sendOtp.setOnClickListener {
            openActivity(DashBordActivity::class.java, this)
            //  overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right)
        }
    }

    private fun toolupBar() {
        window?.decorView?.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = Color.TRANSPARENT
        }
    }

}