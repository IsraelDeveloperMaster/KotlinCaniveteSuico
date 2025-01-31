package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentCleanDomainBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.repository.RepositorioDomain
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.userCase.PostagemUseCase
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.viewModel.ViewModelDomain
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.viewModel.ViewModelFactoryDomain
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.InterfaceCarregando
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast

class FragmentCleanDomain : Fragment(), InterfaceCarregando {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentCleanDomainBinding? = null
    private val binding get() = _binding!!

    //todo chama o viewmodel
    private lateinit var viewModel: ViewModelDomain

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentCleanDomainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo instanciando postagem interface retrofit
//        val classeRetrofit = ClasseRetrofitDomain.recuperaPostagensApi_Domain()

        ////todo instanciando postagem repositorio
        val postagemRepositorioDomain = RepositorioDomain()

        //todo instanciando postagem repositoty firebase
//        val postagemRepositorioFireBaseDomain = RepositorioFireBaseDomain()

        //todo instanciando postagem usecase
        val postagemUseCase = PostagemUseCase(postagemRepositorioDomain)

        //todo instanciando viewmodel Factory
        viewModel = ViewModelProvider(
            this, ViewModelFactoryDomain(postagemUseCase)
        )[ViewModelDomain::class.java]

        fun recuperandoAsPostagens() {

            progressBar(true)

            //todo criando o observador
//            val observadorLiveData = this.viewModel.recuperaPostagensApiJsonPlaceHolder()
            viewModel.listaDePostagens.observe(viewLifecycleOwner) { lista ->

                //todo lista onde serao exibido as postagens
                var textoSerExibido = ""

                lista.forEach { postagensRecebidasApartirDaInterface ->

                    textoSerExibido += "${postagensRecebidasApartirDaInterface.codigo} - ${postagensRecebidasApartirDaInterface.titulo} \n "

                    binding.textView.text = textoSerExibido

                    progressBar(false)
                }
            }
        }

        //todo instancia de string
        val variavelMensagens = getString(R.string.NAV_CLEAN_ARCHITECTURE_DOMAIN)

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
            putString("codigo", "${dados.cleanDomain()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.cleanDomainXml()}")
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