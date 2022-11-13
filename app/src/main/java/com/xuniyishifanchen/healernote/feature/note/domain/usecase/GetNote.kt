/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.domain.usecase

import com.xuniyishifanchen.healernote.feature.note.domain.model.Note
import com.xuniyishifanchen.healernote.feature.note.domain.repository.NoteRespository

class GetNote(private val repository: NoteRespository) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}
