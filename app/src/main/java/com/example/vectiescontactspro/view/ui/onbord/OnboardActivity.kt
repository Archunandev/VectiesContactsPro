package com.example.vectiescontactspro.view.ui.onbord

import android.app.ActivityOptions
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.vectiescontactspro.databinding.ActivityOnboardBinding
import com.example.vectiescontactspro.view.ui.dashboard.DashBordActivity
import com.example.vectiescontactspro.view.ui.login.SingnUpActivity
import com.example.vectiescontactspro.view.utils.Utils.Companion.openActivity


class OnboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        toolupBar()
        getNeeted()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setupWindowAnimations()
          //  setupWindowAnimations1()
        }

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupWindowAnimations() {
        val slide = Slide()
        slide.slideEdge = Gravity.START
        slide.duration = 400
        slide.interpolator = AccelerateDecelerateInterpolator()
       // window.exitTransition = slide
        window.enterTransition = slide
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupWindowAnimations1() {
        val slide = Slide()
        slide.slideEdge = Gravity.END
        slide.duration = 1000
        slide.interpolator = AccelerateDecelerateInterpolator()
        window.exitTransition = slide
       // window.enterTransition = slide
    }

    private fun getNeeted() {
        binding.getNeeded.setOnClickListener {
            openActivity(SingnUpActivity::class.java, this)
            // overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right)
        }
    }

    private fun toolupBar() {
        window?.decorView?.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = Color.TRANSPARENT
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}