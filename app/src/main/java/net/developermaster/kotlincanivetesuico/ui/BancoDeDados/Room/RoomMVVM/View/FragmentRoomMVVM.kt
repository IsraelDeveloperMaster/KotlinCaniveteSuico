package net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomMVVM.View

import ViewModelRoomMVVM
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import net.developermaster.classe_de_dados_codigos.ClasseDeDadosCodigos
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentRoomMvvmBinding
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomMVVM.Dao.InterfaceDaoRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomMVVM.DataBase.BancoDeDadosRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomMVVM.ModelEntidades.ClasseDeDadosEntidadeRoomMVVM

class FragmentRoomMVVM : Fragment() {

    //todo instancia de view model
    var viewModelRoomMVVM: ViewModelRoomMVVM? = null

    //todo instancia de room
    var bancoDeDadosRoomMVVM: BancoDeDadosRoomMVVM? = null
    var interfaceDaoRoomMVVM: InterfaceDaoRoomMVVM? = null

    //todo instancia de classe onde estao os codigos e xml
    val dados = ClasseDeDadosCodigos()

    //todo binding
    private var _binding: FragmentRoomMvvmBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentRoomMvvmBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo instancia de view provider
        viewModelRoomMVVM = ViewModelProvider(this).get(ViewModelRoomMVVM::class.java)

        //todo inicia o campo id com 0
        binding.textInputId.setText("0")

        bancoDeDadosRoomMVVM = BancoDeDadosRoomMVVM.recuperarInstanciaRoomMVVM(requireContext())
        interfaceDaoRoomMVVM = bancoDeDadosRoomMVVM?.classeDaoRoomMVVM()

        //todo instancia de string
        val variavelMensagens = getString(R.string.EXT_ROOM)

        //todo botoes
        binding.btnSalvar.setOnClickListener {

            funcaoSalvar()
        }
        binding.btnAtualizar.setOnClickListener {

            funcaoAtualizar()
//            funcaoListarTodosComListView()
        }
        binding.btnDeletar.setOnClickListener {

            funcaoDeletar()
        }
        binding.btnListaId.setOnClickListener {

            funcaoListarId()
        }
        binding.btnListaNome.setOnClickListener {

            funcaoListarNome()
        }
        binding.btnListaIdade.setOnClickListener {

            funcaoListarIdade()
        }
        binding.btnListaTodos.setOnClickListener {

//            funcaoListarTodosComListView()

            funcaoListarTodos2()
        }

        binding.fabCodigo.setOnClickListener {

            codigo()
        }
        binding.fabXml.setOnClickListener {

            codigoXml()
        }
    }

    private fun funcaoSalvar() {

        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val classeDeDadosEntidadeRoomMVVM = ClasseDeDadosEntidadeRoomMVVM(0, nome, idade)

        if (nome.isEmpty() || idade.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_CAMPOS))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_CAMPOS))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_SALVAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_SALVAR))

            CoroutineScope(Dispatchers.IO).launch {
                viewModelRoomMVVM?.salvar(classeDeDadosEntidadeRoomMVVM)
            }

            funcaoLimpaCampos()
        }
    }
    private fun funcaoAtualizar() {

        val id = binding.textInputId.text.toString().toInt()
        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val classeDeDadosEntidadeRoomMVVM =  ClasseDeDadosEntidadeRoomMVVM( id , nome, idade)

        if ( id == 0 ) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_ATUALIZAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_ATUALIZAR))

            CoroutineScope(Dispatchers.IO).launch {

                viewModelRoomMVVM?.atualizar(classeDeDadosEntidadeRoomMVVM)
            }
        }

        funcaoLimpaCampos()
        binding.textInputId.requestFocus()
    }
    private fun funcaoDeletar() {

        val id = binding.textInputId.text.toString().toInt()
        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val classeDeDadosEntidadeRoomMVVM =  ClasseDeDadosEntidadeRoomMVVM( id , nome, idade)

        if ( id == 0) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_DELETE))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_DELETE))

            CoroutineScope(Dispatchers.IO).launch {

                viewModelRoomMVVM?.deletar(classeDeDadosEntidadeRoomMVVM)
            }
        }

        funcaoLimpaCampos()
        binding.textInputId.requestFocus()

//        funcaoListarTodosComListView()
    }
    private fun funcaoListarId() {

        val idPesquisado = binding.textInputId.text.toString()

        if ( idPesquisado == "0" || idPesquisado.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            CoroutineScope( Dispatchers.IO ).launch {

                val usuariosRetornados = interfaceDaoRoomMVVM?.listarId( idPesquisado )

                var listaResultado = ""

                if (usuariosRetornados != null) { usuariosRetornados.forEach { listaDeUsuariosRetornados ->

                    listaResultado += (" id: ${listaDeUsuariosRetornados.id} \nNome: ${ listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade}\n\n")

//                    binding.textView.text = listaResultado
                }
                }
            }

            funcaoLimpaCampos()
            binding.textInputId.requestFocus()
        }
    }
    private fun funcaoListarNome() {

        val nomePesquisado = binding.textInputNome.text.toString()

        if ( nomePesquisado.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_NOME))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_NOME))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            CoroutineScope( Dispatchers.IO ).launch {

                val usuariosRetornados = interfaceDaoRoomMVVM?.listarNome( nomePesquisado )

                var listaResultado = ""

                if (usuariosRetornados != null) { usuariosRetornados.forEach { listaDeUsuariosRetornados ->

                    listaResultado += (" id: ${listaDeUsuariosRetornados.id} \nNome: ${ listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade}\n\n")

//                    binding.textView.text = listaResultado
                }
                }
            }

            funcaoLimpaCampos()

            binding.textInputId.requestFocus()
        }
    }
    private fun funcaoListarIdade() {

        val idadePesquisada = binding.textInputIdade.text.toString()

        var listaResultado = ""

        if ( idadePesquisada == "0" || idadePesquisada.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_IDADE))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_IDADE))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            CoroutineScope( Dispatchers.IO ).launch {

                val usuariosRetornados = interfaceDaoRoomMVVM?.listarIdade( idadePesquisada )

                if (usuariosRetornados != null) { usuariosRetornados.forEach { listaDeUsuariosRetornados ->

                    listaResultado += (" id: ${listaDeUsuariosRetornados.id} \nNome:  \n idade: ${ listaDeUsuariosRetornados.idade}\n\n")

//                    binding.textView.text = listaResultado
                  }
                }
            }

            funcaoLimpaCampos()

//            funcaoListarTodosPorListView()

            binding.textInputId.requestFocus()
        }
    }
    private fun funcaoListarTodosComListView() {

//        var listaResultado = mutableListOf<String>()
        var listaResultado = ""

        CoroutineScope( Dispatchers.IO ).launch {

            val usuariosRetornados = interfaceDaoRoomMVVM?.listarTodos()

            if (usuariosRetornados != null) { usuariosRetornados.forEach { listaDeUsuariosRetornados ->

                listaResultado += (" id: ${listaDeUsuariosRetornados.id} \nNome: ${listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade}\n\n")

                /*listaResultado.add(" id: ${listaDeUsuariosRetornados.id} \n Nome: ${listaDeUsuariosRetornados.nome} \n idade: ${listaDeUsuariosRetornados.idade} \n ")*/

//                binding.listView.adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_list_item_1, listaResultado)


                println("fragmetRoomMVVM = $listaDeUsuariosRetornados")

/*
                binding.listView.setOnItemClickListener { parent, view, position, id ->

                    val itemSelecionado = parent.getItemAtPosition(position) as String

                    mensagemToast(itemSelecionado)

                    if (itemSelecionado == "  ") { }
                }
                */
               }
            }
        }

        funcaoLimpaCampos()
    }
    private fun funcaoListarTodos() {

        //todo lista de resultados
        var listaResultado = ""

        lifecycleScope.launch {

            val usuariosRetornados = interfaceDaoRoomMVVM?.listarTodos()

            if (usuariosRetornados != null) {

                usuariosRetornados.forEach { listaDeUsuariosRetornados ->

                println("fragmetRoomMVVM 1 $listaDeUsuariosRetornados.idade, ${listaDeUsuariosRetornados.nome}")


                //todo mostra na tela
                listaResultado += " id: ${listaDeUsuariosRetornados.id} \nNome: ${ listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade}\n\n"

                    println("fragmetRoomMVVM 2 $listaDeUsuariosRetornados")

                    println("fragmetRoomMVVM 3 $listaResultado")
              }
            }
        }



//        binding.textView.text = listaResultado

        funcaoLimpaCampos()
    }
    private fun funcaoListarTodos2() {

        //todo lista de resultados
        var listaResultado = ""

        lifecycleScope.launch {

            val usuariosRetornados = interfaceDaoRoomMVVM?.listarTodos()

            if (usuariosRetornados != null) {

                for (listaDeUsuariosRetornados in usuariosRetornados) {

                    //todo mostra na tela
                    listaResultado += (" id: ${listaDeUsuariosRetornados.id} \n Nome: ${ listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade} \n \n")

                    binding.textView.text = listaResultado
              }
            }
        }

        funcaoLimpaCampos()
    }

    private fun funcaoLimpaCampos() {

        //todo limpa os compos
        binding.textInputNome.setText("")
        binding.textInputIdade.setText("")

        //todo mantem o cursor neste campo
        binding.textInputNome.requestFocus()

        //todo inicia o campo id com 0
        binding.textInputId.setText("0")
    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.mvc()}")
        }

//        findNavController().navigate(R.id.fragment_Codigo, bundle1)
    }
    private fun codigoXml() {

        val bundle2 = bundleOf("codigoXml" to "${dados.mvcXml()}")
//        findNavController().navigate(R.id.fragment_Codigo, bundle2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onStart() {
        super.onStart()

//        funcaoListarTodosComListView()
    }
}