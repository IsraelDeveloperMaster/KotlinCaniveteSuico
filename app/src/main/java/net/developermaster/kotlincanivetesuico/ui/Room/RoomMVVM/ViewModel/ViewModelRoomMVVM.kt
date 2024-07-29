
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.Room.RoomMVVM.DataBase.BancoDeDadosRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.Room.RoomMVVM.ModelEntidades.ClasseDeDadosEntidadeRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.Room.RoomMVVM.Repository.RepositorioRoomMVVM

class ViewModelRoomMVVM (application: Application ) : AndroidViewModel(application) {

    private val repositorioRoomMVVM : RepositorioRoomMVVM

    init {
        val interfaceDaoRoomMVVM = BancoDeDadosRoomMVVM.recuperarInstanciaRoomMVVM(application).classeDaoRoomMVVM()
        repositorioRoomMVVM = RepositorioRoomMVVM(interfaceDaoRoomMVVM)
    }

    fun salvar( classeDeDadosEntidadeRoomMVVM: ClasseDeDadosEntidadeRoomMVVM ) = viewModelScope.launch {
        repositorioRoomMVVM.salvar( classeDeDadosEntidadeRoomMVVM )
    }
    fun atualizar( classeDeDadosEntidadeRoomMVVM: ClasseDeDadosEntidadeRoomMVVM ) = viewModelScope.launch {
        repositorioRoomMVVM.atualizar( classeDeDadosEntidadeRoomMVVM )
    }
    fun deletar( classeDeDadosEntidadeRoomMVVM: ClasseDeDadosEntidadeRoomMVVM ) = viewModelScope.launch {
        repositorioRoomMVVM.deletar( classeDeDadosEntidadeRoomMVVM )
    }
    fun listar( classeDeDadosEntidadeRoomMVVM: ClasseDeDadosEntidadeRoomMVVM ) = viewModelScope.launch {
        repositorioRoomMVVM.listar(  )
    }
}
