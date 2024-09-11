package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter

import android.os.Bundle

interface InterfaceRoomMVVM {

    fun funcaoInterfaceRoomMvvmDeleteNotyfy(position: Int)

    fun funcaoInterfaceRoomMvvmAdicionar(bundle: Bundle, position: Int)
}