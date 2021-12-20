package com.example.flickercleanarchmvp.common.mvp

interface MvpPresenter<V : MvpView> {
    fun attach(view: V)
    fun detach()
}