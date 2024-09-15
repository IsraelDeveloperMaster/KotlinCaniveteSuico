package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain.UsuarioUseCase
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto.Usuario

class UsuarioViewModel(
     val usuarioUseCase: UsuarioUseCase
) : ViewModel() {

    private val _listaUsuarios = MutableLiveData<List<Usuario>>()
    val listaUsuarios: LiveData<List<Usuario>>
        get() = _listaUsuarios

    fun recuperarListaUsuarios(){
        viewModelScope.launch( Dispatchers.IO ) {
            val listaUsuarios = usuarioUseCase()//Fake ou Mock
            _listaUsuarios.postValue( listaUsuarios )
        }
    }
}