package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentHiltSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltSimples.classes.ClasseSendoInjetada
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import javax.inject.Inject

@AndroidEntryPoint
class FragmentHiltSimples : Fragment() {

    //todo instancia de classe onde estao os codigo e xml
    val dados = modelCodigos()

    @Inject //todo instancia da classe Que Esta Sendo Injetada
    lateinit var classeSendoInjetada: ClasseSendoInjetada//todo dentro desta classe esta sendo injetada a interface

    //todo binding
    private var _binding: FragmentHiltSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHiltSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo instancia de string
        val variavelMensagens = getString(R.string.NAV_HILT_INJECAO_SIMPLES)

        //todo botoes
        binding.btn01.setOnClickListener {

            binding.textView.setText(classeSendoInjetada.interfaceHiltSimples.metodoDaInterfaceHiltSimples())

                mensagemToast(variavelMensagens)

                mensagemSnackBar(variavelMensagens)
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
            putString("codigo", "${dados.hiltSimples()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.hiltSimplesXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }
}