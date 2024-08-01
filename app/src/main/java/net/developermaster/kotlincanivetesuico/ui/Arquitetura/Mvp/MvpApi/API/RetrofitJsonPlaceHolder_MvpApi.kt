package net.developermaster.kotlincanivetesuico.ui.Arquitetura.Mvp.MvpApi.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//object RetrofitJsonPlaceHolder_MvpApi {
class RetrofitJsonPlaceHolder_MvpApi {

    /*fun recuperaPostagensApiJsonPlaceHolder(): InterfaceRetrofitApiJsonPlaceHolder_MvpApi {

        return Retrofit.Builder()

            //todo endereco base
            .baseUrl("https://jsonplaceholder.typicode.com/")

            //todo conversor para Json
            .addConverterFactory(GsonConverterFactory.create())

            .build()

            .create( InterfaceRetrofitApiJsonPlaceHolder_MvpApi::class.java )
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