package com.example.vectiescontactspro.view.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vectiescontactspro.databinding.ActivitySingnUpBinding

class SingnUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySingnUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingnUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}