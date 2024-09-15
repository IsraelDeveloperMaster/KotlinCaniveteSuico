package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.api


import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.test.runTest
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto.ResultadoDummyAPI
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.dto.Usuario
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository.UsuarioRepositoryImpl

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import retrofit2.Response

//Mock vs Fake (DummyAPIService)
@RunWith( MockitoJUnitRunner::class )
class UsuarioRepositoryImplTest {

    @Mock
    private lateinit var dummyAPIService: DummyAPIService

    //todo DummyAPIServiceFake
    private lateinit var dummyAPIServiceFake: DummyAPIServiceFake

    @Before
    fun setUp() {

        //todo dummyAPIServiceFake = Mockito.mock( DummyAPIService::class.java )
        dummyAPIServiceFake = DummyAPIServiceFake()

        //todo MockitoAnnotations
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun listar_recuperarListaUsuarios_retornaLista() = runTest {

        val usuarioRepositoryImpl = UsuarioRepositoryImpl( dummyAPIServiceFake )
        val lista = usuarioRepositoryImpl.listar()

        assertThat(lista).isNotEmpty()
    }

    @Test
    fun listar_recuperarListaUsuarios_retornaLista2() = runTest {

        Mockito.`when`( dummyAPIService.recupearListaUsuarios() ).thenReturn(
            Response.success(
                ResultadoDummyAPI(
                    20, 10, 100,
                    listOf(
                        Usuario(35, "j@gmail.com", "Jamilton", "M"),
                        Usuario(23, "ana@gmail.com", "Ana", "F"),
                        Usuario(45, "joao@gmail.com", "João", "M"),
                    )
                )
            )
        )

        val usuarioRepositoryImpl = UsuarioRepositoryImpl( dummyAPIService )
        val lista = usuarioRepositoryImpl.listar()

        assertThat(lista).isNotEmpty()
    }

    @After
    fun tearDown() {
    }
}