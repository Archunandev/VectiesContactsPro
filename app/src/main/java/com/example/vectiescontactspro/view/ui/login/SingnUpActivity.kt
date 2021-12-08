package com.example.vectiescontactspro.view.ui.login

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
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

    }

    private fun sendotp() {
        binding.sendOtp.setOnClickListener {
            openActivity(DashBordActivity::class.java, this)
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