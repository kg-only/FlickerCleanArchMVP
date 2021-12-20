package com.example.flickercleanarchmvp.main.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flickercleanarchmvp.R
import com.example.flickercleanarchmvp.adapter.MyAdapter
import com.example.flickercleanarchmvp.common.mvp.BaseFragmentMvp
import com.example.flickercleanarchmvp.databinding.FragmentPhotoBinding
import com.example.flickercleanarchmvp.main.models.PhotoResult
import com.example.flickercleanarchmvp.responsemodel.Photo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

private lateinit var adapter: MyAdapter
private lateinit var binding: FragmentPhotoBinding

class PhotoFragment : BaseFragmentMvp<PhotoContract.View,
        PhotoContract.Presenter>(R.layout.fragment_photo), PhotoContract.View {
    
    override val presenter: PhotoPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentPhotoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView()
        presenter.getDataFromApi(binding.searchText.text.toString())
        presenter.getDataFromFlowList()
    }

    private fun recyclerView() {
        adapter = MyAdapter(onClick = { startInfoFragment(it) })
        binding.recyclerPhoto.layoutManager =
            GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false)
        binding.recyclerPhoto.adapter = adapter
    }

    override fun getResultList(item: List<PhotoResult>) {
        adapter.setItems(item)
    }

    private fun startInfoFragment(photos: PhotoResult) {
        val data = Bundle()
        data.putParcelable("photos", photos)
        val photoInfo = InfoFragment()
        photoInfo.arguments = data
        changeFragment(photoInfo, R.id.frame_layout)
    }
}