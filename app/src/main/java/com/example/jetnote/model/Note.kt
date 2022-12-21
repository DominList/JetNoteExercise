package com.example.jetnote.model


import java.time.LocalDateTime
import java.util.UUID

data class Note(
    val id : UUID = UUID.randomUUID(),
    val title: String,
    val descriptor: String,
    val entryDate: LocalDateTime = LocalDateTime.now()
) {

}
