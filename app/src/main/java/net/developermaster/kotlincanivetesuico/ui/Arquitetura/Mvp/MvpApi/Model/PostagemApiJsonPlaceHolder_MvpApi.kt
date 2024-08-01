package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.Model

import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.API.InterfaceRetrofitApiJsonPlaceHolder_MvpApi
import net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.API.RetrofitJsonPlaceHolder_MvpApi

class PostagemApiJsonPlaceHolder_MvpApi {

    //todo Atribuindo o Retrofit
    private val classeRetrofitJsonPlaceholderMvpApi by lazy {

        RetrofitJsonPlaceHolder_MvpApi.retrofit
    }

    suspend fun funcaoRecuperaPostagens(): List<ClasseDeDadosAPIJsonPlaceHolder_MvpApi> {

        val retorno_interface_recupetar_api_json_placeholder = classeRetrofitJsonPlaceholderMvpApi.create(InterfaceRetrofitApiJsonPlaceHolder_MvpApi::class.java)

        //todo cep passado pela caixa de texto
//        val dados_recebida_pelo_caixa_de_texto = "posts"

        try {

            //todo metodo da interface
            val retornaAsPostagens = retorno_interface_recupetar_api_json_placeholder.interfaceRecupetarEnderecoApiJsonPlaceHolder( /*dados_recebida_pelo_caixa_de_texto*/)

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
