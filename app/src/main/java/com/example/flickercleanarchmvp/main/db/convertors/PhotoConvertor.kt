package com.example.flickercleanarchmvp.main.db.convertors

import com.example.flickercleanarchmvp.main.db.dbmodels.PhotoEntity
import com.example.flickercleanarchmvp.main.models.PhotoResult

object PhotoConvertor {

    fun toDatabase(photo: PhotoResult): PhotoEntity =
        PhotoEntity(
            id = photo.id,
            secret = photo.secret,
            server = photo.server
        )

    fun fromDatabase(entity: PhotoEntity): PhotoResult = PhotoResult(
        id = entity.id,
        secret = entity.secret,
        server = entity.server
    )
}