/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.data.repository

import com.xuniyishifanchen.healernote.feature.note.data.datasoure.database.NoteDao
import com.xuniyishifanchen.healernote.feature.note.domain.model.Note
import com.xuniyishifanchen.healernote.feature.note.domain.repository.NoteRespository
import com.xuniyishifanchen.healernote.feature.note.mapper.toDataModel
import com.xuniyishifanchen.healernote.feature.note.mapper.toDomainModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class NoteRepositoryImpl(val noteDao: NoteDao) : NoteRespository {

    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNote().map {
            it.map { noteEntityModel ->
                noteEntityModel.toDomainModel()
            }
        }
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)?.toDomainModel()
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note.toDataModel())
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toDataModel())
    }
}
