package jb.production.todowithcleanarchitecture.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jb.production.todowithcleanarchitecture.feature_notes.data.data_source.NoteDatabase
import jb.production.todowithcleanarchitecture.feature_notes.data.repository.NoteRepositoryImpl
import jb.production.todowithcleanarchitecture.feature_notes.domain.repository.NoteRepository
import jb.production.todowithcleanarchitecture.feature_notes.domain.usecase.AddEditNote
import jb.production.todowithcleanarchitecture.feature_notes.domain.usecase.DeleteNote
import jb.production.todowithcleanarchitecture.feature_notes.domain.usecase.GetNote
import jb.production.todowithcleanarchitecture.feature_notes.domain.usecase.GetNotes
import jb.production.todowithcleanarchitecture.feature_notes.domain.usecase.NoteUseCases
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCase(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            addEditNote = AddEditNote(repository),
            deleteNote = DeleteNote(repository),
            getNote = GetNote(repository)
        )
    }
}