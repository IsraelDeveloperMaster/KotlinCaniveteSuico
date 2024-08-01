package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Presentation.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import net.developermaster.classe_de_dados_codigos.ClasseDeDadosCodigos
import net.developermaster.classes_de_utilizade_geral.InterfaceCarregando
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentCleanDomainBinding
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Data.API.Retrofit_Domain
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Data.Repository.PostagemRepositorioFireBase_Domain
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Data.Repository.PostagemRepositorio_Domain
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Domain.UserCase.PostagemUseCase
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Presentation.ViewModel.ViewModelDomain
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Presentation.ViewModel.ViewModelFactoryDomain

class FragmentCleanDomain : Fragment(), InterfaceCarregando {

    //todo instancia de classe onde estao os codigos e xml
    val dados = ClasseDeDadosCodigos()

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
        val classeRetrofit = Retrofit_Domain.recuperaPostagensApi_Domain()

        ////todo instanciando postagem repositorio
        val postagemRepositorioDomain = PostagemRepositorio_Domain()

        //todo instanciando postagem repositoty firebase
        val postagemRepositorioFireBaseDomain = PostagemRepositorioFireBase_Domain()

        //todo instanciando postagem usecase
        val postagemUseCase = PostagemUseCase(postagemRepositorioDomain)

        //todo instanciando viewmodel Factory
        viewModel = ViewModelProvider(
            this, ViewModelFactoryDomain(postagemUseCase)
        )[ViewModelDomain::class.java]

        fun recuperandoAsPostagens() {

            progressBar(true)

            //todo criando o observador
            val observadorLiveData = this.viewModel.recuperaPostagensApiJsonPlaceHolder()
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