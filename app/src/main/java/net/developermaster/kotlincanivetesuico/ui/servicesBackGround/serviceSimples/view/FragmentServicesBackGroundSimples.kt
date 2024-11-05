package net.developermaster.kotlincanivetesuico.ui.servicesBackGround.serviceSimples.view

import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.developermaster.kotlincanivetesuico.databinding.FragmentServicesBackgroundSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.servicesBackGround.classes.ServicesClass
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos


class FragmentServicesBackGroundSimples : Fragment() {

    /**
     *
     *
     *
     */

    private lateinit var serviceConnection: ServiceConnection
    private lateinit var serviceClass: ServicesClass


    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentServicesBackgroundSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentServicesBackgroundSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo intent
        val intentServiceClass = Intent(requireContext(), ServicesClass::class.java)

        //todo botoes
        binding.btn01.setOnClickListener {


            //todo bundle recebido pelo serviceClass
            intentServiceClass.putExtra("tempoDuracao", 3000L) //todo a cada 3 segundos executa o codigo abaixo

            //todo iniciar servico
            requireContext().startService( intentServiceClass )

            //todo iniciar bindService
//            requireActivity().bindService(intentServiceClass, serviceConnection, BIND_AUTO_CREATE)
        }

        binding.btn02.setOnClickListener {

            val intent = Intent(requireContext(), ServicesClass::class.java)

            //todo iniciar servico
            requireContext().stopService(intent)
        }

        binding.btn03.setOnClickListener {

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