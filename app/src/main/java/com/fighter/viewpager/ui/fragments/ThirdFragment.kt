package com.fighter.viewpager.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fighter.viewpager.data.DataManager
import com.fighter.viewpager.databinding.FragmentThirdBinding
import com.fighter.viewpager.ui.adapters.ThirdAdapter

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    private lateinit var adapter: ThirdAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = ThirdAdapter(DataManager.personalItems )
        binding.recyclerThird.adapter = adapter
    }

}