package com.example.flickercleanarchmvp.interactor

import com.example.flickercleanarchmvp.main.api.RetrofitService
import com.example.flickercleanarchmvp.main.models.PhotoResult
import com.example.flickercleanarchmvp.repository.PhotoLocalRepository
import com.example.flickercleanarchmvp.repository.PhotoRemoteRepository
import com.example.flickercleanarchmvp.responsemodel.PhotosSearchResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class InteractorPhotoClass(
    private val photoLocalRepository: PhotoLocalRepository,
    private val photoRemoteRepository: PhotoRemoteRepository,
) {
    suspend fun getPhotoFromInteractor(): Flow<List<PhotoResult>> {
        return photoLocalRepository.getPhotoHeroesRoomLocalRepos()
    }

    suspend fun loadPhotoFromInteractor(text:String): List<PhotoResult> {
        val photo = photoRemoteRepository.loadHeroesFromRemoteRepos(text)
        photoLocalRepository.insertPhotoHeroesLocalRepos(photo)
        return photo
    }
}
//override suspend fun getPhotoList(text: String): PhotosSearchResponse =
//    withContext(Dispatchers.IO) {
//        return@withContext api.getPhotoList(text)
//    }