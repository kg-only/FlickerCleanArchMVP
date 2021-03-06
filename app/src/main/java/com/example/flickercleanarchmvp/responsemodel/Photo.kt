package com.example.flickercleanarchmvp.responsemodel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


data class Photo (

    @SerializedName("id"       ) var id       : String? = null,
//    @SerializedName("owner"    ) var owner    : String? = null,
    @SerializedName("secret"   ) var secret   : String? = null,
    @SerializedName("server"   ) var server   : String? = null,
//    @SerializedName("farm"     ) var farm     : Int?    = null,
//    @SerializedName("title"    ) var title    : String? = null,
//    @SerializedName("ispublic" ) var ispublic : Int?    = null,
//    @SerializedName("isfriend" ) var isfriend : Int?    = null,
//    @SerializedName("isfamily" ) var isfamily : Int?    = null

)