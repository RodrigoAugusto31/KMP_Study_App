package com.plcoding.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun BookSearchBarPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    )
    BookSearchBar(
        searchQuery = "Kotlin",
        onSearchQueryChange = {},
        onImageSearch = {},
        modifier = Modifier
            .fillMaxWidth()
    )

}