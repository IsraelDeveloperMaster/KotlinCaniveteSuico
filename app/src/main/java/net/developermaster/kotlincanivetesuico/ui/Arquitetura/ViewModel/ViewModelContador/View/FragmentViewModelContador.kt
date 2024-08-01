package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ViewModel.ViewModelContador.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import net.developermaster.classe_de_dados_codigos.ClasseDeDadosCodigos
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentViewmodelContadorBinding
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ViewModel.ViewModelContador.Model.ClasseViewModel

class FragmentViewModelContador( ) : Fragment()  {

    //todo instancia de classe onde estao os codigos e xml
    val dados = ClasseDeDadosCodigos()

    //todo binding
    private var _binding : FragmentViewmodelContadorBinding? = null
    private val binding get() = _binding!!

    //todo chama o viewmodel
    private lateinit var classeViewModel : ClasseViewModel

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
//        classeViewModel = ClasseViewModelSimples()

        //todo instanciando viewmodel
        classeViewModel = ViewModelProvider( this ).get(  ClasseViewModel::class.java )

        //todo recupera o valor da variavel contador que esta na classeviewmodel
        val resultadoTextoContador = classeViewModel.recuperarContador()

        //todo depois recebe novamento o nome Lucia
//        binding.textViewNome.text = " Nome: ${classeViewModel.recuperaTextoDigitado()} "

        //todo vinculo do ViewModel à caixa de texto
//        binding.idTextInputNome.setText(classeViewModel.textoDaCaixaDeTexto)

        //todo atributo para atualizar o ViewModel quando o texto da caixa de texto mudar
        binding.idTextInputNome.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->
            classeViewModel.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()
        }

        //todo vinculo do ViewModel à caixa de texto idade
//        binding.textInputIdade.setText(classeViewModel.textoDaCaixaDeTexto)

        //todo atributo para atualizar o ViewModel quando o texto da caixa de texto ideade mudar
        binding.textInputIdade.addTextChangedListener {  textoQuePermaneceraNaCaixaDeTexto ->
            classeViewModel.textoDaCaixaDeTexto = textoQuePermaneceraNaCaixaDeTexto.toString()
        }

        //todo botoes
        binding.btnContar.setOnClickListener {

            //todo recupera a adicionarMaisUmACadaClique que esta na classeviewmodel
            classeViewModel.adicionarMaisUmParaCadaClique()

            //todo caixa de texto inicio com Maria
            binding.textViewNome.text = " Nome: Maria "

//            binding.textViewNome.text = " Nome: ${classeViewModel.recuperaTextoDigitado()} "

            //todo recupera funcao recuperarContador que esta na classeviewmodel
            binding.textViewIdade.text = " Idade: ${classeViewModel.recuperarContador()} "

            mensagemToast("  Numero: ${classeViewModel.recuperarContador()}  ")

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
