package net.developermaster.kotlincanivetesuico.ui.arquitetura.clearArchitecture.cleanCamadaDomain.data.remoto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//class RetrofitJsonPlaceHolder_Domain {

    object ClasseRetrofitDomain {

        fun recuperaPostagensApi_Domain(): InterfaceRetrofitDomain {

            return Retrofit.Builder()

                //todo endereco base
                .baseUrl("https://jsonplaceholder.typicode.com/")

                //todo conversor para Json
                .addConverterFactory(GsonConverterFactory.create())

                .build()

                .create(InterfaceRetrofitDomain::class.java)
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