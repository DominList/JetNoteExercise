package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title="Good day bad day", description = "Children are squeezing us"),
            Note(title="Bad hair day", description = "Let's check the mirror"),
            Note(title="Shopping", description = "Get some beer"),
            Note(title="Well", description = "Children again are squeezing us"),
            Note(title="Really", description = "Kindergarten"),
            Note(title="What else", description = "Playing a base"),
            Note(title="Musical stuff", description = "Mix a guitar"),
            Note(title="Sweets stop", description = "Go keto"),
            Note(title="Let's play football", description = "Where are the guys?"),
            Note(title="Gonna rest", description = "Today stay at home"),
        )
    }
}