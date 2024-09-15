package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.auxiliar

import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class OperacoesBasicasTest {

    lateinit var operacoesBasicas: OperacoesBasicas

    @Before
    fun setUp() {

        operacoesBasicas = OperacoesBasicas()
    }

    @Test
    fun formataData() {

        val dataSemFormatacao = "22102025"
        val dataEsperada = "22/10/2025"

       val resultadoEsperado =  operacoesBasicas.formataData( dataSemFormatacao )

        assertThat( resultadoEsperado ).isEqualTo(dataEsperada)
    }

    @Test
    fun exibirAlerta() {

        val resultadoEsperado =  operacoesBasicas.exibirAlerta(  )

        assertThat( resultadoEsperado ).isTrue()
    }

    @Test
    fun recuperarDadosAPI() = runTest {

        val resultadoEsperado = operacoesBasicas.recuperarDadosAPI(   )

        assertThat( resultadoEsperado ).isNotEmpty()
    }
}