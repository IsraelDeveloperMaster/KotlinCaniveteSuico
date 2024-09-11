package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dao


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.modelEntidade.ModelEntidadeRoomSimples

@Dao
interface InterfaceDaoRoomSimples {

    @Insert
    suspend fun salvar(modelEntidadeRoomSimples: ModelEntidadeRoomSimples)

    @Update
    suspend fun atualizar(modelEntidadeRoomSimples: ModelEntidadeRoomSimples)

    @Delete
    suspend fun deletar(modelEntidadeRoomSimples: ModelEntidadeRoomSimples)


    //todo querys
    @Query("SELECT * FROM nome_da_tabela WHERE id = :idPesquisado")
    suspend fun listarId( idPesquisado : String ) : List<ModelEntidadeRoomSimples>

    @Query("SELECT * FROM nome_da_tabela WHERE Coluna_nome LIKE '%' || :nomePesquisa || '%' ")
    suspend fun listarNome( nomePesquisa: String ) : List<ModelEntidadeRoomSimples>

    @Query("SELECT * FROM nome_da_tabela WHERE Coluna_idade LIKE '%' || :idadePesquisa || '%' ")
    suspend fun listarIdade( idadePesquisa: String ) : List<ModelEntidadeRoomSimples>

    @Query("SELECT * FROM nome_da_tabela")
    suspend fun listarTodos() : List<ModelEntidadeRoomSimples>
}