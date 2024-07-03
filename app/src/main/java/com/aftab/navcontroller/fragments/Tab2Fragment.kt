package com.aftab.navcontroller.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.aftab.navcontroller.databinding.FragmentTab2Binding

class Tab2Fragment : Fragment() {
    private var _binding: FragmentTab2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTab2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up button click listener
        binding.btnNavigate.setOnClickListener {
            navigateWithArgs()
        }
    }

    private fun navigateWithArgs() {
        val action = Tab2FragmentDirections.actionTab2FragmentToTab3Fragment("Hello from Tab1")
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}