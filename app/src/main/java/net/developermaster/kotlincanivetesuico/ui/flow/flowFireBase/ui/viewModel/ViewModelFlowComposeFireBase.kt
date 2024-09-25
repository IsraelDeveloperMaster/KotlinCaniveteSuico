package net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.viewModel

import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

class ViewModelFlowComposeFireBase {

    var imagemRetornadaPelaInternet = ""

    //todo dados da imagem privado
    private val _myDataFlow = MutableStateFlow("")

    //todo dados da imagem publico
    val myDataFlow: Flow<String>
        get() = _myDataFlow

    fun updateData() {

        //todo referencia da imagem
        FirebaseStorage.getInstance() .getReference("imagens") .child("imagens.jpg") .downloadUrl

            .addOnSuccessListener { fotoPerfilRetornada ->

                imagemRetornadaPelaInternet = fotoPerfilRetornada.toString()

                println("composeFireBaseMVVM listar fotos no firebase -> $imagemRetornadaPelaInternet")

            }
            .addOnFailureListener { falha ->

                println("composeFireBaseMVVM listar fotos erro -> $falha ")
            }

            //todo atualiza os dados
            _myDataFlow.value = imagemRetornadaPelaInternet
        }
    }
