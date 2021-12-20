package com.example.flickercleanarchmvp.main.ui

import androidx.room.Room
import com.example.flickercleanarchmvp.interactor.InteractorPhoto
import com.example.flickercleanarchmvp.interactor.InteractorPhotoClass
import com.example.flickercleanarchmvp.main.db.database.PhotoDatabase
import com.example.flickercleanarchmvp.repository.PhotoDataBaseRepository
import com.example.flickercleanarchmvp.repository.PhotoLocalRepository
import com.example.flickercleanarchmvp.repository.PhotoRemoteRepository
import com.example.flickercleanarchmvp.repository.PhotoRepository
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

object MainModule {
    fun create(): Module = module {
        factory { PhotoPresenter(get()) }
        factory { InteractorPhotoClass(get(),get()) } bind InteractorPhotoClass::class

//        factory {
//            val interactor = InteractorPhotoClass(get(), get())
//            interactor
//        } bind InteractorPhoto::class

        single {
            Room.databaseBuilder(get(), PhotoDatabase::class.java, "photoDao")
                .build()
        }
        single { get<PhotoDatabase>().resultPhotoDao() }
        single<PhotoLocalRepository> { PhotoDataBaseRepository(get()) }
        single<PhotoRemoteRepository> { PhotoRepository(get()) }
    }
}