package net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Adapter

import android.os.Bundle
import net.developermaster.kotlincanivetesuico.ui.FireBase.FireBaseMVVM.Model.ClasseDeDadosFireBaseMVVM

interface InterfaceFireBaseMVVM {

    fun funcaoInterfaceFireBaseMvvmListarImagensNotyfy()

    fun funcaoInterfaceFireBaseMvvmDeleteNotyfy(position: Int)

    fun funcaoInterfaceFireBaseMvvmSalvarImagem(classeDeDadosFireBaseMVVM: ClasseDeDadosFireBaseMVVM)

    fun funcaoInterfaceFireBaseMvvmAdicionar(bundle: Bundle, position: Int)

}