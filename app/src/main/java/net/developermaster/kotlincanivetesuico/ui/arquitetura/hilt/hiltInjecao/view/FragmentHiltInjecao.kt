package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentHiltInjecaoBinding
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroComConstrutor
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltInjecao.classes.CarroSemConstrutor
import javax.inject.Inject

//todo notacao para o hilt saber que ha uma injecao de dependencia@AndroidEntryPoint
@AndroidEntryPoint //todo chama o hilt
class FragmentHiltInjecao : Fragment() {

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    @Inject //todo notacao hilt de injecao
    lateinit var carroComConstrutor: CarroComConstrutor//todo instanciando classe carro com construtor com hilt

    @Inject //todo notacao hilt de injecao
    lateinit var carroSemConstrutor: CarroSemConstrutor//todo instanciando classe carro sem construtor com hilt

    //todo binding
    private var _binding: FragmentHiltInjecaoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHiltInjecaoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo instancia de string
        val variavelMensagens = getString(R.string.NAV_HILT_INJECAO)

        //todo botoes
        binding.btn01.setOnClickListener {

            mensagemToast(variavelMensagens)

            mensagemSnackBar(variavelMensagens)

            //todo instancia de carro com construtor
            binding.textView1.text = carroComConstrutor.motoristaAcionaMotor()

            //todo instancia de carro sem construtor
            binding.textView2.text = carroSemConstrutor.motoristaAcionaMotor()
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
            putString("codigo", "${dados.hiltInjecao()}")
        }

        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }

    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.hiltInjecaoXml()}")
        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}