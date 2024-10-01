package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.FireBaseSimples.view

import android.app.AlertDialog
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.databinding.FragmentFirebaseSimplesBinding
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.FireBaseSimples.model.ModelFireBaseSimples
import net.developermaster.kotlincanivetesuico.utils.codigos.modelCodigos
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemSnackBar
import net.developermaster.kotlincanivetesuico.utils.utilsGeral.mensagemToast

class FragmentFireBaseSimples : Fragment() {

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

    //todo lista de itens para a funcao deleteitem
    private var listaItens = mutableListOf<ModelFireBaseSimples>()

    //todo instancia de classe onde estao os codigos e xml
    private val dados = modelCodigos()

    //todo binding
    private var _binding: FragmentFirebaseSimplesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirebaseSimplesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //todo botoes
        binding.btnAutenticar.setOnClickListener {

            funcaoAutentica()
        }
        binding.btnAtualizar.setOnClickListener {

            funcaoAtualizar()
        }
        binding.btnDeletar.setOnClickListener {

            funcaoDeletar()
        }
        binding.btnSalvar.setOnClickListener {

            funcaoSalva()
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
        binding.btnAbrirGaleria.setOnClickListener {

            funcaoAbrirGaleria()
        }
        binding.btnListarFoto.setOnClickListener {

            funcaoListarImage()
        }

        binding.fabCodigo.setOnClickListener {

            codigo()
        }
        binding.fabXml.setOnClickListener {

            codigoXml()
        }
    }

    private fun funcaoAbrirGaleria() {

        abrirGaleria.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
    }
    private fun funcaoSalvaFotoFireBase ( uri: Uri ) {

        //todo referencia da imagem
        FirebaseStorage.getInstance() .getReference("image") .child("image.jpg") .putFile(uri) .addOnSuccessListener { dados_da_foto ->

            mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_SALVAR_FOTO))
        }
            .addOnFailureListener {

                    Se_Falhar ->

                val erro = Se_Falhar.message
                val causa = Se_Falhar.cause

                mensagemToast("Erro: $erro \n\n Causa: $causa")
            }
    }
    private fun funcaoListarImage () {

        //todo referencia da imagem
        FirebaseStorage.getInstance() .getReference("image") .child("image.jpg") .downloadUrl .addOnSuccessListener { dados_da_foto ->

            //todo visualizando imagem com API Picasso
            Picasso.get()
                .load(dados_da_foto)
                .into(binding.imageView)
        }
            .addOnFailureListener {

                    Se_Falhar ->

                val erro = Se_Falhar.message
                val causa = Se_Falhar.cause

                mensagemToast("Erro: $erro \n\n Causa: $causa")
            }
    }
    private fun funcaoAutentica() {

        val email = "m@m.com"
        val senha = "123456"

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, senha)
            .addOnSuccessListener { Se_Sucesso ->

                val email = Se_Sucesso.user?.email
                val id = Se_Sucesso.user?.uid
                val provedor = Se_Sucesso.user?.providerId

                mensagemSnackBar("sucesso:\n \n  id: $id \n \n Provedor: $provedor \n \n Email: $email")

                mensagemToast(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_AUTENTICAR))

            }.addOnFailureListener { Se_Falhar ->

                val mensagem_de_erro = Se_Falhar.message

                mensagemToast("$mensagem_de_erro \n")
            }
    }
    private fun funcaoSalva() {

        val id = binding.textInputId.text.toString()
        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val modelFireBaseSimples = ModelFireBaseSimples(id, nome, idade)

        if (id.isEmpty() || nome.isEmpty() || idade.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

        } else {

            mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_SALVAR))

            FirebaseFirestore.getInstance().collection("FireBaseSimples").document(id) .set(modelFireBaseSimples)

                .addOnSuccessListener {

                    mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_SALVAR))

                    listaItens.clear()

                    funcaoListarTodos()

                }.addOnFailureListener {

                        Se_Falhar ->

                    val erro = Se_Falhar.message
                    val causa = Se_Falhar.cause

                    mensagemToast("Erro: $erro \n\n Causa: $causa")
                }

            funcaoLimpaCampos()
        }
    }
    private fun funcaoAtualizar() {

        val id = binding.textInputId.text.toString()
        val nome = binding.textInputNome.text.toString()
        val idade = binding.textInputIdade.text.toString()

        val mapClasseDeDados = mapOf(

            "nome" to binding.textInputNome.text.toString(),
            "idade" to binding.textInputIdade.text.toString()
        )

        if (id.isEmpty() || nome.isEmpty() || idade.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

        } else {

            mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_ATUALIZAR))

            FirebaseFirestore.getInstance().collection("FireBaseSimples").document(id)
                .update(mapClasseDeDados)

                .addOnSuccessListener {

                    mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_ATUALIZAR))

                    funcaoListarTodos()

                }.addOnFailureListener {

                        Se_Falhar ->

                    val erro = Se_Falhar.message
                    val causa = Se_Falhar.cause

                    mensagemToast("Erro: $erro \n\n Causa: $causa")
                }

            funcaoLimpaCampos()
        }
    }
    private fun funcaoDeletar() {

        val id = binding.textInputId.text.toString()

        if (id.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

        } else {

            mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_DELETE))

            FirebaseFirestore.getInstance().collection("FireBaseSimples").document(id).delete()

                .addOnSuccessListener {

                    mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_DELETE))

                    funcaoListarTodos()

                }.addOnFailureListener {

                        Se_Falhar ->

                    val erro = Se_Falhar.message
                    val causa = Se_Falhar.cause

                    mensagemToast("Erro: $erro \n\n Causa: $causa")
                }

            funcaoLimpaCampos()
        }
    }
    private fun funcaoListarId() {

        //todo lista de resultados
        var listaResultado = ""

        val textInputId = binding.textInputId.text.toString()

        if (textInputId.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

        } else {

            val listaDeDadosRetornadas = FirebaseFirestore.getInstance().collection("FireBaseSimples")

            listaDeDadosRetornadas.addSnapshotListener { dadosRetornados, error ->

                val listaRetornada = dadosRetornados?.documents//todo document

                listaRetornada?.forEach { documents ->

                    listaResultado.isEmpty()

                    val dados = documents?.data

                    if (dados != null) {

                        val id = documents.id
                        val nome = dados["nome"]
                        val idade = dados["idade"]

                        if (textInputId == id) {

                            listaResultado += (" id: ${id} \n Nome: ${nome} \n idade: ${idade} \n \n ")

                            binding.textView.text = listaResultado

                            funcaoListarImage()

                            funcaoLimpaCampos()
                        }
                    }
                }
            }
        }
    }
    private fun funcaoListarNome() {

        //todo lista de resultados
        var listaResultado = ""

        val textInputNome = binding.textInputNome.text.toString()

        if (textInputNome.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

            mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

        } else {

            val listaDeDadosRetornadas =
                FirebaseFirestore.getInstance().collection("FireBaseSimples")

            listaDeDadosRetornadas.addSnapshotListener { dadosRetornados, error ->

                val listaRetornada = dadosRetornados?.documents//todo document

                listaRetornada?.forEach { documents ->

                    listaResultado.isEmpty()

                    val dados = documents?.data

                    if (dados != null) {

                        val id = documents.id
                        val nome = dados["nome"]
                        val idade = dados["idade"]

                        if (textInputNome == nome) {

                            listaResultado += (" id: ${id} \n Nome: ${nome} \n idade: ${idade} \n \n ")

                            binding.textView.text = listaResultado

                            funcaoListarImage()

                            funcaoLimpaCampos()
                        }
                    }
                }
            }
        }
    }
    private fun funcaoListarIdade() {

        //todo lista de resultados
        var listaResultado = ""

        val textInputIdade = binding.textInputIdade.text.toString()

        if (textInputIdade.isEmpty()) {

            mensagemToast(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

            mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_CAMPOS))

        } else {

            val listaDeDadosRetornadas =
                FirebaseFirestore.getInstance().collection("FireBaseSimples")

            listaDeDadosRetornadas.addSnapshotListener { dadosRetornados, error ->

                val listaRetornada = dadosRetornados?.documents//todo document

                listaRetornada?.forEach { documents ->

                    listaResultado.isEmpty()

                    val dados = documents?.data

                    if (dados != null) {

                        val id = documents.id
                        val nome = dados["nome"]
                        val idade = dados["idade"]

                        if (textInputIdade == idade) {

                            listaResultado += (" id: ${id} \n Nome: ${nome} \n idade: ${idade} \n \n ")

                            binding.textView.text = listaResultado

                            funcaoListarImage()

                            funcaoLimpaCampos()
                        }
                    }
                }
            }
        }
    }
    private fun funcaoLimpaCampos() {

        //todo limpa os compos
        binding.textInputId.text?.clear()
        binding.textInputNome.text?.clear()
        binding.textInputIdade.text?.clear()

        //todo mantem o cursor neste campo
        binding.textInputId.requestFocus()
    }
    private fun funcaoListarTodos(  ) {

        //todo lista de resultados
        var listaResultado = ""

        val listaDeDadosRetornadas =FirebaseFirestore.getInstance() .collection("FireBaseSimples")//todo collection

        listaDeDadosRetornadas.addSnapshotListener { dadosRetornados, error ->

            val listaRetornada = dadosRetornados?.documents//todo document

            listaRetornada?.forEach { documents ->

                val dados = documents?.data //todo dados do documento retornado

                if (dados != null) {

                    val id = documents.id
                    val nome = dados["nome"]
                    val idade = dados["idade"]

                    listaResultado += (" id: ${id} \n Nome: ${nome} \n idade: ${idade} \n \n ")

                    binding.textView.text = listaResultado

                    funcaoListarImage()

                    funcaoLimpaCampos()
                }
            }
        }
    }
    private fun funcaoQueCopiaObjetoId() {

        FirebaseFirestore.getInstance().collection("FireBaseSimples") .get()

            .addOnSuccessListener { resultado ->

                listaItens.clear()

                for (documento in resultado) {

                    val item = documento.toObject( ModelFireBaseSimples::class.java).copy(id = documento.id)

                    listaItens.add(item)
                }
            }
            .addOnFailureListener { Se_Falhar ->

                val erro = Se_Falhar.message
                val causa = Se_Falhar.cause

                mensagemToast("Erro: $erro \n\n Causa: $causa" )
            }
    }
    private fun deletarItem(itemQueSeraDeletado: String , position: Int ) {

        funcaoQueCopiaObjetoId()

        FirebaseFirestore.getInstance() .collection("FireBaseSimples").document(itemQueSeraDeletado).delete()

    }
    private fun funcaoAlerDialog(id: String, posicaoListView: Int) {

        FirebaseFirestore.getInstance().collection("FireBaseSimples") .get() //todo pega a colecao

            .addOnSuccessListener { resultado ->

                listaItens.clear()

                for (documento in resultado) {

                    val idDocumento = documento.id

                    listaItens.add(  ModelFireBaseSimples(idDocumento) )
                }
            }

        val documentoDeletado = listaItens[posicaoListView]

        val alertdialog = AlertDialog.Builder(requireContext())

        alertdialog.setTitle( "Deseja Excluir ?" )

        alertdialog.setMessage( "Todas as informacoes serao perdidas!" )

        //todo botao negativo
        alertdialog.setNegativeButton("Cancelar") { dialog, posicao ->

            mensagemSnackBar( "Cancelado $posicao" )
        }

        //todo botao positivo
        alertdialog.setPositiveButton("Excluir") { dialog, posicao ->

            funcaoQueCopiaObjetoId()

            deletarItem( documentoDeletado.id , posicaoListView )

            mensagemSnackBar(getString(R.string.MENSAGEM_FIREBASE_SUCESSO_DELETE) )

            funcaoListarTodos()
        }

        //todo botao neutro
        alertdialog.setNeutralButton("Ajuda") { dialog, posicao ->

            mensagemSnackBar( "Ajuda $posicao" )
        }

        //todo cria o alertdialog
        val alertbuilder = alertdialog.create()

        //todo força o usuaria clicar em uma opcao
        alertbuilder.setCancelable(false)

        //todo icone
        alertbuilder.setIcon(R.drawable.ic_configuracoes)

        //todo mostra o alertdialog
        alertbuilder.show()
    }

    private fun codigo() {

        val bundle1 = Bundle().apply {
            putString("codigo", "${dados.mvc()}")
        }

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


