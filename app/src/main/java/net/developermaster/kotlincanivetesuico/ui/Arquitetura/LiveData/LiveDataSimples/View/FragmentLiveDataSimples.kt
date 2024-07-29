package net.developermaster.kotlincanivetesuico.ui.Arquitetura.LiveData.LiveDataSimples.View

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
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.LiveData.LiveDataSimples.Model.ClasseViewModelLiveDataSimples
import net.developermaster.classe_de_dados_codigos.ClasseDeDadosCodigos
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast

class FragmentLiveDataSimples : Fragment() {

    //todo viewmodel
    private lateinit var classeViewModelLiveDataSimples: ClasseViewModelLiveDataSimples

    //todo instancia de classe onde estao os codigo e xml
    val dados = ClasseDeDadosCodigos()

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
        classeViewModelLiveDataSimples = ViewModelProvider(this).get(ClasseViewModelLiveDataSimples::class.java)

        //todo criando o observador

        val observadorLiveData = classeViewModelLiveDataSimples.recuperarLiveData()

        observadorLiveData.observe(viewLifecycleOwner) { contador ->

            //todo recupera funcao recuperarContador que esta na classeviewmodel
            binding.textView.text = " Novo Valor: ${contador} "
        }

        //todo atributo para atualizar o ViewModel quando o texto da caixa de texto ideade mudar
        binding.textView.addTextChangedListener { textoQuePermaneceraNaCaixaDeTexto ->
            classeViewModelLiveDataSimples.variavelString = textoQuePermaneceraNaCaixaDeTexto.toString()
        }

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(getString(R.string.NAV_LIVEDATA_SIMPLES))

            mensagemSnackBar(getString(R.string.MENSAGEM_LIVEDATA_GIRE))

            //todo recupera a adicionarMaisUmACadaClique que esta na classeviewmodel
            classeViewModelLiveDataSimples.adicionarMaisUmParaCadaClique()
        }

        //todo botoes
        binding.btn02.setOnClickListener {

            mensagemToast(getString(R.string.NAV_LIVEDATA_SIMPLES))

            mensagemSnackBar(getString(R.string.MENSAGEM_LIVEDATA_GIRE))

            //todo recupera a subraiMaisUmACadaClique que esta na classeviewmodel
            classeViewModelLiveDataSimples.subtraiMaisUmParaCadaClique()
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