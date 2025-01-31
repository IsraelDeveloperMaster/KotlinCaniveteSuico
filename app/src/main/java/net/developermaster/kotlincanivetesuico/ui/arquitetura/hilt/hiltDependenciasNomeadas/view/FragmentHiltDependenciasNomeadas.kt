package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentHiltDependenciasNomeadasBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Banda
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltDependenciasNomeadas.classes.Musico
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import javax.inject.Inject

//todo notacao para o hilt saber que ha uma injecao de dependencia@AndroidEntryPoint
@AndroidEntryPoint //todo chama o hilt
class FragmentHiltDependenciasNomeadas : Fragment() {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo instanciando classe  com hilt
    @Inject //todo notacao hilt de injecao
    lateinit var musico: Musico

    @Inject //todo notacao hilt de injecao
    lateinit var banda: Banda

    //todo binding
    private var _binding: FragmentHiltDependenciasNomeadasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHiltDependenciasNomeadasBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo instancia de string
        val variavelMensagens = getString(R.string.NAV_HILT_DEPENDENCIAS_NOMEADAS)

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(variavelMensagens)

            mensagemSnackBar(variavelMensagens)

            binding.textView.setText(" ${banda.tudoSendoTocado()}")

            binding.textView2.setText(" ${musico.tocar()}")

            binding.textView3.setText(" ${musico.mensagemToast(variavelMensagens)}")//chama a fucao mensagemToast
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
            putString("codigo", "${dados.hiltDependenciasNomeadas()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.hiltDependenciasNomeadasXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}