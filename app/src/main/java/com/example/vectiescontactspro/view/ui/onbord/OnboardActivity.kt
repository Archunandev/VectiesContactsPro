package com.example.vectiescontactspro.view.ui.onbord

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.example.vectiescontactspro.R
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

    }

    private fun getNeeted() {

        binding.getNeeded.setOnClickListener {
            openActivity(SingnUpActivity::class.java, this)
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