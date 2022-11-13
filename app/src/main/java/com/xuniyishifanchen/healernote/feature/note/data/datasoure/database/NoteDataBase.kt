/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.feature.note.data.datasoure.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.xuniyishifanchen.healernote.feature.note.data.datasoure.database.model.NoteEntityModel

@Database(
    entities = [NoteEntityModel::class],
    version = 1
)
abstract class NoteDataBase : RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "note_db"
    }
}
