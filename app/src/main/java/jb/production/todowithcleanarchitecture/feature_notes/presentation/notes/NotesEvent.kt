package jb.production.todowithcleanarchitecture.feature_notes.presentation.notes

import jb.production.todowithcleanarchitecture.feature_notes.domain.model.Note
import jb.production.todowithcleanarchitecture.feature_notes.domain.util.NoteOrder

sealed class NotesEvent {

    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}