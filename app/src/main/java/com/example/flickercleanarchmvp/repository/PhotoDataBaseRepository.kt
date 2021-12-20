package com.example.flickercleanarchmvp.repository

import com.example.flickercleanarchmvp.main.db.convertors.PhotoConvertor
import com.example.flickercleanarchmvp.main.db.dao.Dao
import com.example.flickercleanarchmvp.main.models.PhotoResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
class PhotoDataBaseRepository(private val dao: Dao) : PhotoLocalRepository {


    override suspend fun insertPhotoHeroesLocalRepos(photo: List<PhotoResult>) {
        val entities = photo.map {
            PhotoConvertor.toDatabase(it)
        }
        dao.insertAll(entities)
    }

    override suspend fun getPhotoHeroesRoomLocalRepos(): Flow<List<PhotoResult>> {
        return dao.getAll().map { list ->
            list.map { PhotoConvertor.fromDatabase(it) }
        }
    }
}