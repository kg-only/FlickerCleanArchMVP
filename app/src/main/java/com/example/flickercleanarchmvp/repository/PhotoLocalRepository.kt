package com.example.flickercleanarchmvp.repository

import com.example.flickercleanarchmvp.main.models.PhotoResult
import kotlinx.coroutines.flow.Flow

interface PhotoLocalRepository {
    suspend fun insertPhotoHeroesLocalRepos(photo: List<PhotoResult>)

    suspend fun getPhotoHeroesRoomLocalRepos(): Flow<List<PhotoResult>>
}