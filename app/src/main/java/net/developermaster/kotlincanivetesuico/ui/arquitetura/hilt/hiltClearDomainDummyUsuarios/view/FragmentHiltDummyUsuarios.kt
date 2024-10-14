package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.InterfaceCarregando
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentHiltDomainApiDummyUsuariosBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.viewModel.ViewModelDomainUsuarios

@AndroidEntryPoint
class FragmentHiltDummyUsuarios : Fragment(), InterfaceCarregando {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo chamo o binding
    private var _binding: FragmentHiltDomainApiDummyUsuariosBinding? = null
    private val binding get() = _binding!!

    //todo chama o viewmodel
    private val viewModel: ViewModelDomainUsuarios by viewModels()
    //private val viewModelDummyApi by viewModels<ViewModel_DummyApi>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHiltDomainApiDummyUsuariosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo lista onde serao exibido os usuarios

        fun funcaoRecuperaUsuarios() {

            progressBar(true)

            /*viewModelDummyApi = ViewModelProvider(this)[ViewModel_DummyApi::class.java]*/

            viewModel.usuarios.observe(viewLifecycleOwner) { listaUsuarios ->

                var listaResultado = ""

                listaUsuarios.forEach { usuario ->

                    val nome = usuario.username
                    val sobrenome = usuario.lastName
                    val idade = usuario.age

                    listaResultado += " Nome: $nome \n Sobre Nome: $sobrenome \n idade: $idade \n\n"
                }

                binding.textView.text = listaResultado

                progressBar(false)
            }
        }

        //todo instancia de string
        val variavelMensagens = getString(R.string.NAV_HILT_DOMAIN_API_DUMMY_USUARIOS)

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(variavelMensagens)

            mensagemSnackBar(variavelMensagens)

            funcaoRecuperaUsuarios()
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
            putString("codigo", "${dados.hiltCleanDomainUsuarios()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.hiltCleanDomainUsuariosXml()}")
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