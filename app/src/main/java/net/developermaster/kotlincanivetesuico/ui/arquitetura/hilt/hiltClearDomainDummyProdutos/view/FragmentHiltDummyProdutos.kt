package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.view

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
import net.developermaster.kotlincanivetesuico.databinding.FragmentHiltDomainApiDummyProdutosBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.viewModel.ViewModelDomainProdutos

@AndroidEntryPoint
class FragmentHiltDummyProdutos : Fragment() , InterfaceCarregando {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentHiltDomainApiDummyProdutosBinding? = null
    private val binding get() = _binding!!

    //todo viewmodel
    private val viewModelDummyApi: ViewModelDomainProdutos by viewModels()
    //private val viewModelDummyApi by viewModels<ViewModelDomainProdutos>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHiltDomainApiDummyProdutosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo lista onde serao exibido os usuarios
        fun funcaoRecuperaProdutos() {

            progressBar(true)

            /*viewModelDummyApi = ViewModelProvider(this)[ViewModelDomainProdutos::class.java]*/

            viewModelDummyApi.produtos.observe(viewLifecycleOwner) { listaProdutos ->

                var listaResultado = ""

                listaProdutos.forEach { produtos ->

                    val produto = produtos.title
                    val descricao = produtos.category
                    val preço = produtos.price

                    listaResultado += " Produto: $produto \n Descriçao: $descricao \n Preço: $$preço \n\n"
                }

                binding.textView.text = listaResultado

                progressBar(false)
            }
        }

        //todo instancia de string
        val variavelMensagens = getString(R.string.NAV_HILT_DOMAIN_API_DUMMY_PRODUTOS)

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(variavelMensagens)

            mensagemSnackBar(variavelMensagens)

            funcaoRecuperaProdutos()
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
            putString("codigo", "${dados.hiltCleanDomainProdutos()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.hiltCleanDomainProdutosXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun progressBar(carregando : Boolean ) {

        if (carregando ) {

            binding.progressBar.visibility = View.VISIBLE
            binding.progressBar2.visibility = View.VISIBLE

        } else {

            binding.progressBar.visibility = View.GONE
            binding.progressBar2.visibility = View.GONE
        }
    }
}