package net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.repository

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.model.ListaFlowMvvm

class RepositoryFlowComposeFireBase {

    private val listaFlowMvvm = ListaFlowMvvm

    val frases : Flow<String> = flow {

        while (true) {
            emit(listaFlowMvvm.funcaoRandom().texto)
            delay(2000)
            emit(listaFlowMvvm.funcaoRandom().autor)

            Log.d("frases", listaFlowMvvm.funcaoRandom().texto)
        }
    }


}