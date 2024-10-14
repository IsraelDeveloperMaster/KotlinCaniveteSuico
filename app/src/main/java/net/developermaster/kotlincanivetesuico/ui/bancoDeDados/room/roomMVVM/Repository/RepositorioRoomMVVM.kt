package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.Repository
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dao.InterfaceDaoRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM

class RepositorioRoomMVVM(private val interfaceDaoRoomMVVM: InterfaceDaoRoomMVVM ) {

    suspend fun funcaAdicionarPeloRepositorio(modelEntidadeRoomMVVM: ModelEntidadeRoomMVVM ) {

        interfaceDaoRoomMVVM.salvar( modelEntidadeRoomMVVM )
        }

    suspend fun funcaoAtualizarPeloRepositorio(modelEntidadeRoomMVVM: ModelEntidadeRoomMVVM ) {

        println("funcaoAtualizarPeloRepositorio -> $modelEntidadeRoomMVVM")

        interfaceDaoRoomMVVM.atualizar( modelEntidadeRoomMVVM )
        }

    suspend fun funcaoDeletarPeloRepositorio(modelEntidadeRoomMVVM: ModelEntidadeRoomMVVM ) {

        interfaceDaoRoomMVVM.deletar( modelEntidadeRoomMVVM )
        }

    suspend fun funcaoListarTodosPeloRepositorio(  ) : List<ModelEntidadeRoomMVVM>  {

        println("funcaoListarTodosPeloRepositorio")

        return interfaceDaoRoomMVVM.listarTodos()
    }

    suspend fun funcaoListarIdPeloRepositorio( pesquisaId: String ) : List<ModelEntidadeRoomMVVM> {

        println("funcaoListarIdPeloRepositorio -> $pesquisaId")

        return interfaceDaoRoomMVVM.listarId( pesquisaId )
    }

    suspend fun funcaoListarNomePeloRepositorio( pesquisaNome: String ) : List<ModelEntidadeRoomMVVM> {

        println("funcaoListarNomePeloRepositorio -> $pesquisaNome")

        return interfaceDaoRoomMVVM.listarNome( pesquisaNome )
    }

    suspend fun funcaoListarIdadePeloRepositorio( pesquisaIdade: String ) : List<ModelEntidadeRoomMVVM> {

        return interfaceDaoRoomMVVM.listarIdade( pesquisaIdade )

        println("repositorio listar idade -> $pesquisaIdade")
    }
}