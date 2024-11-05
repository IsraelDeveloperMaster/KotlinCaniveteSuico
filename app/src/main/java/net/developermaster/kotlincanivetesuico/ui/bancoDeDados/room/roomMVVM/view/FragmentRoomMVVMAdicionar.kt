package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.view

import ViewModelRoomMVVM
import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentRoomMvvmAdicionarBinding
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.Repository.RepositorioRoomMVVM


class FragmentRoomMVVMAdicionar() : Fragment()  {

    //todo instancia de view model
    private var viewModelRoomMVVM: ViewModelRoomMVVM? = null

    //todo instancia de repositorio
    private val repositorioRoomMVVM: RepositorioRoomMVVM? = null

    //todo binding
    private var _binding: FragmentRoomMvvmAdicionarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentRoomMvvmAdicionarBinding.inflate(inflater, container, false)
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
        binding.btnAtualizar.setOnClickListener {

                funcaoAtualizar(id.toString())
        }
    }

    private fun funcaoAtualizar(id: String) {

         val nome = binding.textInputNomeAdicionar.text.toString()
         val idade = binding.textInputIdadeAdicionar.text.toString()

        val modelEntidadeRoomMVVM = ModelEntidadeRoomMVVM(id.toInt(), nome, idade)

         if ( nome.isEmpty() || idade.isEmpty()) {

             mensagemToast(getString(R.string.MENSAGEM_ROOM_CAMPOS))

         } else {

             mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_ATUALIZAR))

             lifecycleScope.launch {

                 //todo instancia de view model
                 val viewModelRoomMVVM = ViewModelRoomMVVM(requireContext().applicationContext as Application)

                 viewModelRoomMVVM.funcaoAtualizarPeloViewModel(modelEntidadeRoomMVVM)

             }
             //todo fecha o fragment
             requireActivity().supportFragmentManager.popBackStack()
         }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}