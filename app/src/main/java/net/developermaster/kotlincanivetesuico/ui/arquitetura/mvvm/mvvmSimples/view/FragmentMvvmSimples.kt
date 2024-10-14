package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmSimples.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentMvvmSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmSimples.viewModel.ViewModelMvvmSimples

class FragmentMvvmSimples : Fragment() {

    //todo instancia de classe onde estao os codigo e xml
    val dados = modelCodigos()

    //todo instancia classe viewmodel
    private lateinit var viewModelMvvmSimples: ViewModelMvvmSimples

    //todo binding
    private var _binding: FragmentMvvmSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMvvmSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModelMvvmSimples = ViewModelProvider(this)[ViewModelMvvmSimples::class.java]

        fun funcaoRecuperaUsuarios() {

            viewModelMvvmSimples.getUser().observe(viewLifecycleOwner) { usuariosRecuperados ->

                val resultadoUsuariosRecuperados =
                    "Nome: ${usuariosRecuperados.nome} , idade: ${usuariosRecuperados.idade} \n \n "

                binding.textView.text = resultadoUsuariosRecuperados
            }
        }

        //todo instancia de string
        val variavelMensagens = getString(R.string.NAV_MVVM_SIMPLES)

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(variavelMensagens)

            mensagemSnackBar(variavelMensagens)

            funcaoRecuperaUsuarios()
        }

        binding.fabCodigo.setOnClickListener {

            codigo()
        }

        binding.fabXml.setOnClickListener {

            codigoXml()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.mvvmSimples()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.mvvmSimplesXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }
}