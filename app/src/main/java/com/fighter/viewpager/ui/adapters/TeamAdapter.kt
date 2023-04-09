package com.fighter.viewpager.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fighter.viewpager.data.Team
import com.fighter.viewpager.databinding.ItemTeamBinding

class TeamAdapter(private val teamList: List<Team>): RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTeamBinding.inflate(inflater, parent, false)
        return TeamViewHolder(binding)
    }

    override fun getItemCount(): Int = teamList.size

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val currentTeamItem = teamList[position]
        holder.binding.apply {
            textTitle.text = currentTeamItem.title
            textName.text = currentTeamItem.name
            textContent.text = currentTeamItem.content
        }
    }

    class TeamViewHolder(val binding: ItemTeamBinding) : RecyclerView.ViewHolder(binding.root)
}