package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "nome_da_tabela")
data class ModelEntidadeRoomMVVM(

    @PrimaryKey(autoGenerate = true)//1 2 3 automatico
    val id: Int = 0,

    @ColumnInfo("Coluna_nome")
    val nome: String = "",

    @ColumnInfo("Coluna_idade")
    val idade: String = ""
)