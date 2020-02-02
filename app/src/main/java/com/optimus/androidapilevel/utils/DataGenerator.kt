package com.optimus.androidapilevel.utils

import com.optimus.androidapilevel.R
import com.optimus.androidapilevel.models.ApiLevel

/**
 * Created by Dmitriy Chebotar on 30.01.2020.
 */
object DataGenerator {

    private lateinit var apiLevels: MutableList<ApiLevel>

    fun generateAndroidApiLevels(): List<ApiLevel> {
         apiLevels = mutableListOf(
            ApiLevel(1,"9","2.3", "Gingerbread", "2010", R.string.gingerbread_description),
            ApiLevel(2,"14","4.0", "Ice Cream Sandwich", "2011", R.string.ice_cream_sandwich_description),
            ApiLevel(3,"16","4.1", "Jelly Bean", "2012", R.string.jelly_bean_description),
            ApiLevel(4,"19","4.4", "KitKat", "2010", R.string.kitKat_description),
            ApiLevel(5,"21","5.0", "Lollipop", "2014", R.string.lollipop_description),
            ApiLevel(6,"23","6.0", "Marshmallow", "2015", R.string.marshmallow_description),
            ApiLevel(7,"24","7.0", "Nougat", "2016", R.string.nougat_description),
            ApiLevel(8,"26","8.0", "Oreo", "2016", R.string.oreo_description),
            ApiLevel(9,"28","9.0", "Pie", "2018", R.string.pie_description),
            ApiLevel(10,"29","10.0", "Android 10", "2019", R.string.android_10_description)
            )
        return apiLevels
    }

    fun getApiLevelById(id: Int): ApiLevel? {
        val index = apiLevels.indexOfFirst { it.id == id }
        return apiLevels.getOrNull(index)
    }
}