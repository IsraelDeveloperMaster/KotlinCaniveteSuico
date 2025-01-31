package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.dao.InterfaceDaoRoomMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM

@Database( entities = [ModelEntidadeRoomMVVM::class], version = 1 )

abstract class BancoDeDadosRoomMVVM : RoomDatabase() {

    abstract fun classeDaoRoomMVVM() : InterfaceDaoRoomMVVM

    companion object {
        fun recuperarInstanciaRoomMVVM( context: Context ) : BancoDeDadosRoomMVVM {//getInstance
            return Room.databaseBuilder(
                context,
                BancoDeDadosRoomMVVM::class.java,
                "nome_banco_de_dados_room_mvvm.db"
            ).build()
        }
    }
}