package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentCleanMainBinding

class FragmentCleanMain : Fragment() {

    //todo binding
    private var _binding: FragmentCleanMainBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentCleanMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes

        binding.btnMvvmDomain.setOnClickListener {

            findNavController().navigate(R.id.fragment_Clean_Mvvm)
        }

        binding.btnMvvmDomainHilt.setOnClickListener {

            findNavController().navigate(R.id.fragment_Clean_Domain)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}