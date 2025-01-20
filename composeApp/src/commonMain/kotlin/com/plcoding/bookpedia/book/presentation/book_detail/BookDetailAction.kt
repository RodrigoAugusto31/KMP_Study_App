package com.plcoding.bookpedia.book.presentation.book_detail

import com.plcoding.bookpedia.book.domain.Book

sealed interface BookDetailAction {
    data object onBackClick: BookDetailAction
    data object onFavoriteClick: BookDetailAction
    data class onSelectedBoookChange(val book: Book): BookDetailAction
}