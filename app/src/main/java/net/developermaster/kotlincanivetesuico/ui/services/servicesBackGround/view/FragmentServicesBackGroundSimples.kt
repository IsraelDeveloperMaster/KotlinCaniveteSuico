package net.developermaster.kotlincanivetesuico.ui.services.servicesBackGround.view


import android.content.ComponentName
import android.content.Context.BIND_AUTO_CREATE
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import net.developermaster.kotlincanivetesuico.databinding.FragmentServicesBackgroundSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.services.servicesBackGround.classes.ServicesClassBackGround
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos


class FragmentServicesBackGroundSimples : Fragment(), ServiceConnection {

    /**
     *
     * Documennte a classe aqui
     *
     */

    private lateinit var serviceConnection: ServiceConnection

    private lateinit var servicesRecuperado: ServicesClassBackGround

    //todo IbindService para conexao com servico
    override fun onServiceConnected(conectado1: ComponentName?, conectado2: IBinder?) {
        Log.d("MyService", "Serviço conectado")

        val myBinder = conectado2 as ServicesClassBackGround.MyBinder

        servicesRecuperado = myBinder.recuperarService()
    }

    //todo IbindService para desconexao com servico
    override fun onServiceDisconnected(desconectado: ComponentName?) {
        Log.d("MyService", "Serviço desconectado")

        Toast.makeText(requireContext(), "Serviço desconectado", Toast.LENGTH_SHORT).show()
    }

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

        //todo serviceConnection para conexao com servico
        serviceConnection = this

        //todo intent serviceclass para iniciar servico
        val intentServiceClass = Intent(requireContext(), ServicesClassBackGround::class.java)

        //todo botoes
        binding.btn01.setOnClickListener {

            //todo bundle recebido pelo serviceClass
            intentServiceClass.putExtra(
                "tempoDuracao", 1000L
            ) //todo a cada 1 segundos executa o codigo abaixo

            //todo iniciar servico
            requireContext().startService(intentServiceClass)

            //todo conexao com bindService
            requireActivity().bindService(intentServiceClass, serviceConnection, BIND_AUTO_CREATE)

        }

        binding.btn02.setOnClickListener {
            //todo para o servico
            requireContext().stopService(intentServiceClass)

            //todo parando bindService
            requireActivity().unbindService(serviceConnection)
        }

        binding.btn03.setOnClickListener {

            val cronometro = servicesRecuperado.cronometro

            Toast.makeText(requireContext(), "Cronometro: $cronometro", Toast.LENGTH_SHORT).show()
        }

        binding.fabCodigo.setOnClickListener {

            codigo()
        }

        binding.fabXml.setOnClickListener {

            codigoXml()
        }
    }

    private fun codigo() {

        /*
    val bundle1 = Bundle().apply {
        putString("codigo", "${dados.mvc()}")
        }
        */

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