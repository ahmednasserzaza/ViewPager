package com.fighter.viewpager.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseAdapter<T, VB : ViewBinding>(private val list: List<T>) :
    RecyclerView.Adapter<BaseAdapter.BaseViewHolder<VB>>() {

    abstract val bindingInflater: (LayoutInflater, ViewGroup, Boolean) -> VB

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<VB> {
        val inflater = LayoutInflater.from(parent.context)
        val binding = bindingInflater(inflater, parent, false)
        return BaseViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: BaseViewHolder<VB>, position: Int) {
        val currentItem = list[position]
        bindViews(holder, position , currentItem)
    }

    abstract fun bindViews(holder: BaseViewHolder<VB>, position: Int, currentItem:T)

    class BaseViewHolder<VB : ViewBinding>(val binding: VB) : RecyclerView.ViewHolder(binding.root)
}