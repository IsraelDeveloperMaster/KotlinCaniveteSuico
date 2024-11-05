package net.developermaster.kotlincanivetesuico.ui.flow.flowSimples.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.databinding.FragmentFlowSimplesBinding
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar


class FragmentSimples : Fragment() {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentFlowSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFlowSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo variavel flow simples
        val contador: Flow<Int> = flow {
            var clientes = 1
            while (true){
                clientes += 1
                emit(clientes)
                delay(1000)
            }
        }

        //todo botoes
        binding.btn01.setOnClickListener {

            lifecycleScope.launch {

                contador.collect { clientes ->

                    binding.textView.text = "Cliente: $clientes"

                    mensagemSnackBar( "Cliente: $clientes" )

                    Log.d("clientes", "Cliente: $clientes" )
                }
            }
        }

        binding.fabCodigo.setOnClickListener {

            codigo()
        }

        binding.fabXml.setOnClickListener {

            codigoXml()
        }
    }

    private fun codigo() {

//        val bundle1 = Bundle().apply {
//            putString("codigo", "${dados.mvc()}")
//        }

//        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

//        val bundle2 = bundleOf("codigoXml" to "${dados.mvcXml()}")
//        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}