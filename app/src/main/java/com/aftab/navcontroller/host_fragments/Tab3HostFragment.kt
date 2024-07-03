package com.aftab.navcontroller.host_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.aftab.navcontroller.databinding.FragmentTab3Binding
import com.aftab.navcontroller.databinding.FragmentTab3HostBinding

class Tab3HostFragment : Fragment() {
    private var _binding: FragmentTab3HostBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTab3HostBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
