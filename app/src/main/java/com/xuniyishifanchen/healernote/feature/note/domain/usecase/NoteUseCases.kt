/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.domain.usecase

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
