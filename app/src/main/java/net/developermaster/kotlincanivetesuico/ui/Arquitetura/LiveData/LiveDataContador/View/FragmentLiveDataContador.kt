package net.developermaster.kotlincanivetesuico.ui.Arquitetura.LiveData.LiveDataContador.View

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
import net.developermaster.kotlincanivetesuico.databinding.FragmentLivedataContadorBinding
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.LiveData.LiveDataContador.Model.ClasseViewModelLiveDataContador
import net.developermaster.classe_de_dados_codigos.ClasseDeDadosCodigos
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast

class FragmentLiveDataContador : Fragment()  {

    //todo instancia de classe onde estao os codigos e xml
    val dados = ClasseDeDadosCodigos()

    //todo binding
    private var _binding : FragmentLivedataContadorBinding? = null
    private val binding get() = _binding!!

    //todo viewmodel
    private lateinit var classeViewModelLiveDataContador: ClasseViewModelLiveDataContador

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
        classeViewModelLiveDataContador = ViewModelProvider( this ).get(  ClasseViewModelLiveDataContador::class.java )

        //todo criando o observador

        val observadorLiveData = classeViewModelLiveDataContador.recuperarLiveData()

        observadorLiveData.observe( viewLifecycleOwner ,  ) { contador ->

            //todo caixa de texto inicio com Maria
            binding.textViewNome.text = " Nome: Maria "

            //todo recupera funcao recuperarContador que esta na classeviewmodel
            binding.textViewIdade.text = " Idade: ${ contador } "
        }

        //todo atributo para atualizar o ViewModel quando o texto da caixa de texto mudar
        binding.idTextInputNome.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->
            classeViewModelLiveDataContador.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()
        }

        //todo atributo para atualizar o ViewModel quando o texto da caixa de texto ideade mudar
        binding.textInputIdade.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->
            classeViewModelLiveDataContador.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()

        }

        //todo botoes
        binding.btnContar.setOnClickListener { view ->

            mensagemToast(getString(R.string.NAV_LIVEDATA_CONTADOR))

            mensagemSnackBar(getString(R.string.MENSAGEM_LIVEDATA_GIRE))

            //todo recupera a adicionarMaisUmACadaClique que esta na classeviewmodel
            classeViewModelLiveDataContador.adicionarMaisUmParaCadaClique()

            //todo recupera funcao recuperaTextoDigitado que esta na classeviewmodel
            binding.idTextInputNome.setText(" Nome: ${classeViewModelLiveDataContador.recuperaTextoDigitado()} ")
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
