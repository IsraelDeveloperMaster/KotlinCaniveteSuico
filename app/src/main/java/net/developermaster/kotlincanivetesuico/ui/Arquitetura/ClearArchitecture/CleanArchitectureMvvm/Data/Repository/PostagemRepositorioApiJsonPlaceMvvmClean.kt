package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.Repository

import androidx.lifecycle.MutableLiveData
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.API.InterfaceRetrofitApiJsonPlaceHolder_MvvmClean
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.Model.ClasseDeDadosAPIJsonPlaceHolder_MvvmClean

class PostagemRepositorioApiJsonPlaceMvvmClean(private val interfaceretrofitapijsonplaceholderMvvmclean: InterfaceRetrofitApiJsonPlaceHolder_MvvmClean) : InterfaceRepositorioData_MvvmClean{ //todo instanciando pelo construtor e baixando o acoplamento // injecao

    //todo recupera a lista
    override val listaDePostagensRecuperadaDoRepositorio = MutableLiveData <List<ClasseDeDadosAPIJsonPlaceHolder_MvvmClean>>()

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