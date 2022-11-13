/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.domain.usecase

import com.xuniyishifanchen.healernote.feature.note.domain.model.Note
import com.xuniyishifanchen.healernote.feature.note.domain.repository.NoteRespository

class DeleteNote(private val repository: NoteRespository) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}
