package net.developermaster.kotlincanivetesuico.ui.Arquitetura.DataBinding.DataBindingLiveData.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentDatabindingLivedataViewmodelBinding
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.DataBinding.DataBindingLiveData.Model.ClasseViewModelComDataBinding
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.DataBinding.DataBindingLiveData.Model.DadoDeReferenciaDoXml

class FragmentDataBindingLivedataViewModel : Fragment() {

    //todo binding
    private var _binding: FragmentDatabindingLivedataViewmodelBinding? = null
    private val binding get() = _binding!!

    //todo chama o viewmodel
    private lateinit var classeViewModelComDataBinding: ClasseViewModelComDataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDatabindingLivedataViewmodelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo instanciando databinding  // classe de dados para o xml
        val dadoDeReferenciaDoXml = DadoDeReferenciaDoXml("Inforcações enviada para o xml", "01")

        //todo exibe os dados no xml aqui permanecera na memoria
//        binding.viewmodel = dadoDeReferenciaDoXml.nome

        //todo instanciando viewmodel
        this.classeViewModelComDataBinding =
            ViewModelProvider(this)[ClasseViewModelComDataBinding::class.java]

        //todo criando o observador
        val observadorLiveData = this.classeViewModelComDataBinding.recuperarLiveData()
        observadorLiveData.observe(viewLifecycleOwner) { contador ->

            //todo caixa de texto inicio com Maria
            binding.textViewNome.text = " Nome: Maria "

            //todo recupera funcao recuperarContador que esta na classeviewmodel
            binding.textViewIdade.text = " Idade: $contador "

            mensagemToast("  Numero: $contador ")

            mensagemSnackBar(getString(R.string.MENSAGEM_DATABINDING_GIRE))
        }

        //todo botoes
        binding.btnContar.setOnClickListener {

            //todo exibe os dados no xml aqui nao permanecera
            binding.viewmodel = dadoDeReferenciaDoXml.nome

            //todo recupera a adicionarMaisUmACadaClique que esta na classeviewmodel
            this.classeViewModelComDataBinding.adicionarMaisUmParaCadaClique()

            //todo recupera funcao recuperaTextoDigitado que esta na classeviewmodel
            binding.idTextInputNome.setText(" Nome: ${this.classeViewModelComDataBinding.recuperaTextoDigitado()} ")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
