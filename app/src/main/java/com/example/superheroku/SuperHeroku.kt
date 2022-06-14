package com.example.superheroku

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SuperHeroku(
    val imgSuperhro: Int,
    val nameSuperhero: String,
    val descSuperhero: String,
) : Parcelable
