package net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.api

import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.model.dto.ResultadoDummyAPI
import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.model.dto.Usuario
import retrofit2.Response

class DummyAPIServiceFake : DummyAPIService {
    override suspend fun recupearListaUsuarios(): Response<ResultadoDummyAPI> {
        return Response.success(
            ResultadoDummyAPI(
                20, 10, 100,
                listOf(
                    Usuario(35, "j@gmail.com", "Jamilton", "M"),
                    Usuario(23, "ana@gmail.com", "Ana", "F"),
                    Usuario(45, "joao@gmail.com", "João", "M"),
                )
            )
        )
    }
}