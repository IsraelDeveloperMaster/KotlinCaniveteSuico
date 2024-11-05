package net.developermaster.kotlincanivetesuico.ui.arquitetura.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentArquiteturaMainBinding


class FragmentArquiteturaMain : Fragment() {

    //todo binding
    private var _binding : FragmentArquiteturaMainBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentArquiteturaMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
        binding.btnMvc.setOnClickListener {
            findNavController().navigate(R.id.fragment_Mvc)
        }

        binding.btnMvp.setOnClickListener {
            findNavController().navigate(R.id.fragment_Mvp_Main)
        }

        binding.btnViewModel.setOnClickListener {
            findNavController().navigate(R.id.fragment_ViewModel_Main)
        }

        binding.btnLivedata.setOnClickListener {
            findNavController().navigate(R.id.fragment_LiveData_Main)
        }

        binding.btnDatabindig.setOnClickListener {
            findNavController().navigate(R.id.fragment_DataBinding_Main)
        }

        binding.btnMvvm.setOnClickListener {
            findNavController().navigate(R.id.fragment_Mvvm_Main)
        }

        binding.btnCleanArchitecture.setOnClickListener {
            findNavController().navigate(R.id.fragment_Clean_Main)
        }

        binding.btnHilt.setOnClickListener {
            findNavController().navigate(R.id.fragment_Hilt_Main)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}