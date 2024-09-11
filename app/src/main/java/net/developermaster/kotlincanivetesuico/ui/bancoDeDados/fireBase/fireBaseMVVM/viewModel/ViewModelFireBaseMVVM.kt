package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.repository.RepositorioFireBaseMVVM

class ViewModelFireBaseMVVM : ViewModel() {

    //todo foto perfil mutable
    private val fotoPerfilMutable = MutableLiveData<String>()

    //todo foto perfil live data
    val observaFotoPerfilLiveData : LiveData<String> get() = fotoPerfilMutable

    //todo instancia do repositorio
    private val repositorioFireBaseMVVM = RepositorioFireBaseMVVM()

    //todo lista de dados recuperados
    val observaListaTodosRepositorioFireBaseMVVM : LiveData<List<ModelFireBaseMVVM>>  =  repositorioFireBaseMVVM.funcaoListarTodosPeloRepositorio()

    fun funcaoAutenticarPeloViewModel( email: String, senha: String ) {

        repositorioFireBaseMVVM.funcaoAutenticarPeloRepositorio(email, senha)
    }

    fun funcaoListarNomePeloViewModel( nome: String ) {

        repositorioFireBaseMVVM.funcaoListarNomePeloRepositorio( nome )
    }

    fun funcaoListarIdadePeloViewModel( idade: String ) {

        repositorioFireBaseMVVM.funcaoListarIdadePeloRepositorio( idade )
    }

    fun funcaoListarTodosPeloViewModel( ) {

        //todo chama o repositorio
        repositorioFireBaseMVVM.funcaoListarTodosPeloRepositorio()
    }

    fun funcaoSalvaPeloViewModel(modelFireBaseMVVM: ModelFireBaseMVVM) {

        //todo chama o repositorio
        repositorioFireBaseMVVM.funcaoSalvaPeloRepositorio( modelFireBaseMVVM )
    }

    fun funcaoAtualizarPeloViewModel(modelFireBaseMVVM: ModelFireBaseMVVM) {

        //todo chama o repositorio
        repositorioFireBaseMVVM.funcaoAtualizaPeloRepositorio(modelFireBaseMVVM)
    }

    fun funcaoDeletarPeloViewModel(modelFireBaseMVVM: ModelFireBaseMVVM) {

        //todo chama o repositorio
        repositorioFireBaseMVVM.funcaoDeletarPeloRepositorio(modelFireBaseMVVM)
    }

    fun funcaoListarFotoPerfilPeloViewModel( )  {

        //todo chama o repositorio
         repositorioFireBaseMVVM.funcaoListarFotoPerfilPeloRepositorio().let { imagemPerfilRetornada ->

             fotoPerfilMutable.value = imagemPerfilRetornada

             println("viewModelFireBaseMVVM listar foto perfil -> $imagemPerfilRetornada")
        }
    }

    fun funcaoAtualizaImagemDocumentAdapterPeloViewModel( idImagemAdapter: String ) {

        //todo chama o repositorio
        repositorioFireBaseMVVM.funcaoAtualizaImagemDocumentAdapterPeloRepositorio( idImagemAdapter )
    }
}