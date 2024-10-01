package net.developermaster.kotlincanivetesuico.ui.arquitetura.liveData.liveDataSimples.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentLivedataSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.liveData.liveDataSimples.viewModel.ViewModelLiveDataSimples
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast

class FragmentLiveDataSimples : Fragment() {

    //todo viewmodel
    private lateinit var viewModelLiveDataSimples: ViewModelLiveDataSimples

    //todo instancia de classe onde estao os codigo e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentLivedataSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentLivedataSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo instanciando viewmodel
        viewModelLiveDataSimples = ViewModelProvider(this).get(ViewModelLiveDataSimples::class.java)

        //todo criando o observador

        val observadorLiveData = viewModelLiveDataSimples.recuperarLiveData()

        observadorLiveData.observe(viewLifecycleOwner) { contador ->

            //todo recupera funcao recuperarContador que esta na classeviewmodel
            binding.textView.text = " Novo Valor: ${contador} "
        }

        //todo atributo para atualizar o ViewModelContador quando o texto da caixa de texto ideade mudar
        binding.textView.addTextChangedListener { textoQuePermaneceraNaCaixaDeTexto ->
            viewModelLiveDataSimples.variavelString = textoQuePermaneceraNaCaixaDeTexto.toString()
        }

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(getString(R.string.NAV_LIVEDATA_SIMPLES))

            mensagemSnackBar(getString(R.string.MENSAGEM_LIVEDATA_GIRE))

            //todo recupera a adicionarMaisUmACadaClique que esta na classeviewmodel
            viewModelLiveDataSimples.adicionarMaisUmParaCadaClique()
        }

        //todo botoes
        binding.btn02.setOnClickListener {

            mensagemToast(getString(R.string.NAV_LIVEDATA_SIMPLES))

            mensagemSnackBar(getString(R.string.MENSAGEM_LIVEDATA_GIRE))

            //todo recupera a subraiMaisUmACadaClique que esta na classeviewmodel
            viewModelLiveDataSimples.subtraiMaisUmParaCadaClique()
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
            putString("codigo", "${dados.livedataSimples()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.livedataSimplesXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }
}