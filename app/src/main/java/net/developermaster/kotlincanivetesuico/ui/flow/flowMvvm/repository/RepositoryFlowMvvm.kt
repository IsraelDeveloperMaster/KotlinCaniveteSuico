package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.repository

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RepositoryFlowMvvm {

    val contador: Flow<Int> = flow {

        var bombitas = 1
        while (true){
            bombitas += 1
            emit(bombitas)

            delay(1000)

            Log.d("bombitas", "$bombitas")
        }
    }
}