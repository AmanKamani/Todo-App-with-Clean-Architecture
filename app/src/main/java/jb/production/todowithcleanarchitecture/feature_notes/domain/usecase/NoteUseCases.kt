package jb.production.todowithcleanarchitecture.feature_notes.domain.usecase

data class NoteUseCases(
    val getNotes: GetNotes,
    val addEditNote: AddEditNote,
    val deleteNote: DeleteNote,
    val getNote: GetNote
)
