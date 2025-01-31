package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.repository

import androidx.lifecycle.MutableLiveData
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.model.ModelApiMvvmClean
import net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.remote.InterfaceRetrofitMvvmClean

class RepositorioJsonPlaceMvvmClean(private val interfaceretrofitapijsonplaceholderMvvmclean: InterfaceRetrofitMvvmClean) : RepositorioDataMvvmClean{ //todo instanciando pelo construtor e baixando o acoplamento // injecao

    //todo recupera a lista
    override val listaDePostagensRecuperadaDoRepositorio = MutableLiveData <List<ModelApiMvvmClean>>()

    //todo metodo que recupera as postagens
    override suspend fun funcaoRecuperaPostagens(){

        //todo dados passado pela caixa de texto
//        val dados_recebida_pelo_caixa_de_texto = "posts"

        try {

            //todo metodo da interface
            val retornaAsPostagens = interfaceretrofitapijsonplaceholderMvvmclean.interfaceRecupetarPostagemJsonPlaceHolder( /*dados_recebida_pelo_caixa_de_texto*/)

            if (retornaAsPostagens.isSuccessful && retornaAsPostagens.body() != null ) {

                listaDePostagensRecuperadaDoRepositorio.postValue(  retornaAsPostagens.body()  )

                }

            //todo teste de erro
        } catch (erroPostagens: Exception) {

            erroPostagens.printStackTrace()
        }
    }
}