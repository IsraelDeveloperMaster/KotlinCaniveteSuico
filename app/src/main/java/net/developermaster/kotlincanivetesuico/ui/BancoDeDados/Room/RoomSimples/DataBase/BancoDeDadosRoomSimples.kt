package net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomSimples.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomSimples.Dao.InterfaceDaoRoomSimples
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.Room.RoomSimples.ModelEntidade.ClasseDeDadosEntidadeRoomSimples

@Database( entities = [ClasseDeDadosEntidadeRoomSimples::class], version = 1 )

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