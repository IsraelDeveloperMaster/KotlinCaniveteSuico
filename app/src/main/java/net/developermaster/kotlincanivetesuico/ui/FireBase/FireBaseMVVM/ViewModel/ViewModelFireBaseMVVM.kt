package net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Model.ClasseDeDadosFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Repositorio.InterfaceRepositorioFireBaseMVVM

class ViewModelFireBaseMVVM : ViewModel() {

    private val classeDeDadosFireBaseMVVM = ClasseDeDadosFireBaseMVVM()

    val fotoPerfilMutable = MutableLiveData<String>()
    val fotoPerfilLiveData : LiveData<String> get() = fotoPerfilMutable

    //todo instancia do repositorio
    private val interfaceRepositorioFireBaseMVVM = InterfaceRepositorioFireBaseMVVM()

    //todo lista de dados recuperados
    val observaListaTodosRepositorioFireBaseMVVM : LiveData<List<ClasseDeDadosFireBaseMVVM>>  =  interfaceRepositorioFireBaseMVVM.funcaoListarTodosPeloRepositorio()

    //todo foto perfil recuperada
    val observaListaFotoPerfilRepositorioFireBaseMVVM : String  =  interfaceRepositorioFireBaseMVVM.funcaoListarFotoPerfilPeloRepositorio()

    fun funcaoAutenticarPeloViewModel( email: String, senha: String ) {

        interfaceRepositorioFireBaseMVVM.funcaoAutenticarPeloRepositorio(email, senha)
    }

    fun funcaoListarNomePeloViewModel( nome: String ) {

        interfaceRepositorioFireBaseMVVM.funcaoListarNomePeloRepositorio( nome )
    }

    fun funcaoListarIdadePeloViewModel( idade: String ) {

        interfaceRepositorioFireBaseMVVM.funcaoListarIdadePeloRepositorio( idade )
    }

    fun funcaoListarTodosPeloViewModel( ) {

        //todo chama o repositorio
        interfaceRepositorioFireBaseMVVM.funcaoListarTodosPeloRepositorio()
    }

    fun funcaoSalvaPeloViewModel( classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM ) {

        //todo chama o repositorio
        interfaceRepositorioFireBaseMVVM.funcaoSalvaPeloRepositorio( classeDeDadosFireBaseMVVM )
    }

    fun funcaoAtualizarPeloViewModel( classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM ) {

        //todo chama o repositorio
        interfaceRepositorioFireBaseMVVM.funcaoAtualizaPeloRepositorio(classeDeDadosFireBaseMVVM)
    }

    fun funcaoDeletarPeloViewModel( classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM ) {

        //todo chama o repositorio
        interfaceRepositorioFireBaseMVVM.funcaoDeletarPeloRepositorio(classeDeDadosFireBaseMVVM)
    }

    fun funcaoListarFotoPerfilPeloViewModel( )  {

        //todo chama o repositorio
         interfaceRepositorioFireBaseMVVM.funcaoListarFotoPerfilPeloRepositorio().let { imagemPerfilRetornada ->

             fotoPerfilMutable.value = imagemPerfilRetornada

             println("viewModelFireBaseMVVM listar foto perfil -> $imagemPerfilRetornada")
        }
    }

    fun funcaoListarImagensPeloViewModel( )  {

        //todo chama o repositorio
         interfaceRepositorioFireBaseMVVM.funcaoListarImagensPeloRepositorio( classeDeDadosFireBaseMVVM ).let { imagensRetornada ->

             fotoPerfilMutable.value = imagensRetornada

             println("viewModelFireBaseMVVM listar imagens -> $imagensRetornada")
        }
    }

}