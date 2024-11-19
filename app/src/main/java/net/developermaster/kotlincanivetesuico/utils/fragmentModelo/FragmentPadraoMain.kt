package net.developermaster.kotlincanivetesuico.utils.fragmentModelo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.developermaster.kotlincanivetesuico.databinding.FragmentPadraoBinding

class FragmentPadraoMain : Fragment()  {

    /**
     *
     * Documennte a classe aqui
     *
     */

    //todo binding
    private var _binding : FragmentPadraoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPadraoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
        binding.btn01.setOnClickListener {

//            findNavController().navigate(R.id.)

        }

        binding.btn02.setOnClickListener {

//            findNavController().navigate(R.id.)

        }

        binding.btn03.setOnClickListener {

//            findNavController().navigate(R.id.)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}