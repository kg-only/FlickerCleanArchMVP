package com.example.flickercleanarchmvp.main.ui

import com.example.flickercleanarchmvp.common.mvp.MvpPresenter
import com.example.flickercleanarchmvp.common.mvp.MvpView
import com.example.flickercleanarchmvp.main.models.PhotoResult
import com.example.flickercleanarchmvp.responsemodel.Photo

interface PhotoContract {
    interface View : MvpView {
         fun getResultList(item: List<PhotoResult>)

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(text: String)
         fun getDataFromFlowList()

    }
}