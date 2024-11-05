package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentFirebaseMainBinding

class FragmentFireBaseMain : Fragment()  {

    //todo binding
    private var _binding : FragmentFirebaseMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirebaseMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
        binding.btn01.setOnClickListener {

            findNavController().navigate(R.id.fragment_FireBase_Simples)
        }

        binding.btn02.setOnClickListener {

            findNavController().navigate(R.id.fragment_FireBase_Mvvm)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}