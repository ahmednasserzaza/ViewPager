package com.fighter.viewpager.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fighter.viewpager.data.Personal
import com.fighter.viewpager.databinding.ItemThirdBinding

class ThirdAdapter(private var thirdList: List<Personal>) :
    BaseAdapter<Personal, ItemThirdBinding>(thirdList) {
    override val bindingInflater: (LayoutInflater, ViewGroup, Boolean) -> ItemThirdBinding
        get() = ItemThirdBinding::inflate

    override fun bindViews(
        holder: BaseViewHolder<ItemThirdBinding>,
        position: Int,
        currentItem: Personal
    ) {
        holder.binding.apply {
            textTitle.text = currentItem.title
            textContent.text = currentItem.content
        }
    }
}