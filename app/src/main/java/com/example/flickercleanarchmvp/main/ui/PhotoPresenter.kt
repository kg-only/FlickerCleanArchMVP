package com.example.flickercleanarchmvp.main.ui

import android.util.Log
import com.example.flickercleanarchmvp.common.mvp.BasePresenter
import com.example.flickercleanarchmvp.interactor.InteractorPhotoClass
import com.example.flickercleanarchmvp.main.api.RetrofitService
import com.example.flickercleanarchmvp.responsemodel.PhotosSearchResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PhotoPresenter(private val interactor: InteractorPhotoClass) :
    BasePresenter<PhotoContract.View>(),
    PhotoContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)
    override  fun getDataFromApi(text: String) {
        presenterScope.launch {
            try {
                interactor.loadPhotoFromInteractor(text)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", "Error process in loadPhotoFromInteractor() ")
            }
        }
    }

    override  fun getDataFromFlowList() {
        presenterScope.launch {
            interactor.getPhotoFromInteractor().collect {
                view?.getResultList(it)
            }
        }
    }

}
