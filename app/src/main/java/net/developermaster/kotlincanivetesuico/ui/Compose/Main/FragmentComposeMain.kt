package net.developermaster.kotlincanivetesuico.ui.Compose.Main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.developermaster.kotlincanivetesuico.databinding.FragmentComposeMainBinding
import net.developermaster.kotlincanivetesuico.ui.Compose.View.Atributos.ComposeAtributos

class FragmentComposeMain : Fragment()  {

    //todo binding
    private var _binding : FragmentComposeMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentComposeMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
        binding.btn01.setOnClickListener {

            //todo chamando compose atributo
            val intent = Intent(activity, ComposeAtributos::class.java)
            startActivity(intent)

        }

        binding.btn02.setOnClickListener {



        }

        binding.btn03.setOnClickListener {



        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}