package com.example.flickercleanarchmvp.main.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.flickercleanarchmvp.main.db.dbmodels.PhotoEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Query("SELECT * FROM photoDao")
    fun getAll(): Flow<List<PhotoEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(resultInsert: List<PhotoEntity>)

}