package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Presentation.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Domain.ModelDomain.ClasseDeDadosPostagem_Model_Domain
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Domain.UserCase.PostagemUseCase

class ViewModelDomain(val postagemUseCase: PostagemUseCase /*val interfacecarregandoDomain : InterfaceCarregando_Domain*/ ) : ViewModel() {//todo injecao do postagemrepositorioapijsonplaceholderMvvmDomainclean

    //todo gera a listagem das postagens
    var listaDePostagens = MutableLiveData < List <ClasseDeDadosPostagem_Model_Domain> >()

    fun recuperaPostagensApiJsonPlaceHolder() {

        //todo controla o ciclo de vida da activity
        viewModelScope.launch {

//            val listaDePostagensRecuperadasUseCase = postagemUseCase.recuperarPostagensUseCase()//todo sem invoke
            val listaDePostagensRecuperadasUseCase = postagemUseCase()//todo com invoke

            listaDePostagens.postValue( listaDePostagensRecuperadasUseCase )
        }
    }
}