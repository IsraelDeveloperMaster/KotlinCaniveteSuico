package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.adapter

import androidx.recyclerview.widget.DiffUtil
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM

class ClasseDiffUtilFireBaseMVVM (private val listaAntiga: List<ModelFireBaseMVVM>, private val listaNova: List<ModelFireBaseMVVM> ) : DiffUtil.Callback() {

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