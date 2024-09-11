package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.data.Model.ModelDummyApiUsuarios
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyUsuarios.domain.useCase.GetUseCaseDomainApiDummy_Usuarios
import javax.inject.Inject

@HiltViewModel
class ViewModelDomainUsuarios @Inject constructor(private val useCase: GetUseCaseDomainApiDummy_Usuarios ) : ViewModel() {

    //LiveData Privado
    private val _usuarios = MutableLiveData<List<ModelDummyApiUsuarios>>()

    //LiveData Público
    val usuarios: LiveData<List<ModelDummyApiUsuarios>>
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