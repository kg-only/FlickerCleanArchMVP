package com.example.flickercleanarchmvp.responsemodel

import com.google.gson.annotations.SerializedName



data class Photos (

//    @SerializedName("page"    ) var page    : Int?        = null,
//    @SerializedName("pages"   ) var pages   : Int?        = null,
//    @SerializedName("perpage" ) var perpage : Int?        = null,
//    @SerializedName("total"   ) var total   : Int?        = null,
    @SerializedName("photo"   ) var photo   : List<Photo> = arrayListOf()

)