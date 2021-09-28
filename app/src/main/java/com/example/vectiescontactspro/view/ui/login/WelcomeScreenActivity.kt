package com.example.vectiescontactspro.view.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vectiescontactspro.R
import com.example.vectiescontactspro.databinding.ActivityWelcomeScreenBinding

class WelcomeScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}