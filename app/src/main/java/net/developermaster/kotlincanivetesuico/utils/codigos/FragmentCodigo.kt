package net.developermaster.kotlincanivetesuico.utils.codigos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.developermaster.kotlincanivetesuico.databinding.FragmentCodigoBinding

class FragmentCodigo : Fragment(){

    //todo chama a variavel bundle
    private var codigo: String? = null
    private var codigoXml: String? = null

    //todo binding
    private var _binding: FragmentCodigoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentCodigoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo recebendo dados de outro fragment
        codigo = arguments?.getString("codigo")
        codigoXml = arguments?.getString("codigoXml")

        //todo editext apresentacao de codigos
        binding.idTextInputCodigo.setText( codigo )

        //todo editext apresentacao de xml
        binding.idTextInputXml.setText( codigoXml )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}