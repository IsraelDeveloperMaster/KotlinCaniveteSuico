package net.developermaster.kotlincanivetesuico.ui.arquitetura.mvvm.mvvmApi.remoto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

    //object RetrofitJsonPlaceHolderMvpApi {
    class RetrofitJsonPlaceHolderMvvmApi {

        /*fun recuperaPostagensApiJsonPlaceHolder(): InterfaceRetrofitJsonPlaceHolderMvvmApi {

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