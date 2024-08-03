package net.developermaster.kotlincanivetesuico.ui.BancoDeDados.FireBase.FireBaseMVVM.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentFirebaseMvvmAdicionarBinding
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.FireBase.FireBaseMVVM.Model.ClasseDeDadosFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.FireBase.FireBaseMVVM.ViewModel.ViewModelFireBaseMVVM


class FragmentFireBaseMVVM_Adicionar : Fragment() {

    //todo classe de dados
    private val classeDeDadosFireBaseMVVM = ClasseDeDadosFireBaseMVVM()

    //todo binding
    private var _binding: FragmentFirebaseMvvmAdicionarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirebaseMvvmAdicionarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo chama a variavel bundle
        val bundleId = arguments?.getBundle("bundleId")
        val bundleNome = arguments?.getBundle("bundleNome")
        val bundleIdade = arguments?.getBundle("bundleIdade")

        //todo recebendo dados de outro fragment
        val id = bundleId?.getString("id")
        val textInputNome = bundleNome?.getString("nome")
        val textInputIdade = bundleIdade?.getString("idade")

        //todo bundle nome
        binding.textInputNomeAdicionar.setText( textInputNome )

        //todo bundle idade
        binding.textInputIdadeAdicionar.setText( textInputIdade )

        //todo botoes
        binding.btnSalvar.setOnClickListener {

        funcaoSalva()
        }

        binding.btnAtualizar.setOnClickListener {

                funcaoAtualizar(id.toString())
        }
    }

    private fun funcaoSalva() {

        val nome = binding.textInputNomeAdicionar.text.toString()
        val idade = binding.textInputIdadeAdicionar.text.toString()

        val classeDeDadosFireBaseMVVM = ClasseDeDadosFireBaseMVVM("","",nome, idade)

        if ( nome.isEmpty() || idade.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

        } else {

            mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_SALVAR))

            val viewModelFireBaseMVVM = ViewModelFireBaseMVVM()

            viewModelFireBaseMVVM.funcaoSalvaPeloViewModel( classeDeDadosFireBaseMVVM )

            //todo fecha o fragment
            requireActivity().supportFragmentManager.popBackStack()
        }
    }

    private fun funcaoAtualizar(id: String) {


         val nome = binding.textInputNomeAdicionar.text.toString()
         val idade = binding.textInputIdadeAdicionar.text.toString()

         val classeDeDadosFireBaseMVVM = ClasseDeDadosFireBaseMVVM("",id,nome, idade)

         if ( nome.isEmpty() || idade.isEmpty()) {

             mensagemToast(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

         } else {

             mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_SALVAR))

             val viewModelFireBaseMVVM = ViewModelFireBaseMVVM()

             viewModelFireBaseMVVM.funcaoAtualizarPeloViewModel( classeDeDadosFireBaseMVVM )

             //todo fecha o fragment
             requireActivity().supportFragmentManager.popBackStack()
         }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}