package net.developermaster.kotlincanivetesuico.ui.Room.RoomMVVM.Dao


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import net.developermaster.kotlincanivetesuico.ui.Room.RoomMVVM.ModelEntidades.ClasseDeDadosEntidadeRoomMVVM

@Dao
interface InterfaceDaoRoomMVVM {

    @Insert
    suspend fun salvar(classeDeDadosEntidadeRoomMVVM: ClasseDeDadosEntidadeRoomMVVM)

    @Update
    suspend fun atualizar(classeDeDadosEntidadeRoomMVVM: ClasseDeDadosEntidadeRoomMVVM)

    @Delete
    suspend fun deletar(classeDeDadosEntidadeRoomMVVM: ClasseDeDadosEntidadeRoomMVVM)


    //todo querys
    @Query("SELECT * FROM nome_da_tabela WHERE id = :idPesquisado")
    suspend fun listarId( idPesquisado : String ) : List<ClasseDeDadosEntidadeRoomMVVM>

    @Query("SELECT * FROM nome_da_tabela WHERE Coluna_nome LIKE '%' || :nomePesquisa || '%' ")
    suspend fun listarNome( nomePesquisa: String ) : List<ClasseDeDadosEntidadeRoomMVVM>

    @Query("SELECT * FROM nome_da_tabela WHERE Coluna_idade LIKE '%' || :idadePesquisa || '%' ")
    suspend fun listarIdade( idadePesquisa: String ) : List<ClasseDeDadosEntidadeRoomMVVM>

    @Query("SELECT * FROM nome_da_tabela")
    suspend fun listarTodos() /*: LiveData< List<classeDeDadosEntidadeRoomMVVM> >*/ : List<ClasseDeDadosEntidadeRoomMVVM>
}