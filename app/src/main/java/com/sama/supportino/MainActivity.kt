package com.sama.supportino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hk.kbottomnavigation.KBottomNavigation
import com.sama.supportino.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setMenuItem()

    }

    fun setMenuItem() {
        binding.menu.add(KBottomNavigation.Model(1, R.drawable.ic_chat__1_))
        binding.menu.add(KBottomNavigation.Model(2, R.drawable.ic_dashboard))
        binding.menu.add(KBottomNavigation.Model(3, R.drawable.ic_letter))
    }
}