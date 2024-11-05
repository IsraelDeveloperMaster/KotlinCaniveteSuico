package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmSimples.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmSimples.model.UsuariosMvvmSimples

class ViewModelMvvmSimples : ViewModel() {

    private val listaUsuarios = MutableLiveData<UsuariosMvvmSimples>()

    init {

        val recuperaUsuarios = UsuariosMvvmSimples("Ana", 25)

        listaUsuarios.value = recuperaUsuarios
    }

    fun getUser(): LiveData<UsuariosMvvmSimples> {

        return listaUsuarios
    }
}
