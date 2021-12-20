package com.example.flickercleanarchmvp.repository

import com.example.flickercleanarchmvp.main.api.RetrofitService
import com.example.flickercleanarchmvp.main.models.PhotoResult

class PhotoRepository(private val api: RetrofitService) : PhotoRemoteRepository {
    override suspend fun loadHeroesFromRemoteRepos(text: String): List<PhotoResult> {
        val data = api.getPhotoList(text)
        return data.photos!!.photo.map {
            PhotoResult(id = it.id!!,
                secret = it.secret!!,
                server = it.server!!)
        }
    }
}