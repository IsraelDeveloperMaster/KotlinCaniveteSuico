package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
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
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.domain.UseCaseFlowMvvm
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.model.ListaFlowMvvm
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.model.ModelFlowMvvm
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.repository.RepositoryFlowMvvm
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado

class ViewModelFlowMvvm : ViewModel() {

    //todo instancia de usecase
    val useCaseFlowMvvm = UseCaseFlowMvvm()

    //todo instancia de repository
    private val repositoryFlowMvvm = RepositoryFlowMvvm()

    //todo estado Flow
    private val estadoFlowPrivado = MutableStateFlow <FlowEstado> (FlowEstado.Loading)
    val estadoFlowPublico : StateFlow< FlowEstado > = estadoFlowPrivado

    //todo observe modelflowmvvm
    private val modelFlowMvvmMutableLiveData = MutableLiveData<ModelFlowMvvm>()

        fun funcaoViewModelRandom() {

            val listaRecuperadaViewModel = ListaFlowMvvm.funcaoRandom()

            modelFlowMvvmMutableLiveData.postValue(listaRecuperadaViewModel)

    }

    fun example1() {

        viewModelScope.launch {

            repositoryFlowMvvm.contador.collect { clientes ->

                Log.i("clientes", clientes.toString())
            }
        }
    }

    fun example2() {
        viewModelScope.launch {
            repositoryFlowMvvm.contador

                .map { it.toString() }

                .collect { clientes: String ->

                    Log.d("clientes", clientes)
                }
        }
    }

    fun example3() {
        viewModelScope.launch {
            repositoryFlowMvvm.contador
                .map { it.toString() }

                .onEach { save(it) }

                .collect { clientes: String ->
                    Log.i("clientes", clientes)
                }
        }
    }

    fun example4() {
        viewModelScope.launch {

            repositoryFlowMvvm.contador
                .map { it.toString() }
                .onEach { save(it) }

                .catch { error ->
                    Log.i("clientes", "Error: ${error.message}")
                }

                .collect { clientes: String ->

                    Log.i("clientes", clientes)
                }
        }
    }

    fun example5() {

        viewModelScope.launch {

            repositoryFlowMvvm.contador

                .catch { estadoFlowPrivado.value = FlowEstado.Error(it.message.orEmpty()) }

                //todo mudar a thread de processamento para IO
                .flowOn( Dispatchers.IO )

                //todo valor emitido pelo flow
                .collect {

                    estadoFlowPrivado.value = FlowEstado.Loading

                        estadoFlowPrivado.value = FlowEstado.Sucesso1(it)

                    Log.d("clientes", it.toString())
                }
        }
    }

    fun example6() {

        viewModelScope.launch {

            repositoryFlowMvvm.frases

                .catch { estadoFlowPrivado.value = FlowEstado.Error(it.message.orEmpty())
                }

                //todo mudar a thread de processamento para IO
                .flowOn( Dispatchers.IO )

                //todo valor emitido pelo flow
                .collect { frases ->

                estadoFlowPrivado.value = FlowEstado.Loading

                estadoFlowPrivado.value = FlowEstado.Sucesso2(frases)

                Log.d("frases", frases )
            }
        }
    }

    fun example7() {

        viewModelScope.launch {

            useCaseFlowMvvm()

                .catch { estadoFlowPrivado.value = FlowEstado.Error(it.message.orEmpty()) }

                //todo mudar a thread de processamento para IO
                .flowOn( Dispatchers.IO )

                //todo valor emitido pelo flow
                .collect{ frases ->

                estadoFlowPrivado.value = FlowEstado.Loading

                estadoFlowPrivado.value = FlowEstado.Sucesso2(frases)
            }
        }
    }

    private fun save(info: String) {

    }
}