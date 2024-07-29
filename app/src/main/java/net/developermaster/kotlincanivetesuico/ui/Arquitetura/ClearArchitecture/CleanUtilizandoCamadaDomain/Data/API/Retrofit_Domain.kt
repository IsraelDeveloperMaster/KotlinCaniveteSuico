package net.developermaster.kotlincanivetesuico.ui.Arquitetura.ClearArchitecture.CleanUtilizandoCamadaDomain.Data.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//class RetrofitJsonPlaceHolder_Domain {

    object Retrofit_Domain {

        fun recuperaPostagensApi_Domain(): InterfaceRetrofitApi_Domain {

            return Retrofit.Builder()

                //todo endereco base
                .baseUrl("https://jsonplaceholder.typicode.com/")

                //todo conversor para Json
                .addConverterFactory(GsonConverterFactory.create())

                .build()

                .create(InterfaceRetrofitApi_Domain::class.java)
        }
    }

    /*companion object {

        val retrofit = Retrofit.Builder()

            //todo endereco base
            .baseUrl("https://jsonplaceholder.typicode.com/")

            //todo conversor para Json
            .addConverterFactory(GsonConverterFactory.create())

            .build()
    }
}*/