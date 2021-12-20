package com.example.flickercleanarchmvp.responsemodel

import com.google.gson.annotations.SerializedName

data class PhotosSearchResponse(
    @SerializedName("photos" ) var photos : Photos? = Photos(),
//    @SerializedName("stat"   ) var stat   : String? = null

)