package com.fighter.viewpager.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fighter.viewpager.data.DataManager
import com.fighter.viewpager.databinding.FragmentTeamBinding
import com.fighter.viewpager.ui.adapters.TeamAdapter

class TeamFragment : Fragment() {

    private lateinit var binding:FragmentTeamBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTeamBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = TeamAdapter(DataManager.teamList)
        binding.recyclerTeam.adapter = adapter
    }


}