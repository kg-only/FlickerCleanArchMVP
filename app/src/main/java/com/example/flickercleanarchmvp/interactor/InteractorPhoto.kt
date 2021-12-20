package com.example.flickercleanarchmvp.interactor

import android.provider.ContactsContract
import com.example.flickercleanarchmvp.responsemodel.Photo
import com.example.flickercleanarchmvp.responsemodel.PhotosSearchResponse

interface InteractorPhoto {
    suspend fun getPhotoList(text:String): PhotosSearchResponse
}