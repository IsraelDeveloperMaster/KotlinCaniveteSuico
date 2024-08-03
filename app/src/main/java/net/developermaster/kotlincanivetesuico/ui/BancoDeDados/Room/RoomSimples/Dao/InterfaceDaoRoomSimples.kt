package net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomSimples.Dao


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomSimples.ModelEntidade.ClasseDeDadosEntidadeRoomSimples

@Dao
interface InterfaceDaoRoomSimples {

    @Insert
    fun salvar(classeDeDadosEntidadeRoomSimples: ClasseDeDadosEntidadeRoomSimples)

    @Update
    fun atualizar(classeDeDadosEntidadeRoomSimples: ClasseDeDadosEntidadeRoomSimples)

    @Delete
    fun deletar(classeDeDadosEntidadeRoomSimples: ClasseDeDadosEntidadeRoomSimples)


    //todo querys
    @Query("SELECT * FROM nome_da_tabela WHERE id = :idPesquisado")
    fun listarId( idPesquisado : String ) : List<ClasseDeDadosEntidadeRoomSimples>

    @Query("SELECT * FROM nome_da_tabela WHERE Coluna_nome LIKE '%' || :nomePesquisa || '%' ")
    fun listarNome( nomePesquisa: String ) : List<ClasseDeDadosEntidadeRoomSimples>

    @Query("SELECT * FROM nome_da_tabela WHERE Coluna_idade LIKE '%' || :idadePesquisa || '%' ")
    fun listarIdade( idadePesquisa: String ) : List<ClasseDeDadosEntidadeRoomSimples>

    @Query("SELECT * FROM nome_da_tabela")
    fun listarTodos() : List<ClasseDeDadosEntidadeRoomSimples>
}