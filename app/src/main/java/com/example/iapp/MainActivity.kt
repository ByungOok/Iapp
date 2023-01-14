package com.example.iapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val tabTitleArray = arrayOf(
        "이야기방 전체",
        "인기글"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.viewpager
        val tabLayout = binding.tabLayout

        viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()
    }
}