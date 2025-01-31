package net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.repository.RepositoryFlowComposeFireBase
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado

class ViewModelFlowComposeFireBase : ViewModel()  {

    //todo estado Flow
    private val estadoFlowPrivado = MutableStateFlow <FlowEstado> (FlowEstado.Loading)
    val estadoFlowPublico : StateFlow<FlowEstado> = estadoFlowPrivado

    val repositoryFlowComposeFireBase = RepositoryFlowComposeFireBase()

    var imagemRetornadaPelaInternet = ""

    var imagemFlow : Flow<String> = flow {

        while (true) {

            emit(imagemRetornadaPelaInternet)

            delay(2000)

            Log.d("imagem", imagemRetornadaPelaInternet)
        }
    }

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

    fun example6() {

        viewModelScope.launch {

            repositoryFlowComposeFireBase.frases

                //todo mudar a thread de processamento para IO
                .flowOn( Dispatchers.IO )

                //todo: valor emitido pelo flow
                .collect { frases ->

                    estadoFlowPrivado.value = FlowEstado.Loading

                    estadoFlowPrivado.value = FlowEstado.Sucesso2(frases)

                    Log.d("frases", frases )
                }
        }
    }
}
