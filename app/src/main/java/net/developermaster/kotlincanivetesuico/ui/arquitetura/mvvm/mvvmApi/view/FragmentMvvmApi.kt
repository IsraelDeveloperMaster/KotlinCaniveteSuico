package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmApi.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentMvvmApiBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmApi.viewModelMvvmApi.ViewModelMvvmApi
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.InterfaceCarregando
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast

class FragmentMvvmApi : Fragment(), InterfaceCarregando {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentMvvmApiBinding? = null
    private val binding get() = _binding!!

    //todo viewmodel
    private lateinit var viewModel: ViewModelMvvmApi

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMvvmApiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fun recuperandoAsPostagens() {

            progressBar(true)

            //todo instanciando viewmodel
            this.viewModel = ViewModelProvider(this).get(ViewModelMvvmApi::class.java)

            //todo criando o observador
//            val observadorLiveData = this.viewModel.recuperaPostagensApiJsonPlaceHolder()
            viewModel.listaDePostagens.observe(viewLifecycleOwner) { lista ->

                //todo lista onde serao exibido as postagens
                var textoSerExibido = ""

                lista.forEach { postagensRecebidasApartirDaInterface ->

                    textoSerExibido += "${postagensRecebidasApartirDaInterface.id} - ${postagensRecebidasApartirDaInterface.title} \n "

                    binding.textView.text = textoSerExibido

                    progressBar(false)
                }
            }
        }

        //todo instancia de string
        val variavelMensagens = getString(R.string.NAV_MVVM_API)

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(variavelMensagens)

            mensagemSnackBar(variavelMensagens)

            recuperandoAsPostagens()
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
            putString("codigo", "${dados.mvvmApi()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.mvvmApiXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun progressBar(carregando: Boolean) {

        if (carregando) {

            binding.progressBar.visibility = View.VISIBLE
            binding.progressBar2.visibility = View.VISIBLE

        } else {

            binding.progressBar.visibility = View.GONE
            binding.progressBar2.visibility = View.GONE
        }
    }
}