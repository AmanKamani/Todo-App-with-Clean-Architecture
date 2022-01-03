package jb.production.todowithcleanarchitecture.feature_notes.domain.util

sealed class NoteOrder(val orderType: OrderType) {

    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType)
    class Time(orderType: OrderType) : NoteOrder(orderType)
}
