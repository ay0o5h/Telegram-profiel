package com.telegram_profile

import MyPagerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.telegram_profile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val tabLayout = binding.profileDetails.tabLayout
        val viewPager = binding.profileDetails.viewPager

        val adapter = MyPagerAdapter(supportFragmentManager)
        adapter.addFragment(MediaFragment(), "Media")
        adapter.addFragment(MusicFragment(), "Music")

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}