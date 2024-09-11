package net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.data.model.Product
import net.developermaster.kotlincanivetesuico.ui.arquitetura.hilt.hiltClearDomainDummyProdutos.domain.UseCase.GetUseCaseDomainDummyProdutos
import javax.inject.Inject

@HiltViewModel
class ViewModelDomainProdutos @Inject constructor(private val produtosUseCase: GetUseCaseDomainDummyProdutos
) : ViewModel() {

    //LiveData Privado
    private val _produtos = MutableLiveData<List<Product>>()

    //LiveData Público
    val produtos: LiveData<List<Product>>
        get() = _produtos

    init {

        recuperarProdutos(  )
    }

    private fun recuperarProdutos(  ) {

        viewModelScope.launch {
            val listaUsuarios = produtosUseCase()
            _produtos.postValue(listaUsuarios)
        }
    }
}