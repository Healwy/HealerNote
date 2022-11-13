/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.presentation.screen.notes

import com.xuniyishifanchen.healernote.feature.note.domain.model.Note
import com.xuniyishifanchen.healernote.feature.note.domain.util.NoteOrder
import com.xuniyishifanchen.healernote.feature.note.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
