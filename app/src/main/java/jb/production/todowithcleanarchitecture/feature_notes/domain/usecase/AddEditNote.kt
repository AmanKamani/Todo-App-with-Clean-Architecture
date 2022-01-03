package jb.production.todowithcleanarchitecture.feature_notes.domain.usecase

import jb.production.todowithcleanarchitecture.feature_notes.domain.model.Note
import jb.production.todowithcleanarchitecture.feature_notes.domain.repository.NoteRepository

class AddEditNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.insertNote(note)
    }
}