package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.repository.RepositoryFlowMvvm

class MainViewModel : ViewModel() {

    //todo instancia de repository
    val repositoryFlowMvvm = RepositoryFlowMvvm()

    private val estadoFlowPrivado = MutableStateFlow<MainUIState>(MainUIState.Loading)
    val estadoFlowPublico: StateFlow<MainUIState> =
        estadoFlowPrivado

    fun example0() {

        viewModelScope.launch {
            repositoryFlowMvvm.contador.collect { bombitas ->
                    Log.i("bombitas", bombitas.toString())
                }
        }
    }

    fun example1() {
        viewModelScope.launch {
            repositoryFlowMvvm.contador
                .map { it.toString() } //numSuscribers
                .collect { bombitas: String ->
                    Log.i("bombitas", bombitas)
                }
        }
    }

    fun example2() {
        viewModelScope.launch {
            repositoryFlowMvvm.contador
                .map { it.toString() } //numSuscribers
                .onEach { save(it) }
                .catch { error ->
                    Log.i("aristiCurso", "Error: ${error.message}")
                }
                .collect { bombitas: String ->
                    Log.i("aristiCurso", bombitas)
                }
        }
    }

    fun example3() {
        viewModelScope.launch {
            repositoryFlowMvvm.contador
                .catch { estadoFlowPrivado.value = MainUIState.Error(it.message.orEmpty()) }
                .flowOn(Dispatchers.IO)
                .collect {
                    estadoFlowPrivado.value = MainUIState.Success(it)
                }
        }
    }

    private fun save(info: String) {

    }
}

