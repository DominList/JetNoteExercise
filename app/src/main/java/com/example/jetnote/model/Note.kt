package com.example.jetnote.model


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Date
import java.util.UUID

@Entity(tableName = "notes_table") // optional if don't want to keep the @Note name
data class Note(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    @ColumnInfo(name = "note_description") val title: String, // name is optional
    @ColumnInfo(name = "note_description") val description: String,
    @ColumnInfo(name = "note_entry_date") val entryDate: Date = Date.from(Instant.now())
) {

}
