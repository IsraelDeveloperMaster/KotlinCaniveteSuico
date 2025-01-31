package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvc.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentMvcBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvc.controller.UsuarioControlerMVC
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvc.model.UsuarioMVC

class FragmentMVC() : Fragment() {

    //todo instancia de classe onde estao os codigo e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentMvcBinding? = null
    private val binding get() = _binding!!

    //todo instancia do controlador ja com os dados dos usuarios recuperados da classe usuarios_api
    private lateinit var usuarioControlerMVC: UsuarioControlerMVC

    fun funcaoQueEstaDentroDoFragmentoMVC(lista: List<UsuarioMVC>) {

        var textoUsuariosRecuperados = ""

        lista.forEach { usuariosListados ->

            textoUsuariosRecuperados += "Nome: ${usuariosListados.nome} , idade: ${usuariosListados.idade} \n \n "

            Log.w("controler", " $textoUsuariosRecuperados ")

            binding.textView.text = textoUsuariosRecuperados
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMvcBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usuarioControlerMVC = UsuarioControlerMVC(this)

        //todo instancia de string
        val variavelMensagens = getString(R.string.EXT_MVC)

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(variavelMensagens)

            mensagemSnackBar(variavelMensagens)

            usuarioControlerMVC.recuperar_usuarios()
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
            putString("codigo", "${dados.mvc()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.mvcXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}