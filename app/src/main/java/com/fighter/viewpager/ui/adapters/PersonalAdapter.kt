package com.fighter.viewpager.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fighter.viewpager.data.Personal
import com.fighter.viewpager.databinding.ItemPersonalBinding

class PersonalAdapter(private var personalList: List<Personal>) :
    BaseAdapter<Personal, ItemPersonalBinding>(personalList) {

    override val bindingInflater: (LayoutInflater, ViewGroup, Boolean) -> ItemPersonalBinding
        get() = ItemPersonalBinding::inflate

    override fun bindViews(
        holder: BaseViewHolder<ItemPersonalBinding>,
        position: Int,
        currentItem: Personal
    ) {
        holder.binding.apply {
            textTitle.text = currentItem.title
            textContent.text = currentItem.content
        }
    }

}