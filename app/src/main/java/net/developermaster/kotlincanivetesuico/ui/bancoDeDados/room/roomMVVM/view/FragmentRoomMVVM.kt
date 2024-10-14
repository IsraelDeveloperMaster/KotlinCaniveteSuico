package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.view

import AdapterRoomMVVM
import ViewModelRoomMVVM
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentRoomMvvmBinding
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter.InterfaceRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dao.InterfaceDaoRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dataBase.BancoDeDadosRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM

class FragmentRoomMVVM : Fragment(), InterfaceRoomMVVM {

    //todo recyclerview
    private lateinit var recyclerView: RecyclerView

    //todo adapter
    private lateinit var adapter: AdapterRoomMVVM

    //todo instancia de view model
    private var viewModelRoomMVVM: ViewModelRoomMVVM? = null

    //todo instancia de room
    private var bancoDeDadosRoomMVVM: BancoDeDadosRoomMVVM? = null
    private var interfaceDaoRoomMVVM: InterfaceDaoRoomMVVM? = null

    //todo instancia de classe onde estao os codigos e xml
    val dados = modelCodigos()

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
        viewModelRoomMVVM = ViewModelProvider(this) [ViewModelRoomMVVM::class.java]

        //todo instancia de room
        bancoDeDadosRoomMVVM = BancoDeDadosRoomMVVM.recuperarInstanciaRoomMVVM(requireContext())
        interfaceDaoRoomMVVM = bancoDeDadosRoomMVVM?.classeDaoRoomMVVM()

        //todo recyclerview
        recyclerView = binding.recyclerview

        //todo adapter
        adapter = AdapterRoomMVVM(requireContext(), this)

        //todo recyclerview com adapter
        recyclerView.adapter = adapter

        //todo layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(context)

        //todo tamanho fixo
        recyclerView.setHasFixedSize(true)

        //todo divisao
        recyclerView.addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))

        //todo botoes
        binding.btnAdicionar.setOnClickListener {

            funcaoAdicionar()
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

    private fun funcaoAdicionar() {

        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val modelEntidadeRoomMVVM = ModelEntidadeRoomMVVM(0, nome, idade)

        if (nome.isEmpty() || idade.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_CAMPOS))

        } else {

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_SALVAR))

            lifecycleScope.launch {

                viewModelRoomMVVM?.funcaAdicionarPeloViewModel(modelEntidadeRoomMVVM)
            }

            funcaoLimparCampos()

            funcaoListarTodos()
        }
    }
    private fun funcaoAtualizar() {

        val id = binding.textInputId.text.toString().toInt()
        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val modelEntidadeRoomMVVM =  ModelEntidadeRoomMVVM( id , nome, idade)

        if ( id == 0 ) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_ATUALIZAR))

            lifecycleScope.launch {

                viewModelRoomMVVM?.funcaoAtualizarPeloViewModel(modelEntidadeRoomMVVM)
            }
        }

        funcaoLimparCampos()

        funcaoListarTodos()
    }
    private fun funcaoDeletar() {

        val id = binding.textInputId.text.toString().toInt()
        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val modelEntidadeRoomMVVM =  ModelEntidadeRoomMVVM( id , nome, idade)

        if ( id == 0) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_ID))

        } else {

            mensagemSnackBar(getString(R.string.MENSAGEM_ROOM_SUCESSO_DELETE))

            lifecycleScope.launch {

                viewModelRoomMVVM?.funcaoDeletarPeloViewModel(modelEntidadeRoomMVVM)
            }
        }

        funcaoLimparCampos()

        funcaoListarTodos()
    }
    private fun funcaoListarId() {

        var listaResultado = ""

        val idPesquisado = binding.textInputId.text.toString()

        if (idPesquisado.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_CAMPOS))

        } else {

            viewModelRoomMVVM?.funcaoListarIdPeloViewModel( idPesquisado )

            viewModelRoomMVVM?.observerListarId?.observe(viewLifecycleOwner) { listaDeIdRetornado ->

                //todo notifica o adapter
                adapter.retornaDados(listaDeIdRetornado)

                listaDeIdRetornado.forEach { listaRetornada ->

                    //todo mostra na tela
                    listaResultado += (" id: ${listaRetornada.id} \n Nome: ${listaRetornada.nome} \n idade: ${listaRetornada.idade} \n \n")

                    Log.i("listarid", listaResultado)
                }
            }
        }

        funcaoLimparCampos()
    }
    private fun funcaoListarNome() {

        var listaResultado = ""

        val nomePesquisado = binding.textInputNome.text.toString()

        if (nomePesquisado.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_CAMPOS))

        } else {

            viewModelRoomMVVM?.funcaoListarNomePeloViewModel( nomePesquisado )

            viewModelRoomMVVM?.observerListarNome?.observe(viewLifecycleOwner) { listaDeNomeRetornado ->

                //todo notifica o adapter
                adapter.retornaDados(listaDeNomeRetornado)

                listaDeNomeRetornado.forEach { listaRetornada ->

                    listaResultado.isEmpty()

                    //todo mostra na tela
                    listaResultado += (" id: ${listaRetornada.id} \n Nome: ${listaRetornada.nome} \n idade: ${listaRetornada.idade} \n \n")

                    Log.i("funcaoListarNome", listaResultado)
                }
            }
        }

        funcaoLimparCampos()
    }
    private fun funcaoListarIdade() {

        var listaResultado = ""

        val idadePesquisada = binding.textInputIdade.text.toString()

        if (idadePesquisada.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_ROOM_CAMPOS))

        } else {

            viewModelRoomMVVM?.funcaoListarIdadePeloViewModel( idadePesquisada )

            viewModelRoomMVVM?.observerListarIdade?.observe(viewLifecycleOwner) { listaDeIdadeRetornada ->

                //todo notifica o adapter
                adapter.retornaDados(listaDeIdadeRetornada)

                listaDeIdadeRetornada.forEach { listaRetornada ->

                    listaResultado.isEmpty()

                    //todo mostra na tela
                    listaResultado += (" id: ${listaRetornada.id} \n Nome: ${listaRetornada.nome} \n idade: ${listaRetornada.idade} \n \n")

                    Log.i("listaridade", listaResultado)
                }
            }
        }

        funcaoLimparCampos()
    }
    private fun funcaoListarTodos() {

        var listaResultado = ""

        viewModelRoomMVVM?.funcaoListarTodosPeloViewModel()

        viewModelRoomMVVM?.observerListarTodos?.observe(viewLifecycleOwner) { listaDeUsuariosRetornados ->

            //todo notifica o adapter
//            adapter.retornaDados(listaDeUsuariosRetornados)

            //todo atualiza a lista DiffUtil
            adapter.atualizaTodaListaDiffUtil(listaDeUsuariosRetornados)

            listaDeUsuariosRetornados.forEach { listaDeUsuariosRetornados ->

                //todo mostra na tela
                listaResultado += (" id: ${listaDeUsuariosRetornados.id} \n Nome: ${listaDeUsuariosRetornados.nome} \n idade: ${listaDeUsuariosRetornados.idade} \n \n")

                Log.i("listartodos", "$listaDeUsuariosRetornados")
            }
        }

        funcaoLimparCampos()
    }
    private fun funcaoLimparCampos() {

        //todo limpa os compos
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

    override fun funcaoInterfaceRoomMvvmDeleteNotyfy(position: Int) {

        funcaoListarTodos()
    }

    override fun funcaoInterfaceRoomMvvmAdicionar(bundle: Bundle, position: Int) {

        findNavController().navigate(R.id.fragment_Room_Mvvm_Adicionar, bundle)
    }
}