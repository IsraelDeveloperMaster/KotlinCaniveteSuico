package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanMvvm.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

    //object RetrofitJsonPlaceHolderMvpApi {
    class ClasseRetrofitMvvmClean {

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

            val retrofit: Retrofit = Retrofit.Builder()

                //todo endereco base
                .baseUrl("https://jsonplaceholder.typicode.com/")

                //todo conversor para Json
                .addConverterFactory(GsonConverterFactory.create())

                .build()
        }
    }