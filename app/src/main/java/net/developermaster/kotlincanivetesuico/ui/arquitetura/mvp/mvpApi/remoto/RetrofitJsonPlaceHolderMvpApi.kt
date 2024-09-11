package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvp.mvpApi.remoto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//object RetrofitJsonPlaceHolderMvpApi {
class RetrofitJsonPlaceHolderMvpApi {

    /*fun recuperaPostagensApiJsonPlaceHolder(): InterfaceRetrofitJsonPlaceHolderMvpApi {

        return Retrofit.Builder()

            //todo endereco base
            .baseUrl("https://jsonplaceholder.typicode.com/")

            //todo conversor para Json
            .addConverterFactory(GsonConverterFactory.create())

            .build()

            .create( InterfaceRetrofitJsonPlaceHolderMvpApi::class.java )
    }*/

    companion object {

        val retrofit = Retrofit.Builder()

            //todo endereco base
            .baseUrl("https://jsonplaceholder.typicode.com/")

            //todo conversor para Json
            .addConverterFactory(GsonConverterFactory.create())

            .build()
    }
}