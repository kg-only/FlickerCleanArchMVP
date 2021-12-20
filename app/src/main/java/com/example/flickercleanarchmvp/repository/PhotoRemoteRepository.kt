package com.example.flickercleanarchmvp.repository

import com.example.flickercleanarchmvp.main.models.PhotoResult

interface PhotoRemoteRepository {
    suspend fun loadHeroesFromRemoteRepos(text:String): List<PhotoResult>
}