package com.optimus.androidapilevel.models

import java.time.Year

/**
 * Created by Dmitriy Chebotar on 30.01.2020.
 */
data class ApiLevel(
    val id: Int,
    val level: String,
    val version: String,
    val name: String,
    val year: String,
    val description: Int
) {
}