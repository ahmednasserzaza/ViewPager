package com.fighter.viewpager.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.CompositePageTransformer
import com.fighter.viewpager.databinding.ActivityMainBinding
import com.fighter.viewpager.ui.adapters.HomePagerAdapter
import com.fighter.viewpager.ui.fragments.PersonalFragment
import com.fighter.viewpager.ui.fragments.TeamFragment
import com.fighter.viewpager.ui.fragments.ThirdFragment
import com.google.android.material.tabs.TabLayout
import kotlin.math.abs


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var homeViewPagerAdapter: HomePagerAdapter
    private lateinit var fragmentList: List<Fragment>
    private val personalFragment = PersonalFragment()
    private val teamFragment = TeamFragment()
    private val thirdFragment = ThirdFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fragmentList = listOf(personalFragment , teamFragment , thirdFragment)

        initTabLayout()
        initViewPager()

    }


    private fun setUpTransformer() {
        val transformer = CompositePageTransformer()
        transformer.addTransformer { page, position ->
            val r = 1 - abs(position)
            page.scaleY = 0.85f + r * 0.14f
        }
        binding.personalViewPager.setPageTransformer(transformer)
    }


    private fun initTabLayout() {
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Tab ${tab?.text}", Toast.LENGTH_SHORT).show()
                initViewPager()
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    private fun initViewPager() {
        homeViewPagerAdapter = HomePagerAdapter(this, fragmentList)
        binding.personalViewPager.adapter = homeViewPagerAdapter
        binding.personalViewPager.offscreenPageLimit = 3
        setUpTransformer()
    }

}
