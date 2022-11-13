/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.domain.usecase

import com.xuniyishifanchen.healernote.feature.note.domain.model.InvalidNoteException
import com.xuniyishifanchen.healernote.feature.note.domain.model.Note
import com.xuniyishifanchen.healernote.feature.note.domain.repository.NoteRespository

class AddNote(val repository: NoteRespository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of note can't be empty.")
        }

        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of note can't be empty.")
        }
        repository.insertNote(note)
    }
}
