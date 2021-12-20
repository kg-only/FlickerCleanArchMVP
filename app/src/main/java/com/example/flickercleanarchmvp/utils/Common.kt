package com.example.flickercleanarchmvp.utils

import com.example.flickercleanarchmvp.main.api.RetrofitService

object Common {
    private const val BASE_URL = "https://www.flickr.com/services/rest/"
    val retrofitService: RetrofitService
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}
//https://api.rawg.io/api/platforms?key=dc24ec5ed0254d4fa10e77d570b4f11c