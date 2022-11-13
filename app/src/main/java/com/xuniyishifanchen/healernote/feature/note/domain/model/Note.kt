/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.domain.model

import com.xuniyishifanchen.healernote.ui.theme.BabyBlue
import com.xuniyishifanchen.healernote.ui.theme.LightGreen
import com.xuniyishifanchen.healernote.ui.theme.RedOrange
import com.xuniyishifanchen.healernote.ui.theme.RedPink
import com.xuniyishifanchen.healernote.ui.theme.Violet

data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)
