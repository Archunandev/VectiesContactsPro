package com.example.vectiescontactspro.view.ui.onbord

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vectiescontactspro.databinding.ActivityOnboardBinding

class OnboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}