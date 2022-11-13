/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.mapper

import com.xuniyishifanchen.healernote.feature.note.data.datasoure.database.model.NoteEntityModel
import com.xuniyishifanchen.healernote.feature.note.domain.model.Note

fun NoteEntityModel.toDomainModel(): Note {
    return Note(
        title = title,
        content = content,
        timeStamp = timeStamp,
        color = color,
        id = id
    )
}

fun Note.toDataModel(): NoteEntityModel {
    return NoteEntityModel(
        title = title,
        content = content,
        timeStamp = timeStamp,
        color = color,
        id = id
    )
}
