package com.aftab.navcontroller.host_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.aftab.navcontroller.databinding.FragmentTab2Binding
import com.aftab.navcontroller.databinding.FragmentTab2HostBinding

class Tab2HostFragment : Fragment() {
    private var _binding: FragmentTab2HostBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTab2HostBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun navigateWithArgs() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
