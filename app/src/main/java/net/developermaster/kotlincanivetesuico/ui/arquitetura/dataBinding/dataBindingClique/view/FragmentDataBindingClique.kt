package net.developermaster.kotlincanivetesuico.ui.arquitetura.dataBinding.dataBindingClique.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentDatabindingComEventoDeCliqueBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.dataBinding.dataBindingClique.model.ModelXmlClique
import net.developermaster.kotlincanivetesuico.ui.arquitetura.dataBinding.dataBindingClique.viewModel.ViewModelClique

class FragmentDataBindingClique : Fragment()  {

    //todo binding
    private var _binding : FragmentDatabindingComEventoDeCliqueBinding? = null
    private val binding get() = _binding!!

    //todo chama o viewmodel
    private lateinit var classeViewModelComEventoDeClique: ViewModelClique

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDatabindingComEventoDeCliqueBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo instanciando databinding  // classe de dados para o xml
        val dadoDeReferenciaDoXml = ModelXmlClique ( "Julia" , "25" )

        //todo instanciando viewmodel
        this.classeViewModelComEventoDeClique = ViewModelProvider( this ).get(  ViewModelClique::class.java )

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(getString(R.string.NAV_DATABINDING_CLIQUE))

            mensagemSnackBar(getString(R.string.MENSAGEM_DATABINDING_GIRE))

            //todo exibe os dados no xml
            binding.viewmodel = dadoDeReferenciaDoXml.nome
            binding.viewmodel2 = dadoDeReferenciaDoXml.idade
        }
    }

    /*//todo executando evento de clique
    inner class eventoDeClique() {

        fun clique( view: View ) {

//            binding.eventoClique

//            Toast.makeText(context, " Evento de Clique Executado ", Toast.LENGTH_LONG).show()
        }
    }*/

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
