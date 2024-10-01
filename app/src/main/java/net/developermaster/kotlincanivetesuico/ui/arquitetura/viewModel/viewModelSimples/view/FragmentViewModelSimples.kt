package net.developermaster.kotlincanivetesuico.ui.arquitetura.viewModel.viewModelSimples.view

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
import net.developermaster.kotlincanivetesuico.databinding.FragmentViewmodelSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.viewModel.viewModelSimples.viewModel.ViewModelSimples

class FragmentViewModelSimples : Fragment() {

    //todo instancia de classe onde estao os codigo e xml
    val dados = modelCodigos()

    //todo instancia classeviewmodel
    private lateinit var viewModelSimples: ViewModelSimples

    //todo binding
    private var _binding: FragmentViewmodelSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentViewmodelSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModelSimples = ViewModelProvider(this).get(ViewModelSimples::class.java)

        fun funcaoViewModelSimple(): Unit {

            viewModelSimples.contador++

            binding.textView.text = "ViewModelContador ${viewModelSimples.contador}"
        }

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(getString(R.string.NAV_VIEWMODEL_SIMPLES))

            mensagemSnackBar(getString(R.string.`MESAGEM_VIEWMODEL_GIRE`))

            funcaoViewModelSimple()
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
            putString("codigo", "${dados.viewmodelSimples()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.viewmodelSimplesXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }
}