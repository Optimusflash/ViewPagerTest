package com.optimus.androidapilevel.models

import java.time.Year

/**
 * Created by Dmitriy Chebotar on 30.01.2020.
 */
data class ApiLevel(
    val id: Int,
    val version: Float,
    val name: String,
    val year: Int,
    val description: Int
) {
}