package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dao.InterfaceDaoRoomSimples
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.modelEntidade.ModelEntidadeRoomSimples

@Database( entities = [ModelEntidadeRoomSimples::class], version = 1 )

abstract class BancoDeDadosRoomSimples : RoomDatabase() {

    abstract fun classeDaoRoomSimples() : InterfaceDaoRoomSimples

    companion object {
        fun recuperarInstanciaRoomSimples(context: Context) : BancoDeDadosRoomSimples {//getInstance
            return Room.databaseBuilder(
                context,
                BancoDeDadosRoomSimples::class.java,
                "nome_banco_de_dados_room_simples.db"
            ).build()
        }
    }
}