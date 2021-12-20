package com.example.flickercleanarchmvp

import android.os.Bundle
import com.example.flickercleanarchmvp.common.mvp.BaseActivity
import com.example.flickercleanarchmvp.main.ui.PhotoFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(PhotoFragment())
    }
}
