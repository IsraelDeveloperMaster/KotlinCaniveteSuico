package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.adapter

import androidx.recyclerview.widget.DiffUtil
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomMVVM.modelEntidades.ModelEntidadeRoomMVVM

class ClasseDiffUtilRoomMVVM (private val listaAntiga: List<ModelEntidadeRoomMVVM>, private val listaNova: List<ModelEntidadeRoomMVVM> ) : DiffUtil.Callback() {

    override fun getOldListSize() : Int {

        return listaAntiga.size
    }

    override fun getNewListSize(): Int {

        return listaNova.size
    }

    override fun areItemsTheSame(itemAntigoPosition: Int, itemNovoPosition: Int): Boolean {
        val classeDeDadosAntigo = listaAntiga[itemAntigoPosition]
        val classeDeDadosNovo = listaNova[itemNovoPosition]
        return classeDeDadosAntigo.id == classeDeDadosNovo.id
    }

    override fun areContentsTheSame(itemAntigoPosition: Int, itemNovoPosition: Int): Boolean {
        val classeDeDadosAntigo = listaAntiga[itemAntigoPosition]
        val classeDeDadosNovo = listaNova[itemNovoPosition]
        return classeDeDadosAntigo == classeDeDadosNovo
    }
}