package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.repository

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.model.ListaFlowMvvm

class RepositoryFlowMvvm {

    private val listaFlowMvvm = ListaFlowMvvm

    val contador: Flow< Int > = flow {

        var clientes = 1
        while (true){
            clientes += 1
            emit(clientes)
            delay(1000)
        }
    }

        val frases : Flow<String> = flow {

            while (true) {
                emit(listaFlowMvvm.funcaoRandom().texto)
                delay(2000)
                emit(listaFlowMvvm.funcaoRandom().autor)

                Log.d("frases", listaFlowMvvm.funcaoRandom().texto)
            }
        }
}