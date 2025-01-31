package net.developermaster.kotlincanivetesuico.ui.arquitetura.liveData.liveDataContador.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentLivedataContadorBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.liveData.liveDataContador.viewModel.ViewModelLiveDataContador

class FragmentLiveDataContador : Fragment()  {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding : FragmentLivedataContadorBinding? = null
    private val binding get() = _binding!!

    //todo viewmodel
    private lateinit var viewModelLiveDataContador: ViewModelLiveDataContador

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLivedataContadorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

                //todo instanciando viewmodel
        viewModelLiveDataContador = ViewModelProvider( this ).get(  ViewModelLiveDataContador::class.java )

        //todo criando o observador

        val observadorLiveData = viewModelLiveDataContador.recuperarLiveData()

        observadorLiveData.observe( viewLifecycleOwner ,  ) { contador ->

            //todo caixa de texto inicio com Maria
            binding.textViewNome.text = " Nome: Maria "

            //todo recupera funcao recuperarContador que esta na classeviewmodel
            binding.textViewIdade.text = " Idade: ${ contador } "
        }

        //todo atributo para atualizar o ViewModelContador quando o texto da caixa de texto mudar
        binding.textInputNome.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->
            viewModelLiveDataContador.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()
        }

        //todo atributo para atualizar o ViewModelContador quando o texto da caixa de texto ideade mudar
        binding.textInputIdade.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->
            viewModelLiveDataContador.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()

        }

        //todo botoes
        binding.btnContar.setOnClickListener {

            mensagemToast(getString(R.string.NAV_LIVEDATA_CONTADOR))

            mensagemSnackBar(getString(R.string.MENSAGEM_LIVEDATA_GIRE))

            //todo recupera a adicionarMaisUmACadaClique que esta na classeviewmodel
            viewModelLiveDataContador.adicionarMaisUmParaCadaClique()

            //todo recupera funcao recuperaTextoDigitado que esta na classeviewmodel
            binding.textViewNome.setText(" Nome: ${viewModelLiveDataContador.recuperaTextoDigitado()} ")
        }

        binding.fabCodigo.setOnClickListener {

            codigo()
        }

        binding.fabXml.setOnClickListener {

            codigoXml()
        }
    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.livedataContador()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.livedataContadorXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
