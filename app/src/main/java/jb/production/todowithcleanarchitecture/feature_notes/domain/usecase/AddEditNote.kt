package jb.production.todowithcleanarchitecture.feature_notes.domain.usecase

import jb.production.todowithcleanarchitecture.feature_notes.domain.model.InvalidNoteException
import jb.production.todowithcleanarchitecture.feature_notes.domain.model.Note
import jb.production.todowithcleanarchitecture.feature_notes.domain.repository.NoteRepository

class AddEditNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title can't be empty.")
        }
        if (note.description.isBlank()) {
            throw InvalidNoteException("The Content can't be empty.")
        }
        repository.insertNote(note)
    }
}