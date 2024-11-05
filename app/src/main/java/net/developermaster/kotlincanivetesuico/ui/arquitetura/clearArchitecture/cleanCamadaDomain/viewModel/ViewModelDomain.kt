package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.modelDomain.ModelPostagemModelDomain
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.domain.userCase.PostagemUseCase

class ViewModelDomain(val postagemUseCase: PostagemUseCase /*val interfacecarregandoDomain : InterfaceCarregando_Domain*/ ) : ViewModel() {//todo injecao do postagemrepositorioapijsonplaceholderMvvmDomainclean

    //todo gera a listagem das postagens
    var listaDePostagens = MutableLiveData < List <ModelPostagemModelDomain> >()

    fun recuperaPostagensApiJsonPlaceHolder() {

        //todo controla o ciclo de vida da activity
        viewModelScope.launch {

//            val listaDePostagensRecuperadasUseCase = postagemUseCase.recuperarPostagensUseCase()//todo sem invoke
            val listaDePostagensRecuperadasUseCase = postagemUseCase()//todo com invoke

            listaDePostagens.postValue( listaDePostagensRecuperadasUseCase )
        }
    }
}