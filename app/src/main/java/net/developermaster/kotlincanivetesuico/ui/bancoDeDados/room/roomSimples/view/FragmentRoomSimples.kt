package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentRoomSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dao.InterfaceDaoRoomSimples
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dataBase.BancoDeDadosRoomSimples
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.modelEntidade.ModelEntidadeRoomSimples
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast

class FragmentRoomSimples : Fragment() {

    //todo instancia de room
    private var bancoDeDadosRoomSimples: BancoDeDadosRoomSimples? = null
    private var interfaceDaoRoomSimples: InterfaceDaoRoomSimples? = null

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

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

        val modelEntidadeRoomSimples = ModelEntidadeRoomSimples(0, nome, idade)

        if (nome.isEmpty() || idade.isEmpty()) {

        mensagemToast(getString(R.string.MENSAGEM_ROOM_CAMPOS))

        } else {

            lifecycleScope.launch {

                interfaceDaoRoomSimples?.salvar(modelEntidadeRoomSimples)

                mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_SALVAR))

            }

            funcaoLimpaCampos()

            funcaoListarTodos()
        }
    }
    private fun funcaoAtualizar() {

        val id = binding.textInputId.text.toString().toInt()
        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val modelEntidadeRoomSimples =  ModelEntidadeRoomSimples( id , nome, idade)

        if ( id == 0) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_ATUALIZAR))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_ATUALIZAR))

            CoroutineScope(Dispatchers.IO).launch {

                interfaceDaoRoomSimples?.atualizar(modelEntidadeRoomSimples)
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

        val modelEntidadeRoomSimples =  ModelEntidadeRoomSimples( id , nome, idade)

        if ( id == 0) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_SUCESSO_DELETE))

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_DELETE))

            CoroutineScope(Dispatchers.IO).launch {

                interfaceDaoRoomSimples?.deletar(modelEntidadeRoomSimples)
            }
        }

        funcaoLimpaCampos()

        funcaoListarTodos()

        binding.textInputId.requestFocus()
    }
    private fun funcaoListarId() {

        var listaResultado = ""

        val idPesquisado = binding.textInputId.text.toString()

        if ( idPesquisado == "0" || idPesquisado == "") {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            lifecycleScope.launch {

                val usuariosRetornados = interfaceDaoRoomSimples?.listarId( idPesquisado )

                if (usuariosRetornados != null) {

                    usuariosRetornados.forEach { listaDeUsuariosRetornados ->

                        listaResultado += (" id: ${listaDeUsuariosRetornados.id} \n Nome: ${ listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade} \n \n")

                        binding.textView.text = listaResultado

                //                    Log.d("Resultado", "Resultado = $listaResultado")
                    }
                }
        }

            funcaoLimpaCampos()
        }
    }
    private fun funcaoListarIdade() {

        var listaResultado = ""

        val idadePesquisada = binding.textInputIdade.text.toString()

        if ( idadePesquisada == "0" || idadePesquisada == "") {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_IDADE))

        } else {

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            lifecycleScope.launch {

                val usuariosRetornados = interfaceDaoRoomSimples?.listarIdade( idadePesquisada )

                if (usuariosRetornados != null) {

                    usuariosRetornados.forEach { listaDeUsuariosRetornados ->

                        listaResultado += (" id: ${listaDeUsuariosRetornados.id} \n Nome: ${ listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade} \n \n ")

                        binding.textView.text = listaResultado

                        //                    Log.d("Resultado", "Resultado = $listaResultado")
                    }
                }
            }

            funcaoLimpaCampos()
        }
    }
    private fun funcaoListarNome() {

        var listaResultado = ""

        val nomePesquisado = binding.textInputNome.text.toString()

        if ( nomePesquisado == "0" || nomePesquisado == "") {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_NOME))

        } else {

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_LISTAR))

            lifecycleScope.launch {

                val usuariosRetornados = interfaceDaoRoomSimples?.listarIdade( nomePesquisado )

                if (usuariosRetornados != null) {

                    usuariosRetornados.forEach { listaDeUsuariosRetornados ->

                        listaResultado += (" id: ${listaDeUsuariosRetornados.id} \n Nome: ${ listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade} \n \n ")

                        binding.textView.text = listaResultado

                        // Log.d("Resultado", "Resultado = $listaResultado")
                    }
                }
            }

            funcaoLimpaCampos()
        }
    }
    private fun funcaoListarTodos() {

        //todo lista de resultados
        var listaResultado = ""

        lifecycleScope.launch {

            val usuariosRetornados = interfaceDaoRoomSimples?.listarTodos()

            if (usuariosRetornados != null) {

                for ( listaDeUsuariosRetornados in usuariosRetornados) {

                    listaResultado.plus(listaDeUsuariosRetornados.toString())

                    //todo mostra na tela
                    listaResultado += (" id: ${listaDeUsuariosRetornados.id} \n Nome: ${ listaDeUsuariosRetornados.nome} \n idade: ${ listaDeUsuariosRetornados.idade} \n \n")

                binding.textView.text = listaResultado

//                Log.d("Resultado", "Resultado = $listaResultado")

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

//        val bundle1 = Bundle().apply {
//            putString("codigo", "${dados.mvc()}")
//        }

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

    override fun onStart() {
        super.onStart()

        funcaoListarTodos()
    }

}