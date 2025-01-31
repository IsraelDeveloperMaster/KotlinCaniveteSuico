
import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dataBase.BancoDeDadosRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.Repository.RepositorioRoomMVVM

class ViewModelRoomMVVM ( application: Application ) : AndroidViewModel(application) {

    //todo instancia o repositorio
    var repositorioRoomMVVM : RepositorioRoomMVVM

    val observerListarTodos : MutableLiveData<List<ModelEntidadeRoomMVVM>> by lazy {

        MutableLiveData<List<ModelEntidadeRoomMVVM>>().also {

            funcaoListarTodosPeloViewModel()
        }
    }

    //todo lista de id
    val observerListarId = MutableLiveData<List<ModelEntidadeRoomMVVM>> ()
    private val listarId : MutableLiveData<List<ModelEntidadeRoomMVVM>> = observerListarId

    //todo lista de nome
    val observerListarNome = MutableLiveData<List<ModelEntidadeRoomMVVM>> ()
    private val listarNome : MutableLiveData<List<ModelEntidadeRoomMVVM>> = observerListarNome

    //todo lista de idade
    val observerListarIdade = MutableLiveData<List<ModelEntidadeRoomMVVM>> ()
    private val listarIdade : MutableLiveData<List<ModelEntidadeRoomMVVM>> = observerListarIdade


    init {
        val interfaceDaoRoomMVVM = BancoDeDadosRoomMVVM.recuperarInstanciaRoomMVVM(application).classeDaoRoomMVVM()
        repositorioRoomMVVM = RepositorioRoomMVVM(interfaceDaoRoomMVVM)
    }

    fun funcaAdicionarPeloViewModel(modelEntidadeRoomMVVM: ModelEntidadeRoomMVVM) = viewModelScope.launch {

        repositorioRoomMVVM.funcaAdicionarPeloRepositorio( modelEntidadeRoomMVVM )
    }

    fun funcaoAtualizarPeloViewModel(modelEntidadeRoomMVVM: ModelEntidadeRoomMVVM) = viewModelScope.launch {

        println("funcaoAtualizarPeloViewModel -> $modelEntidadeRoomMVVM")

        repositorioRoomMVVM.funcaoAtualizarPeloRepositorio( modelEntidadeRoomMVVM )
    }

    fun funcaoDeletarPeloViewModel(modelEntidadeRoomMVVM: ModelEntidadeRoomMVVM) = viewModelScope.launch {

        repositorioRoomMVVM.funcaoDeletarPeloRepositorio( modelEntidadeRoomMVVM )

        Log.i("ViewModelContador deletar", "")
    }

    fun funcaoListarTodosPeloViewModel() {

        viewModelScope.launch {

            repositorioRoomMVVM.funcaoListarTodosPeloRepositorio().let { listaDeUsuariosRetornados ->

                observerListarTodos.value = listaDeUsuariosRetornados
            }
        }
    }

    fun funcaoListarIdPeloViewModel( id: String ) = viewModelScope.launch {

        listarId.value = repositorioRoomMVVM.funcaoListarIdPeloRepositorio(id)
    }

    fun funcaoListarNomePeloViewModel( nome: String ) = viewModelScope.launch {

              listarNome.value = repositorioRoomMVVM.funcaoListarNomePeloRepositorio( nome )

    }

    fun funcaoListarIdadePeloViewModel( idade: String ) {

        viewModelScope.launch {

                listarIdade.value = repositorioRoomMVVM.funcaoListarIdadePeloRepositorio( idade )
        }
    }
}
