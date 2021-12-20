package com.example.flickercleanarchmvp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.flickercleanarchmvp.R
import com.example.flickercleanarchmvp.main.models.PhotoResult
import com.squareup.picasso.Picasso


class MyAdapter(private val onClick: (PhotoResult) -> Unit) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    private val data = mutableListOf<PhotoResult>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val icon: ImageView = item.findViewById(R.id.ImageView)


        fun bind(item: PhotoResult) {

            itemView.setOnClickListener { (onClick.invoke(item)) }
            val data =
                "https://live.staticflickr.com/${item.server}/${item.id}_${item.secret}_w.jpg"
            Picasso.get().load(data).resize(400, 400)
                .centerCrop().into(icon)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<PhotoResult>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}