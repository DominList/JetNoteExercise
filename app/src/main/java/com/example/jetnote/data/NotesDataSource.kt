package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title="Good day bad day", descriptor = "Children are squeezing us"),
            Note(title="Bad hair day", descriptor = "Let's check the mirror"),
            Note(title="Shopping", descriptor = "Get some beer"),
            Note(title="Well", descriptor = "Children again are squeezing us"),
            Note(title="Really", descriptor = "Kindergarten"),
            Note(title="What else", descriptor = "Playing a base"),
            Note(title="Musical stuff", descriptor = "Mix a guitar"),
            Note(title="Sweets stop", descriptor = "Go keto"),
            Note(title="Let's play football", descriptor = "Where are the guys?"),
            Note(title="Gonna rest", descriptor = "Today stay at home"),

        )
    }
}