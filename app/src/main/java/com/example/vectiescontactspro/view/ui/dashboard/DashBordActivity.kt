package com.example.vectiescontactspro.view.ui.dashboard

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.transition.Slide
import android.view.Menu
import android.view.View
import android.widget.PopupMenu
import androidx.annotation.RequiresApi
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.vectiescontactspro.R
import com.example.vectiescontactspro.databinding.ActivityDashBordBinding
import com.example.vectiescontactspro.databinding.ActivityOnboardBinding

class DashBordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashBordBinding
    lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashBordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        toolupBar()
        setupBottomNav()

    }

    private fun setupBottomNav() {
        navController =
            (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment).navController
        binding.bottomNavigationView.setupWithNavController(navController = navController)

    }

    private fun toolupBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = Color.TRANSPARENT
        }
    }
}