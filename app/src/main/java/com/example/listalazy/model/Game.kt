package com.example.listalazy.model

import android.icu.text.CaseMap.Title
import java.time.Year

data class Game(
    val id: Long = 0,
    val title: String = "",
    val studio: String = "",
    val releaseYear: Int = 0
)
