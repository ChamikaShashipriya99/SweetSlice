package com.example.sweetslice

data class Cake(
    val name: String,
    val rating: Float,
    val imageResId: Int,
    var isFavorite: Boolean = false
)