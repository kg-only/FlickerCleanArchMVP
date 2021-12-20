package com.example.flickercleanarchmvp.main.db.dbmodels

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.flickercleanarchmvp.main.db.convertors.RoomConvertor

@Entity(tableName = "photoDao")
@TypeConverters(RoomConvertor::class)
data class PhotoEntity(
    @PrimaryKey
    var id: String,
    @ColumnInfo(name = "secret")
    var secret: String,
    @ColumnInfo(name = "server")
    var server: String,
)
