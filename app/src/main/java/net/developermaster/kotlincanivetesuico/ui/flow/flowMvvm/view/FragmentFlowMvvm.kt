package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentFlowMvvmBinding
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.viewModel.ViewModelFlowMvvm
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast

class FragmentFlowMvvm : Fragment() {

    //todo instancia de viewModel
    private val viewModelFlowMvvm: ViewModelFlowMvvm by viewModels()

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentFlowMvvmBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFlowMvvmBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("UnsafeRepeatOnLifecycleDetector")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btn01.setOnClickListener {

            lifecycleScope.launch {

                repeatOnLifecycle(Lifecycle.State.STARTED) {

                    viewModelFlowMvvm.estadoFlowPublico.collect { estado ->

                        when (estado) {

                            is FlowEstado.Error -> {

                                binding.textView.text = estado.mensagemError

                                mensagemToast( getString(R.string.MENSAGEM_FLOW_ERRO) + " \n " + estado.mensagemError )
                            }

                            FlowEstado.Loading -> {

                                binding.progressBar
                            }

                            is FlowEstado.Sucesso1 -> {

                                binding.textView.text = estado.clientes.toString()

                                mensagemSnackBar(getString(R.string.MENSAGEM_FLOW_SUCESSO)  + " \n " + estado.clientes.toString() )
                            }

                            is FlowEstado.Sucesso2 ->

                                binding.textView.text = estado.clientes
                        }
                    }
                }
            }

            viewModelFlowMvvm.example5()
        }

        binding.btn02.setOnClickListener {

            lifecycleScope.launch {

                repeatOnLifecycle(Lifecycle.State.STARTED) {

                    viewModelFlowMvvm.estadoFlowPublico.collect { estado ->

                        when (estado) {

                            is FlowEstado.Error -> {

                                binding.textView.text = estado.mensagemError

                                mensagemToast( getString(R.string.MENSAGEM_FLOW_ERRO) + " \n " + estado.mensagemError )
                            }

                            FlowEstado.Loading -> {

                                binding.progressBar
                            }

                            is FlowEstado.Sucesso1 -> {

                                binding.textView.text = ""

                                mensagemSnackBar(getString(R.string.MENSAGEM_FLOW_SUCESSO)  + " \n " + estado.clientes.toString() )
                            }

                            is FlowEstado.Sucesso2 ->

                                binding.textView.text = estado.clientes
                        }
                    }
                }
            }

            viewModelFlowMvvm.example6()

/*            viewModelFlowMvvm.funcaoViewModelRandom()

            viewModelFlowMvvm.modelFlowMvvmMutableLiveData.observe(viewLifecycleOwner) { dadosRecuperadosPeloViewModel ->

                binding.textView.text = " Frase: ${ dadosRecuperadosPeloViewModel.texto } \n \n  Autor: ${ dadosRecuperadosPeloViewModel.autor } \n "
            }

            */
        }

        binding.btn03.setOnClickListener {

            lifecycleScope.launch {

                repeatOnLifecycle(Lifecycle.State.STARTED) {

                    viewModelFlowMvvm.estadoFlowPublico.collect { estado ->

                        when (estado) {

                            is FlowEstado.Error -> {

                                binding.textView.text = estado.mensagemError

                                mensagemToast(getString(R.string.MENSAGEM_FLOW_ERRO) + " \n " + estado.mensagemError)
                            }

                            FlowEstado.Loading -> {

                                binding.progressBar
                            }

                            is FlowEstado.Sucesso1 -> {

                                binding.textView.text = ""

                                mensagemSnackBar(getString(R.string.MENSAGEM_FLOW_SUCESSO) + " \n " + estado.clientes.toString())
                            }

                            is FlowEstado.Sucesso2 ->

                                binding.textView.text = estado.clientes

                        }
                    }
                }
            }

            viewModelFlowMvvm.example7()
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