package com.example.vectiescontactspro.view.ui.login

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.vectiescontactspro.R
import com.example.vectiescontactspro.databinding.ActivitySingnUpBinding

class SingnUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySingnUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingnUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.animationView1.playAnimation()
        binding.animationView2.playAnimation()
        binding.animationView3.playAnimation()
        topBar()

    }

    private fun topBar() {
        //  set status text dark
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}