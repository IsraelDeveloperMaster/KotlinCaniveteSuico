package net.developermaster.kotlincanivetesuico.ui.Arquitetura.LiveData.Main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentLivedataMainBinding
import net.developermaster.classe_de_dados_codigos.ClasseDeDadosCodigos

class FragmentLiveDataMain : Fragment() {

    //todo instancia de classe onde estao os codigo e xml
    val dados = ClasseDeDadosCodigos()

    //todo binding
    private var _binding: FragmentLivedataMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentLivedataMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
        binding.btn01.setOnClickListener {

            findNavController().navigate(R.id.fragment_LiveData_Simples)
        }

        binding.btn02.setOnClickListener {

            findNavController().navigate(R.id.fragment_LiveData_Contador)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}