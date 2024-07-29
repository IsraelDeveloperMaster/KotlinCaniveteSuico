package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvvm.MvvmApi.Model

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvvm.MvvmApi.API.InterfaceRetrofitApiJsonPlaceHolder_MvvmApi
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvvm.MvvmApi.API.RetrofitJsonPlaceHolder_MvvmApi

class PostagemApiJsonPlaceHolder_MvvmApi(  ) {

    //todo Atribuindo o Retrofit
    private val classeRetrofitJsonPlaceHolder_MvvmApi by lazy {

        RetrofitJsonPlaceHolder_MvvmApi.retrofit
    }

    suspend fun funcaoRecuperaPostagens(): List<ClasseDeDadosAPIJsonPlaceHolder_MvvmApi> {

        val retorno_interface_recupetar_api_json_placeholder = classeRetrofitJsonPlaceHolder_MvvmApi.create (InterfaceRetrofitApiJsonPlaceHolder_MvvmApi::class.java)

        //todo cep passado pela caixa de texto
//        val dados_recebida_pelo_caixa_de_texto = "posts"

        try {

            //todo metodo da interface
            val retornaAsPostagens = retorno_interface_recupetar_api_json_placeholder.interfaceRecupetarPostagemApiJsonPlaceHolder( /*dados_recebida_pelo_caixa_de_texto*/)

            if (retornaAsPostagens.isSuccessful) {

                retornaAsPostagens.body()?.let { retornoDasPostagensApiRecuperadasPorLet ->

                    return retornoDasPostagensApiRecuperadasPorLet
                }
            }

            //todo teste de erro
        } catch (erro_postagens: Exception) {

            erro_postagens.printStackTrace()

        }

        return emptyList()
    }
}