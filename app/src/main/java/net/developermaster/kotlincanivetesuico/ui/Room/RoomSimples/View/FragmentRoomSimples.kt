package net.developermaster.kotlincanivetesuico.ui.Room.RoomSimples.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import net.developermaster.classe_de_dados_codigos.ClasseDeDadosCodigos
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentRoomSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.Room.RoomSimples.Dao.InterfaceDaoRoomSimples
import net.developermaster.kotlincanivetesuico.ui.Room.RoomSimples.DataBase.BancoDeDadosRoomSimples
import net.developermaster.kotlincanivetesuico.ui.Room.RoomSimples.ModelEntidade.ClasseDeDadosEntidadeRoomSimples

class FragmentRoomSimples : Fragment() {

    //todo instancia de room
    var bancoDeDadosRoomSimples: BancoDeDadosRoomSimples? = null
    var interfaceDaoRoomSimples: InterfaceDaoRoomSimples? = null

    //todo instancia de classe onde estao os codigos e xml
    val dados = ClasseDeDadosCodigos()

    //todo binding
    private var _binding: FragmentRoomSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentRoomSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo inicia o campo id com 0
        binding.textInputId.setText("0")

        bancoDeDadosRoomSimples = BancoDeDadosRoomSimples.recuperarInstanciaRoomSimples(requireContext())
        interfaceDaoRoomSimples = bancoDeDadosRoomSimples?.classeDaoRoomSimples()

        //todo instancia de string
        val variavelMensagens = getString(R.string.EXT_ROOM)

        //todo botoes
        binding.btnSalvar.setOnClickListener {

            funcaoSalvar()
        }
        binding.btnAtualizar.setOnClickListener {

            funcaoAtualizar()
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

            funcaoListarTodos()
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

        val classeDeDadosEntidadeRoomSimples = ClasseDeDadosEntidadeRoomSimples(0, nome, idade)

        if (nome.isEmpty() || idade.isEmpty()) {

        mensagemToast(getString(R.string.MENSAGEM_ROOM_CAMPOS))

        mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_CAMPOS))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_SALVAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_SALVAR))

            CoroutineScope( Dispatchers.IO ).launch {

                interfaceDaoRoomSimples?.salvar(classeDeDadosEntidadeRoomSimples)
            }

            funcaoLimpaCampos()

            funcaoListarTodos()
        }
    }
    private fun funcaoAtualizar() {

        val id = binding.textInputId.text.toString().toInt()
        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val classeDeDadosEntidadeRoomSimples =  ClasseDeDadosEntidadeRoomSimples( id , nome, idade)

        if ( id == 0) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_ATUALIZAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_ATUALIZAR))

            CoroutineScope(Dispatchers.IO).launch {

                interfaceDaoRoomSimples?.atualizar(classeDeDadosEntidadeRoomSimples)
            }
        }

        funcaoLimpaCampos()

        funcaoListarTodos()

        binding.textInputId.requestFocus()
    }
    private fun funcaoDeletar() {

        val id = binding.textInputId.text.toString().toInt()
        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val classeDeDadosEntidadeRoomSimples =  ClasseDeDadosEntidadeRoomSimples( id , nome, idade)

        if ( id == 0) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_DELETE))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_DELETE))

            CoroutineScope(Dispatchers.IO).launch {

                interfaceDaoRoomSimples?.deletar(classeDeDadosEntidadeRoomSimples)
            }
        }

        funcaoLimpaCampos()

        funcaoListarTodos()

        binding.textInputId.requestFocus()
    }
    private fun funcaoListarId() {

        val idPesquisado = binding.textInputId.text.toString()

        if ( idPesquisado == "0" || idPesquisado == "") {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            CoroutineScope( Dispatchers.IO ).launch {

                val usuariosRetornados = interfaceDaoRoomSimples?.listarId( idPesquisado )

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

        if ( nomePesquisado == "0" || nomePesquisado == "") {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_NOME))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_NOME))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            CoroutineScope( Dispatchers.IO ).launch {

                val usuariosRetornados = interfaceDaoRoomSimples?.listarNome( nomePesquisado )

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

        if ( idadePesquisada == "0" || idadePesquisada == "") {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_IDADE))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_IDADE))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            CoroutineScope( Dispatchers.IO ).launch {

                val usuariosRetornados = interfaceDaoRoomSimples?.listarNome( idadePesquisada )

                var listaResultado = ""

                if (usuariosRetornados != null) { usuariosRetornados.forEach { listaDeUsuariosRetornados ->

                    listaResultado += (" id: ${listaDeUsuariosRetornados.id} \nNome: ${ listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade}\n\n")

                }
            }
        }

            funcaoLimpaCampos()

            binding.textInputId.requestFocus()
        }
    }
    private fun funcaoListarTodos() {

        CoroutineScope( Dispatchers.IO ).launch {

            var listaResultado = ""

            val usuariosRetornados = interfaceDaoRoomSimples?.listarTodos()

            if (usuariosRetornados != null) { usuariosRetornados.forEach { listaDeUsuariosRetornados ->

                    listaResultado += (" id: ${listaDeUsuariosRetornados.id} \nNome: ${ listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade}\n\n")

//                binding.textView.text = listaResultado
                }
            }
        }

        funcaoLimpaCampos()
    }

    private fun funcaoLimpaCampos() {

        //todo limpa os compos
//        binding.textInputId.setText("")
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
}