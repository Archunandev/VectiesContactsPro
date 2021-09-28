package com.example.vectiescontactspro.view.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import com.example.vectiescontactspro.databinding.ActivitySplashBinding
import com.example.vectiescontactspro.view.ui.login.SignInActivity
import com.example.vectiescontactspro.view.ui.login.SingnUpActivity
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
        val actionBar: ActionBar? = supportActionBar
        if (actionBar != null) actionBar.hide()
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LOW_PROFILE
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
        Handler().postDelayed(
            {
                openActivity(OnboardActivity::class.java, this) {}

            }, 2000
        )
    }
}