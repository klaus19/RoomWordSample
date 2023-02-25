package com.example.roomwordsample.db

import androidx.room.Database
import androidx.room.RoomDatabase


// Annotates class to be a Room Database with a table (entity) of the Word class
@Database(entities = arrayOf(Word::class), version = 1, exportSchema = false)
abstract class WordRoomDatabase:RoomDatabase() {

    abstract fun getYourDao():WordDao

}