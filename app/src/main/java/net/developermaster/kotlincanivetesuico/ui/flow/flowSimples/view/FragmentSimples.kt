package net.developermaster.kotlincanivetesuico.ui.flow.flowSimples.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import net.developermaster.classe_de_dados_codigos.ClasseDeDadosCodigos
import net.developermaster.kotlincanivetesuico.databinding.FragmentFlowSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.viewModel.ViewModelFlowMvvm


class FragmentSimples : Fragment() {

    //todo instancia de classe onde estao os codigos e xml
    val dados = ClasseDeDadosCodigos()

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

        //todo botoes
        binding.btn01.setOnClickListener {

            ViewModelFlowMvvm().example3()

        }

        binding.fabCodigo.setOnClickListener {

            codigo()
        }

        binding.fabXml.setOnClickListener {

            codigoXml()
        }
    }

    fun funcaoFlow(): Unit {

            val counter: Flow<Int> = flow {
                var bombitas = 1
                while (true){
                    bombitas += 1
                    emit(bombitas)
                    delay(1000)
                    Log.d("bombitas", "${bombitas}")
            }
        }
    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.mvc()}")
        }

//        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.mvcXml()}")
//        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}