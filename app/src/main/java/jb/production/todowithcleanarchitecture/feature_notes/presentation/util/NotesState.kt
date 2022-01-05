package jb.production.todowithcleanarchitecture.feature_notes.presentation.util

import jb.production.todowithcleanarchitecture.feature_notes.domain.model.Note
import jb.production.todowithcleanarchitecture.feature_notes.domain.util.NoteOrder
import jb.production.todowithcleanarchitecture.feature_notes.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Time(OrderType.Descending),
    val shouldShowOrderSection: Boolean = false
)