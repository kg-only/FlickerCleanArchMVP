package com.example.flickercleanarchmvp.main.api

import com.example.flickercleanarchmvp.responsemodel.PhotosSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {
    @GET("?method=flickr.photos.search&api_key=19eafa1f6ee69bf05c76994b72e47494&format=json&nojsoncallback=1")
   suspend fun getPhotoList(@Query ("text") text:String) : PhotosSearchResponse
}
//https://www.flickr.com/services/rest/?method=flickr.photos.search&api_key=19eafa1f6ee69bf05c76994b72e47494&text=dogs&format=json&nojsoncallback=1