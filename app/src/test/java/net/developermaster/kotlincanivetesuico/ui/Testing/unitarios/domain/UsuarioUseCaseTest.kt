package net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.domain

import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.test.runTest
import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.model.dto.Usuario
import net.developermaster.kotlincanivetesuico.ui.Testing.unitarios.Repository.UsuarioRepositoryImpl
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner


//Mock vs Fake (UsuarioRepositoryImpl)
@RunWith( MockitoJUnitRunner::class )
class UsuarioUseCaseTest {

    @Mock
     lateinit var usuarioRepositoryImpl: UsuarioRepositoryImpl//todo UsuarioRepositoryImpl mockado

     lateinit var usuarioRepositoryFake: UsuarioRepositoryFake//todo UsuarioRepositoryFake

     lateinit var usuarioUseCase: UsuarioUseCase

    @Before
    fun setUp() {

        MockitoAnnotations.openMocks(this)

        usuarioRepositoryFake = UsuarioRepositoryFake()//todo UsuarioRepositoryFake

        usuarioUseCase = UsuarioUseCase( usuarioRepositoryFake )
    }

    @Test
    fun invoke_retornaUsuariosFiltrados_retornaLista() = runTest{

        val listaUsuariosFiltrados = usuarioUseCase()

        assertThat( listaUsuariosFiltrados ).isNotEmpty()
    }

    @Test
    fun invoke_retornaUsuariosFiltrados_retornaLista2() = runTest{

        Mockito.`when`( usuarioRepositoryImpl.listar() ).thenReturn(
            listOf(
                Usuario(42, "j@gmail.com", "Jamilton", "M"),
                Usuario(23, "ana@gmail.com", "Ana", "F"),
                Usuario(45, "joao@gmail.com", "João", "M"),
            )
        )

        val listaUsuariosFiltrados = usuarioUseCase()

        assertThat( listaUsuariosFiltrados ).isNotEmpty()
    }

    @After
    fun tearDown() {
    }
}