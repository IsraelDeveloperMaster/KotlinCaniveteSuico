package net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.view


import android.content.ComponentName
import android.content.Context.BIND_AUTO_CREATE
import android.content.Intent
import android.content.ServiceConnection
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import net.developermaster.kotlincanivetesuico.databinding.FragmentServicesForegroundSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.classes.CustomApplication
import net.developermaster.kotlincanivetesuico.ui.services.serviceForeGround.classes.ServicesClassForeGround
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos


class FragmentServicesForeGroundSimples : Fragment(), ServiceConnection {

    /**
     *
     * Documennte a classe aqui
     *
     */

    private lateinit var serviceConnection: ServiceConnection

    private lateinit var servicesRecuperado: ServicesClassForeGround

    private lateinit var customApplication: CustomApplication


    //todo IbindService para conexao com servico
    override fun onServiceConnected(conectado1: ComponentName?, conectado2: IBinder?) {
        Log.d("MyService", "Serviço conectado")

        val myBinder = conectado2 as ServicesClassForeGround.MyBinder

        servicesRecuperado = myBinder.recuperarService()
    }

    //todo IbindService para desconexao com servico
    override fun onServiceDisconnected(desconectado: ComponentName?) {
        Log.d("MyService", "Serviço desconectado")

        Toast.makeText(requireContext(), "Serviço desconectado", Toast.LENGTH_SHORT).show()
    }

    //todo binding
    private var _binding: FragmentServicesForegroundSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentServicesForegroundSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo customApplication
        customApplication = CustomApplication()

        //todo serviceConnection para conexao com servico
        serviceConnection = this

        //todo intent serviceclass para iniciar servico
        val intentServiceClass = Intent(requireContext(), ServicesClassForeGround::class.java)

        //todo botoes
        binding.btn01.setOnClickListener {

            //todo if version >= 26 = Oreo inicia com startForegroundService else startService
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                requireContext().startForegroundService(intentServiceClass)
            }


            //todo conexao com bindService
            requireActivity().bindService(intentServiceClass, serviceConnection, BIND_AUTO_CREATE)


            //todo customApplication
            customApplication = CustomApplication()
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
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}