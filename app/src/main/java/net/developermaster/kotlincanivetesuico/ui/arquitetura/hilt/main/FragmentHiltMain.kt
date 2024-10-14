package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentHiltMainBinding

class FragmentHiltMain : Fragment() {

    //todo instancia de classe onde estao os codigo e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentHiltMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHiltMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
        binding.btn01.setOnClickListener {

            findNavController().navigate(R.id.fragment_Hilt_Simples)
        }

        binding.btn02.setOnClickListener {

            findNavController().navigate(R.id.fragment_Hilt_Injecao)
        }

        binding.btn03.setOnClickListener {
            findNavController().navigate(R.id.fragment_Dependencias_Nomeadas)
        }

        binding.btn04.setOnClickListener {

            findNavController().navigate(R.id.fragment_Hilt_Dummy_Usuarios)
        }

        binding.btn05.setOnClickListener {
            findNavController().navigate(R.id.fragment_Hilt_Dummy_Produtos)
        }

        binding.fabCodigo.setOnClickListener {

            codigo()
        }

    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.hiltModuloEClasseAplication()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}