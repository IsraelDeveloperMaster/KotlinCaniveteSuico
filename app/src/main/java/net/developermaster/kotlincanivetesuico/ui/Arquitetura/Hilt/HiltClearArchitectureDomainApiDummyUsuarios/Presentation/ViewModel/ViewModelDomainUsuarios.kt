package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Presentation.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Data.Model_Data.ClasseDeDadosDataDomainApiDummy_Usuarios
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Hilt.HiltClearArchitectureDomainApiDummyUsuarios.Domain.UseCase.GetUseCaseDomainApiDummy_Usuarios
import javax.inject.Inject

@HiltViewModel
class ViewModelDomainUsuarios @Inject constructor(private val useCase: GetUseCaseDomainApiDummy_Usuarios ) : ViewModel() {

    //LiveData Privado
    private val _usuarios = MutableLiveData<List<ClasseDeDadosDataDomainApiDummy_Usuarios>>()

    //LiveData Público
    val usuarios: LiveData<List<ClasseDeDadosDataDomainApiDummy_Usuarios>>
        get() = _usuarios

    init {

        recuperarUsuarios(  )
    }

    private fun recuperarUsuarios(  ) {


        viewModelScope.launch {
            val listaUsuarios = useCase()
            _usuarios.postValue(listaUsuarios)
        }
    }
}