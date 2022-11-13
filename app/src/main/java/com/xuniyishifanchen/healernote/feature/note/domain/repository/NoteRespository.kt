/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.domain.repository

import com.xuniyishifanchen.healernote.feature.note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRespository {
    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}
