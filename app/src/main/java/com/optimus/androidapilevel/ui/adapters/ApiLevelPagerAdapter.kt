package com.optimus.androidapilevel.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.optimus.androidapilevel.ui.fragments.ApiLevelFragment
import com.optimus.androidapilevel.utils.DataGenerator

/**
 * Created by Dmitriy Chebotar on 30.01.2020.
 */

class ApiLevelPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    private val levelsList = DataGenerator.generateAndroidApiLevels()

    override fun getItem(position: Int): Fragment {
        return ApiLevelFragment.newInstance(position+1)
    }

    override fun getCount(): Int {
        return levelsList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return levelsList[position].name
    }
}