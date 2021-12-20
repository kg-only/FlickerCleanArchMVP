package com.example.flickercleanarchmvp.main.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flickercleanarchmvp.R
import com.example.flickercleanarchmvp.common.mvp.BaseFragment
import com.example.flickercleanarchmvp.databinding.FragmentInfoBinding
import com.example.flickercleanarchmvp.main.models.PhotoResult
import com.example.flickercleanarchmvp.responsemodel.Photo
import com.squareup.picasso.Picasso

private lateinit var binding: FragmentInfoBinding
private lateinit var dataResult: PhotoResult

class InfoFragment : BaseFragment(R.layout.fragment_info) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentInfoBinding.inflate(inflater, container, false)
        dataResult = requireArguments().getParcelable("photos")!!
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val photoData =
            "https://live.staticflickr.com/${dataResult.server}/${dataResult.id}_${dataResult.secret}_w.jpg"
        Picasso.get().load(photoData).into(binding.infoImage)

    }
}
