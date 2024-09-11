package net.developermaster.kotlincanivetesuico.ui.arquitetura.dataBinding.dataBindingSimples.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import net.developermaster.kotlincanivetesuico.BR

data class ModelDataBindingSimples(var nome: String ) : BaseObservable() {

    @get:Bindable

    var name: String

        get() = nome
        set(value) {
            nome = value

            notifyPropertyChanged(BR.name)
        }
}
