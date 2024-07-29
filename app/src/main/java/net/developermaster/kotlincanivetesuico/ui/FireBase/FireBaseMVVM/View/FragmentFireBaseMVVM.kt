package net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.View

import AdapterFireBaseMVVM
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import net.developermaster.classes_de_utilizade_geral.mensagemSnackBar
import net.developermaster.classes_de_utilizade_geral.mensagemToast
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentFirebaseMvvmBinding
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Adapter.InterfaceFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Model.ClasseDeDadosFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Repositorio.InterfaceRepositorioFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.ViewModel.ViewModelFireBaseMVVM

class FragmentFireBaseMVVM : Fragment() , InterfaceFireBaseMVVM {

    //todo recyclerview
    private lateinit var recyclerView: RecyclerView

    //todo adapter
    private lateinit var adapter: AdapterFireBaseMVVM

    //todo viewmodel
    private lateinit var viewModelFireBaseMVVM: ViewModelFireBaseMVVM

    //todo repositorio
    private lateinit var interfaceRepositorioFireBaseMVVM: InterfaceRepositorioFireBaseMVVM

    //todo abre a galeria
    private val abrirGaleria =  registerForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->

        if (uri != null) {

            binding.imageView.setImageURI(uri)

            funcaoSalvaFotoFireBase(uri)

            mensagemToast("Imagem Selecionada com Sucesso")
        } else {

            mensagemToast("Erro ao Selecionar a Imagem")
        }
    }

    private var resultadoRecyclerView = mutableListOf<ClasseDeDadosFireBaseMVVM>()

    //todo binding
    private var _binding: FragmentFirebaseMvvmBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirebaseMvvmBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo repositorio
        interfaceRepositorioFireBaseMVVM = InterfaceRepositorioFireBaseMVVM()

        //todo recyclerview
        recyclerView = binding.recyclerview

        //todo adapter
        adapter = AdapterFireBaseMVVM(  this)

        //todo recyclerview com adapter
        recyclerView.adapter = adapter

        //todo layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(context)

        //todo tamanho fixo
        recyclerView.setHasFixedSize(true)

        //todo divisao
        recyclerView.addItemDecoration(DividerItemDecoration(context,RecyclerView.VERTICAL))

        //todo viewmodel
        viewModelFireBaseMVVM = ViewModelProvider(this)[ViewModelFireBaseMVVM::class.java]

        //todo observa o repositorio
        viewModelFireBaseMVVM.observaListaTodosRepositorioFireBaseMVVM.observe(viewLifecycleOwner) { dados ->

            adapter.retornaDados(dados)

            Log.i("ViewModel observe", "$dados")
        }

        //todo observa o repositorio viewmodel
        viewModelFireBaseMVVM.fotoPerfilLiveData.observe(viewLifecycleOwner)  { imagemRetornada ->

            Picasso.get()
                .load(imagemRetornada.toUri())
                .into(binding.imageView)

            println( "fragmentFireBaseMVVM listar fotos no observe -> $imagemRetornada" )
        }

        //todo botoes
        binding.btnAutenticar.setOnClickListener {

            funcaoAutenticar()
        }
        binding.imageView.setOnClickListener {

            funcaoAbrirGaleria()
        }
        binding.btnAdicionar.setOnClickListener {

            findNavController().navigate(R.id.fragment_FireBase_Mvvm_Adicionar)
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
        binding.btnAbrirGaleria.setOnClickListener {

            funcaoAbrirGaleria()
        }
        binding.btnListarFoto.setOnClickListener {

            funcaoListarImage()
        }

        binding.fabCodigo.setOnClickListener {

        }
        binding.fabXml.setOnClickListener {

        }
    }

    private fun funcaoListarTodos() {

        viewModelFireBaseMVVM.funcaoListarTodosPeloViewModel()
    }
    private fun funcaoAbrirGaleria() {

        abrirGaleria.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
    }
    private fun funcaoSalvaFotoFireBase ( uri: Uri ) {

        //todo referencia da imagem
        FirebaseStorage.getInstance() .getReference("image") .child("image.jpg") .putFile(uri)

            .addOnSuccessListener {

                mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_SALVAR_FOTO))
            }
            .addOnFailureListener {

                    falha ->

                val erro = falha.message
                val causa = falha.cause

                mensagemToast("Erro: $erro \n\n Causa: $causa")
            }
    }
    private fun funcaoListarImage () {

        viewModelFireBaseMVVM.funcaoListarFotosPeloViewModel()
    }
    private fun funcaoListarNome() {

        val nome = binding.textInputNome.text.toString()

        if (nome.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

        } else {

            viewModelFireBaseMVVM.funcaoListarNomePeloViewModel( nome )

            println( "fragmentFireBaseMVVM listar nome -> $resultadoRecyclerView" )
        }
    }
    private fun funcaoListarIdade() {

        val idade = binding.textInputIdade.text.toString()

        if (idade.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

        } else {

            viewModelFireBaseMVVM.funcaoListarIdadePeloViewModel( idade )

            println( "fragmentFireBaseMVVM listar idade -> $resultadoRecyclerView" )

            funcaoLimparCampos()
        }
    }
    private fun funcaoLimparCampos() {

        //todo limpa os compos
        binding.textInputNome.text?.clear()
        binding.textInputIdade.text?.clear()

        //todo mantem o cursor neste campo
        binding.textInputNome.requestFocus()
    }
    private fun funcaoAutenticar(  ) {

        val email = binding.textInputNome.setText("m@m.com").toString()
        val senha = binding.textInputIdade.setText("123456").toString()

        if ( email.isNotEmpty() || senha.isNotEmpty() ) {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_AUTENTICAR))

            viewModelFireBaseMVVM.funcaoAutenticarPeloViewModel( email, senha )

        } else {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_ERRO_AUTENTICAR))
        }
    }
    override fun funcaoInterfaceFireBaseMVVM(position: Int) {
        funcaoListarTodos()
    }
    override fun funcaoInterfaceFireBaseMvvmAlertDialog(position: Int) {
    }
    override fun funcaoInterfaceFireBaseMvvmAdicionar(bundle: Bundle, position: Int) {

        findNavController().navigate(R.id.fragment_FireBase_Mvvm_Adicionar , bundle )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onStart() {
        super.onStart()

        funcaoListarImage()

        funcaoListarTodos()
    }
}


