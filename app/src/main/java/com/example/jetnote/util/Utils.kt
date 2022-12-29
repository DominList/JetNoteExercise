package com.example.jetnote.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object Utils {
    fun formatDate(time: Date): String {
        val format = SimpleDateFormat("EEE, d MMM", Locale.getDefault())
        return format.format(time)
    }
}