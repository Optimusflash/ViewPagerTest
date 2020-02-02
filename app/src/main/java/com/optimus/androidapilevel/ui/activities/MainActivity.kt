package com.optimus.androidapilevel.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.optimus.androidapilevel.R
import com.optimus.androidapilevel.ui.adapters.ApiLevelPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        val apiLevelPagerAdapter = ApiLevelPagerAdapter(supportFragmentManager)
        view_pager.adapter = apiLevelPagerAdapter
        tab_layout.setupWithViewPager(view_pager)
    }
}
