package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dao


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM

@Dao
interface InterfaceDaoRoomMVVM {

    @Insert
    suspend fun salvar(modelEntidadeRoomMVVM: ModelEntidadeRoomMVVM)

    @Update
    suspend fun atualizar(modelEntidadeRoomMVVM: ModelEntidadeRoomMVVM)

    @Delete
    suspend fun deletar(modelEntidadeRoomMVVM: ModelEntidadeRoomMVVM)

    //todo querys
    @Query("SELECT * FROM nome_da_tabela WHERE id LIKE :idPesquisa")
    suspend fun listarId( idPesquisa : String ) : List<ModelEntidadeRoomMVVM>

    @Query("SELECT * FROM nome_da_tabela WHERE Coluna_nome LIKE '%' || :nomePesquisa || '%' ")
    suspend fun listarNome( nomePesquisa: String ) : List<ModelEntidadeRoomMVVM>

    @Query("SELECT * FROM nome_da_tabela WHERE Coluna_idade LIKE '%' || :idadePesquisa || '%' ")
    suspend fun listarIdade( idadePesquisa: String ) : List<ModelEntidadeRoomMVVM>

    @Query("SELECT * FROM nome_da_tabela")
    suspend fun listarTodos() /*: LiveData< List<classeDeDadosEntidadeRoomMVVM> >*/ : List<ModelEntidadeRoomMVVM>
}