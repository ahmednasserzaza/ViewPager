package com.fighter.viewpager.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.fighter.viewpager.databinding.ItemImageBinding

class ImageViewPagerAdapter(private val images:List<Int>):RecyclerView.Adapter<ImageViewPagerAdapter.ImageViewHolder>() {

    class ImageViewHolder(val binding:ItemImageBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding =  ItemImageBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return ImageViewHolder(binding)
    }

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val currentImage = images[position]
        holder.binding.apply {
            imageView.setImageResource(currentImage)
        }
    }
}