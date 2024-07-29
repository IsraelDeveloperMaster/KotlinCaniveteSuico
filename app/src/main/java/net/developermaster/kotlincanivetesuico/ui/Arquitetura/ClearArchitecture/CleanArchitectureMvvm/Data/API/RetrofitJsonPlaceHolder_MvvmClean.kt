package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanArchitectureMvvm.Data.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

    //object RetrofitJsonPlaceHolder_MvpApi {
    class RetrofitJsonPlaceHolder_MvvmClean {

        /*fun recuperaPostagensApiJsonPlaceHolder(): InterfaceRetrofitApiJsonPlaceHolder_MvvmApi {

            return Retrofit.Builder()

                //todo endereco base
                .baseUrl("https://jsonplaceholder.typicode.com/")

                //todo conversor para Json
                .addConverterFactory(GsonConverterFactory.create())

                .build()

                .create( InterfaceRetrofitApiJsonPlaceHolder_MvpApi::class.java )
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