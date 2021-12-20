package com.example.flickercleanarchmvp.main.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.flickercleanarchmvp.main.db.dao.Dao
import com.example.flickercleanarchmvp.main.db.dbmodels.PhotoEntity

@Database(entities = [PhotoEntity::class], version = 1)
abstract class PhotoDatabase : RoomDatabase() {
    abstract fun resultPhotoDao(): Dao
}