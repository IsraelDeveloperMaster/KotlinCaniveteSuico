package net.developermaster.kotlincanivetesuico.ui.arquitetura.viewModel.viewModelContador.view

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
import net.developermaster.kotlincanivetesuico.databinding.FragmentViewmodelContadorBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.viewModel.viewModelContador.viewModel.ViewModelContador
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast

class FragmentViewModelContador( ) : Fragment()  {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding : FragmentViewmodelContadorBinding? = null
    private val binding get() = _binding!!

    //todo chama o viewmodel
    private lateinit var viewModelContador : ViewModelContador

    //todo a variavel se iniciara sempre com 0
    private var contador = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentViewmodelContadorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo instancia de classeviewmodel
//        viewModelContador = ViewModelSimples()

        //todo instanciando viewmodel
        viewModelContador = ViewModelProvider( this ).get(  ViewModelContador::class.java )

        //todo recupera o valor da variavel contador que esta na classeviewmodel
//        val resultadoTextoContador = viewModelContador.recuperarContador()

        //todo depois recebe novamento o nome Lucia
//        binding.textViewNome.text = " Nome: ${viewModelContador.recuperaTextoDigitado()} "

        //todo vinculo do ViewModelContador à caixa de texto
//        binding.idTextInputNome.setText(viewModelContador.textoDaCaixaDeTexto)

        //todo atributo para atualizar o ViewModelContador quando o texto da caixa de texto mudar
        binding.idTextInputNome.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->
            viewModelContador.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()
        }

        //todo vinculo do ViewModelContador à caixa de texto idade
//        binding.textInputIdade.setText(viewModelContador.textoDaCaixaDeTexto)

        //todo atributo para atualizar o ViewModelContador quando o texto da caixa de texto ideade mudar
        binding.textInputIdade.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->
            viewModelContador.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()
        }

        //todo botoes
        binding.btnContar.setOnClickListener {

            //todo recupera a adicionarMaisUmACadaClique que esta na classeviewmodel
            viewModelContador.adicionarMaisUmParaCadaClique()

            //todo caixa de texto inicio com Maria
            binding.textViewNome.text = " Nome: Maria "

//            binding.textViewNome.text = " Nome: ${viewModelContador.recuperaTextoDigitado()} "

            //todo recupera funcao recuperarContador que esta na classeviewmodel
            binding.textViewIdade.text = " Idade: ${viewModelContador.recuperarContador()} "

            mensagemToast("  Numero: ${viewModelContador.recuperarContador()}  ")

            mensagemSnackBar( getString(R.string.`MESAGEM_VIEWMODEL_GIRE`) )
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
            putString("codigo", "${dados.viewmodelContador()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.viewmodelContadorXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
