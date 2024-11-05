package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpSimples.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentMvpSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpSimples.model.ModelMvpSimples
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpSimples.presenter.InterfacePresenterMvpSimples
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpSimples.presenter.UsuariosPresenterMvpSimples
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast

class FragmentMvpSimples : Fragment(), InterfacePresenterMvpSimples {

    //todo instancia de classe onde estao os codigo e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentMvpSimplesBinding? = null
    private val binding get() = _binding!!

    //todo instancia do controlador ja com os dados dos usuarios recuperados da classe usuarios_api
    private lateinit var usuariosPresenterMvpSimples: UsuariosPresenterMvpSimples

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMvpSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usuariosPresenterMvpSimples = UsuariosPresenterMvpSimples(this)

        //todo instancia de string
        val variavelMensagens = getString(R.string.NAV_MVP_SIMPLES)

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(variavelMensagens)

            mensagemSnackBar(variavelMensagens)

            usuariosPresenterMvpSimples.recuperaUsuarios()
        }

        binding.fabCodigo.setOnClickListener {

            codigo()
        }

        binding.fabXml.setOnClickListener {

            codigoXml()
        }
    }

    //todo funcao herdada da interface
    override fun metodoExibirUsuariosQueEstaNaInterface(usuarios: ModelMvpSimples) {

        var texto_usuarios_recuperados = ""

        val nome = usuarios.nome
        val idade = usuarios.idade

        texto_usuarios_recuperados += "Nome: ${nome} , idade: ${idade} \n \n "

        Log.w("controler", " $texto_usuarios_recuperados ")

        binding.textView.text = "${texto_usuarios_recuperados}"
    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.mvpSimples()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.mvpSimplesXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}