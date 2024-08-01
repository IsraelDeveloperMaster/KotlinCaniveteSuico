package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentMvpApiBinding
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.Model.ClasseDeDadosAPIJsonPlaceHolder_MvpApi
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.Model.PostagemApiJsonPlaceHolder_MvpApi
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.Presenter.InterfacePresenterPostagemApiJsonPlaceHolder_MvpApi
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.Presenter.PostagemPresenterApiJsonPlaceHolder_MvpApi
import net.developermaster.classe_de_dados_codigos.ClasseDeDadosCodigos
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast

class FragmentMvpApi : Fragment(), InterfacePresenterPostagemApiJsonPlaceHolder_MvpApi { //todo interface presenter postagens

    //todo instancia de classe onde estao os codigos e xml
    val dados = ClasseDeDadosCodigos()

    //todo binding
    private var _binding: FragmentMvpApiBinding? = null
    private val binding get() = _binding!!

    //todo instancia do presente ja com os dados da api recuperados
    private lateinit var postagem_Presenter_ApiJsonPlaceHolder: PostagemPresenterApiJsonPlaceHolder_MvpApi

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMvpApiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo instancias da classe postagemApiJsonPlaceHolder
        val postagemApiJsonPlaceHolder = PostagemApiJsonPlaceHolder_MvpApi()

        //todo instancias da classe presenter
        postagem_Presenter_ApiJsonPlaceHolder =
            PostagemPresenterApiJsonPlaceHolder_MvpApi(this, postagemApiJsonPlaceHolder)

        //todo instancia de string
        val variavelMensagens = getString(R.string.NAV_MVP_API)

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(variavelMensagens)

            mensagemSnackBar(variavelMensagens)

            postagem_Presenter_ApiJsonPlaceHolder.recuperaPostagensApiJsonPlaceHolder()
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
            putString("codigo", "${dados.mvpApi()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.mvpApiXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun exibirUsuariosApartirDaInterfacePresenter(lista: List<ClasseDeDadosAPIJsonPlaceHolder_MvpApi>) {

        var textoSerExibido = ""

        lista.forEach { postagensRecebidasApartirDaInterface ->

            textoSerExibido += "${postagensRecebidasApartirDaInterface.id} - ${postagensRecebidasApartirDaInterface.title} \n "

            binding.textView.text = textoSerExibido
        }
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
