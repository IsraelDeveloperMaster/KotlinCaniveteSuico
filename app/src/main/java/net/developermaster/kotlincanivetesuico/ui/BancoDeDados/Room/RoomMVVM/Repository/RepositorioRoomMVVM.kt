package net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomMVVM.Repository
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomMVVM.Dao.InterfaceDaoRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomMVVM.ModelEntidades.ClasseDeDadosEntidadeRoomMVVM

class RepositorioRoomMVVM(val interfaceDaoRoomMVVM: InterfaceDaoRoomMVVM) {

    suspend fun salvar( classeDeDadosEntidadeRoomMVVM: ClasseDeDadosEntidadeRoomMVVM) {

        interfaceDaoRoomMVVM.salvar( classeDeDadosEntidadeRoomMVVM )
        }

    suspend fun atualizar( classeDeDadosEntidadeRoomMVVM: ClasseDeDadosEntidadeRoomMVVM) {

        interfaceDaoRoomMVVM.atualizar( classeDeDadosEntidadeRoomMVVM )
        }

    suspend fun deletar( classeDeDadosEntidadeRoomMVVM: ClasseDeDadosEntidadeRoomMVVM) {

        interfaceDaoRoomMVVM.deletar( classeDeDadosEntidadeRoomMVVM )
        }

    suspend fun listar(  ) {

        interfaceDaoRoomMVVM.listarTodos()
        }
}