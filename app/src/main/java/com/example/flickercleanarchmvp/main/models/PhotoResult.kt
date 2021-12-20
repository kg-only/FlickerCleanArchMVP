package com.example.flickercleanarchmvp.main.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PhotoResult(
    var id: String,
    var secret: String,
    var server: String,
) : Parcelable