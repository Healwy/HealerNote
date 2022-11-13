/*
 * Copyright 2022 Healer Corporation.
 */

package com.xuniyishifanchen.healernote.di

import android.app.Application
import androidx.room.Room
import com.xuniyishifanchen.healernote.feature.note.data.datasoure.database.NoteDataBase
import com.xuniyishifanchen.healernote.feature.note.data.repository.NoteRepositoryImpl
import com.xuniyishifanchen.healernote.feature.note.domain.repository.NoteRespository
import com.xuniyishifanchen.healernote.feature.note.domain.usecase.AddNote
import com.xuniyishifanchen.healernote.feature.note.domain.usecase.DeleteNote
import com.xuniyishifanchen.healernote.feature.note.domain.usecase.GetNote
import com.xuniyishifanchen.healernote.feature.note.domain.usecase.GetNotes
import com.xuniyishifanchen.healernote.feature.note.domain.usecase.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providerNoteDataBase(app: Application): NoteDataBase {
        return Room.databaseBuilder(
            app,
            NoteDataBase::class.java,
            NoteDataBase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun providerNoteRepository(db: NoteDataBase): NoteRespository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun providerNoteUseCase(repository: NoteRespository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}
