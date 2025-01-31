package net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di.User
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.Repository.RepositoryComposeMvvm
import javax.inject.Inject

@HiltViewModel
class ViewModelComposeMvvm @Inject constructor( private val repositoryComposeMvvm : RepositoryComposeMvvm) : ViewModel() {

    private val _listaUsuariosPrivados = MutableLiveData<List<User>>()

    val listaUsuariosPublicos : LiveData<List<User>> = _listaUsuariosPrivados

//    val listaUsuariosPublicos : LiveData<List<User>>

//    get( ) =  _listaUsuariosPrivados

     fun recuperarUsuarios(){

         viewModelScope.launch {

             val listaUsuariosRecuperadosApi = repositoryComposeMvvm.recuperarUsuariosDummyApi()

             _listaUsuariosPrivados.postValue( listaUsuariosRecuperadosApi )
         }
    }
}