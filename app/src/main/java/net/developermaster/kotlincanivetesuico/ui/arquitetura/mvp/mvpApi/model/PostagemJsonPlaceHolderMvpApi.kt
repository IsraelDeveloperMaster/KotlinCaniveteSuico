package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.model

import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.remoto.InterfaceRetrofitJsonPlaceHolderMvpApi
import net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.remoto.RetrofitJsonPlaceHolderMvpApi

class PostagemJsonPlaceHolderMvpApi {

    //todo Atribuindo o Retrofit
    private val classeRetrofitJsonPlaceholderMvpApi by lazy {

        RetrofitJsonPlaceHolderMvpApi.retrofit
    }

    suspend fun funcaoRecuperaPostagens(): List<ModelJsonPlaceHolderMvpApi> {

        val retorno_interface_recupetar_api_json_placeholder = classeRetrofitJsonPlaceholderMvpApi.create(InterfaceRetrofitJsonPlaceHolderMvpApi::class.java)

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
