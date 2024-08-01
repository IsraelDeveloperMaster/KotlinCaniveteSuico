package net.developermaster.kotlincanivetesuico.ui.Room.RoomSimples.ModelEntidade

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "nome_da_tabela")
data class ClasseDeDadosEntidadeRoomSimples(

    @PrimaryKey(autoGenerate = true)//1 2 3
    val id: Int,

    @ColumnInfo("Coluna_nome")
    val nome: String,

    @ColumnInfo("Coluna_idade")
    val idade: String
)