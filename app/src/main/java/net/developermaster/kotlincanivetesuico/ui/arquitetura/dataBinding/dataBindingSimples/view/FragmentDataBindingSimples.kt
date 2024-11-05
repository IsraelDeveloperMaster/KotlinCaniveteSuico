package net.developermaster.kotlincanivetesuico.ui.arquitetura.dataBinding.dataBindingSimples.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentDatabindingSimplesBinding

class FragmentDataBindingSimples : Fragment() {

    //todo binding
    private var _binding: FragmentDatabindingSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDatabindingSimplesBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fun exibeUsuarios() {

        }
        //todo botoes
        binding.btnExibirDados.setOnClickListener {

            mensagemToast(getString(R.string.NAV_DATABINDING_SIMPLES))

            mensagemSnackBar(getString(R.string.MENSAGEM_DATABINDING_GIRE))

            //todo exibe os dados no xml
            exibeUsuarios()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
