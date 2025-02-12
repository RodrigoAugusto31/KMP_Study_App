package com.plcoding.bookpedia.book.data.database

import androidx.room.RoomDatabase

expect class DataBaseFactory {
    fun create(): RoomDatabase.Builder<FavoriteBookDatabase>
}