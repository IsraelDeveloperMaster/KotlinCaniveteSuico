package net.developermaster.kotlincanivetesuico.ui.BancoDeDados.FireBase.FireBaseMVVM.Adapter

import android.os.Bundle
import net.developermaster.kotlincanivetesuico.ui.BancoDeDados.FireBase.FireBaseMVVM.Model.ClasseDeDadosFireBaseMVVM

interface InterfaceFireBaseMVVM {

    fun funcaoInterfaceFireBaseMvvmListarImagensNotyfy()

    fun funcaoInterfaceFireBaseMvvmDeleteNotyfy(position: Int)

    fun funcaoInterfaceFireBaseMvvmSalvarImagemAdapter(classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM)

    fun funcaoInterfaceFireBaseMvvmAdicionar(bundle: Bundle, position: Int)

}