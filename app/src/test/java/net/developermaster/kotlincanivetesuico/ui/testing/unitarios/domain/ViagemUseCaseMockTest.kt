package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain

import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.anyDouble
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith( MockitoJUnitRunner :: class ) //todo anotacao mock
class ViagemUseCaseMockTest {

    lateinit var viagemUseCaseMock: ViagemUseCaseMock

    @Mock //todo mock com anotacao
    lateinit var viagemUseCaseImplementacao: ViagemUseCaseImplementacao

    @Before
    fun setUp() {

        //todo mock com anotacao
        MockitoAnnotations.openMocks( this )

        viagemUseCaseImplementacao = ViagemUseCaseImplementacao()

        viagemUseCaseMock = ViagemUseCaseMock( viagemUseCaseImplementacao )
    }

    @Test
    fun listarLocais() = runTest() {

        val lista = listOf(  Pair("Rio de Janeiro", "RJ") )

        //Quando
        //todo cria um metodo ficticio
        `when` ( viagemUseCaseImplementacao.listarLocais() ).thenReturn( lista )

        val resultado = viagemUseCaseMock.listarLocais()

        assertThat(resultado).isNotEmpty()
    }

    @Test
    fun calcularPrecoViagem() = runTest {

        val distancia = 10.0
        val precoKM = 2.0
        val resultadoEsperado = 20.0

        //Quando
        //todo cria um metodo ficticio
        Mockito. `when` ( viagemUseCaseImplementacao.calcularPrecoViagem( anyDouble() , anyDouble()) ).thenReturn( resultadoEsperado )

        val resultado = viagemUseCaseMock.calcularPrecoViagem( distancia , precoKM )

        assertThat(resultado).isEqualTo(resultadoEsperado)

    }
}