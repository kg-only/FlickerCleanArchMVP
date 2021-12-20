package com.example.flickercleanarchmvp.common.mvp

import androidx.appcompat.app.AppCompatActivity
import com.example.flickercleanarchmvp.R

abstract class BaseActivity : AppCompatActivity() {

    fun replaceFragment(fragment: androidx.fragment.app.Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, fragment)
        transaction.commit()
    }
}