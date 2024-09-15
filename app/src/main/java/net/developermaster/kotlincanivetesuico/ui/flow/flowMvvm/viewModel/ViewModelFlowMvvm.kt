package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.viewModel

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
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.MainUIState

class ViewModelFlowMvvm : ViewModel() {

    val repositoryFlowMvvm = RepositoryFlowMvvm()

    private val _uiState = MutableStateFlow<MainUIState>(MainUIState.Loading)

    val uiState: StateFlow<MainUIState> = _uiState

    fun example() {
        viewModelScope.launch {
            repositoryFlowMvvm.counter
                .map { it.toString() } //numSuscribers
                .collect { bombitas: String ->

                    Log.d("bombitas", bombitas)
                }
        }
    }

    fun example2() {
        viewModelScope.launch {
            repositoryFlowMvvm.counter
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
            repositoryFlowMvvm.counter
                .catch { _uiState.value = MainUIState.Error(it.message.orEmpty()) }
                .flowOn(Dispatchers.IO)
                .collect {
                    _uiState.value = MainUIState.Success(it)
                }
        }
    }

    private fun save(info: String) {

    }
}