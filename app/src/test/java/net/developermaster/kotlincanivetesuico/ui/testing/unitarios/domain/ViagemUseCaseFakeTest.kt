package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.domain

import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.fakeRepository.FakeViagemRepository
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Regras.RegrasPersonalizadas
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class ViagemUseCaseFakeTest {

    lateinit var viagemUseCaseFake: ViagemUseCaseFake

    lateinit var fakeViagemRepository: FakeViagemRepository

    @get:Rule
    val regras = RegrasPersonalizadas("100")//todo inicia antes de cada metodo

    @Before
    fun setUp() {

        println( "setUp" )

        fakeViagemRepository = FakeViagemRepository()

        viagemUseCaseFake = ViagemUseCaseFake( fakeViagemRepository )
    }

    @Test
    fun listarLocais() = runTest() {

        println( "@listarLocais" )

        val lista = listOf(   Pair("Rio de Janeiro", "RJ") )

        val resultadoEsperado = viagemUseCaseFake.listarLocaisFake()

        assertThat(resultadoEsperado).isNotEmpty()
        assertThat(lista).isEqualTo(resultadoEsperado)

        assertEquals("Rio de Janeiro", resultadoEsperado[0].first)
        assertEquals("RJ", resultadoEsperado[0].second)

        regras.log = "$resultadoEsperado"
    }

    @Test
    fun calcularPrecoViagem() = runTest {

        println( "@calcularPrecoViagem" )


        val distancia = 10.0
        val precoKM = 2.0

        val resultado = viagemUseCaseFake.calcularPrecoViagemFake (distancia , precoKM)

        assertThat( distancia * precoKM ).isEqualTo( resultado )

        regras.log2
    }

    @After
    fun tearDown(){

        println( "tearDown" )

    }
}