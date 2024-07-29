package net.developermaster.kotlincanivetesuico.ui.Arquitetura.DataBinding.DataBindingSimples.Model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import net.developermaster.kotlincanivetesuico.BR

data class Usuarios(var nome: String ) : BaseObservable() {

    @get:Bindable

    var name: String

        get() = nome
        set(value) {
            nome = value

            notifyPropertyChanged(BR.name)
        }
}
