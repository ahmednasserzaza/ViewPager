package com.fighter.viewpager.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fighter.viewpager.data.DataManager
import com.fighter.viewpager.databinding.FragmentPersonalBinding
import com.fighter.viewpager.ui.adapters.PersonalAdapter

class PersonalFragment : Fragment(){
    private lateinit var binding: FragmentPersonalBinding
    private lateinit var adapter: PersonalAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentPersonalBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = PersonalAdapter(DataManager.personalItems )
        binding.recyclerPersonal.adapter = adapter
    }

}