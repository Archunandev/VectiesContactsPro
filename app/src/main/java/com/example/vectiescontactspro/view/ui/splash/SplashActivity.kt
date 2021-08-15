package com.example.vectiescontactspro.view.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.example.vectiescontactspro.databinding.ActivitySplashBinding
import com.example.vectiescontactspro.view.ui.onbord.OnboardActivity
import com.example.vectiescontactspro.view.utils.Utils
import com.example.vectiescontactspro.view.utils.Utils.Companion.openActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler().postDelayed(
            {
                openActivity(OnboardActivity::class.java, this) {}

            }, 2000
        )
    }
}