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
            ApiLevel(1,2.3f, "Gingerbread", 2010, R.string.gingerbread_description),
            ApiLevel(2,4.0f, "Ice Cream Sandwich", 2011, R.string.ice_cream_sandwich_description),
            ApiLevel(3,4.1f, "Jelly Bean", 2012, R.string.jelly_bean_description),
            ApiLevel(4,4.4f, "KitKat", 2010, R.string.kitKat_description),
            ApiLevel(5,5.0f, "Lollipop", 2014, R.string.lollipop_description),
            ApiLevel(6,6.0f, "Marshmallow", 2015, R.string.marshmallow_description),
            ApiLevel(7,7.0f, "Nougat", 2016, R.string.nougat_description),
            ApiLevel(8,8.0f, "Oreo", 2016, R.string.oreo_description),
            ApiLevel(9,9.0f, "Pie", 2018, R.string.pie_description),
            ApiLevel(10,10.0f, "Android 10", 2019, R.string.android_10_description)
            )
        return apiLevels
    }

    fun getApiLevelById(id: Int): ApiLevel? {
        val index = apiLevels.indexOfFirst { it.id == id }
        return apiLevels.getOrNull(index)
    }
}