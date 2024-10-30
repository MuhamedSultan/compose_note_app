package com.example.compose_note_app.feature_note.domain.use_case

import com.example.compose_note_app.feature_note.domain.model.InvalidNoteException
import com.example.compose_note_app.feature_note.domain.model.Note
import com.example.compose_note_app.feature_note.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    operator suspend fun invoke(note:Note){
        if (note.title.isBlank()){
            throw InvalidNoteException("The title can't be empty...")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The content can't be empty...")
        }
        repository.insertNote(note)
    }
}