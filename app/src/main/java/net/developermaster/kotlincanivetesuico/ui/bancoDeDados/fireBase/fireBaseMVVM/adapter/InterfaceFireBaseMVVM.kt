package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.adapter

import android.os.Bundle
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.model.ModelFireBaseMVVM

interface InterfaceFireBaseMVVM {

    fun funcaoInterfaceFireBaseMvvmListarImagensNotyfy()

    fun funcaoInterfaceFireBaseMvvmDeleteNotyfy(position: Int)

    fun funcaoInterfaceFireBaseMvvmSalvarImagemAdapter(modelFireBaseMVVM: ModelFireBaseMVVM)

    fun funcaoInterfaceFireBaseMvvmAdicionar(bundle: Bundle, position: Int)

}