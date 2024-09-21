package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.repository

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RepositoryFlowMvvm {

    val contador: Flow<Int> = flow {

        var clientes = 1
        while (true){
            clientes += 1
            emit(clientes)

            delay(1000)

            Log.d("clientes", "$clientes")
        }
    }
}