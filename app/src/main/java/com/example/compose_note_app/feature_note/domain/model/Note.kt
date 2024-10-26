package com.example.compose_note_app.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.compose_note_app.ui.theme.BabyBlue
import com.example.compose_note_app.ui.theme.LightGreen
import com.example.compose_note_app.ui.theme.RedOrange
import com.example.compose_note_app.ui.theme.RedPink
import com.example.compose_note_app.ui.theme.Violet

@Entity(tableName = "note")
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null,
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
