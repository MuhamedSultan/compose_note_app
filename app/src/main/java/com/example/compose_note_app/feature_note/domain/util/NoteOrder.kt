package com.example.compose_note_app.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType) {
    class Title(orderType: OrderType):NoteOrder(orderType)
    class Date(orderType: OrderType):NoteOrder(orderType)
    class Colors(orderType: OrderType):NoteOrder(orderType)
}