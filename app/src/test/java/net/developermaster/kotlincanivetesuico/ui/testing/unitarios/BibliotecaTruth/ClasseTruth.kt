package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.BibliotecaTruth

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ClasseTruth {

    @Before
    fun setUp() {
    }

    @Test
    fun TestTruth1() {
        //todo dado (simulado)
        val lista = listOf("A", "B", "C")

        //todo quando

        //todo então
        assertThat(lista).contains("A")//testa se contem um item na lista
    }

    @Test
    fun TestTruth2() {
        //todo dado (simulado)
        val lista = listOf("A", "B", "C")

        //todo quando

        //todo então
        assertThat(lista).containsExactly("A", "B", "C")//testa se contem a lista inteira
    }

    @Test
    fun TestTruth3() {
        //todo dado (simulado)
        val lista = listOf("A", "B", "C")

        //todo quando

        //todo então
        assertThat(lista).doesNotContain("D")//testa se não contem um item na lista
    }

    @Test
    fun TestTruth4() {
        //todo dado (simulado)
        val lista = listOf("A", "B", "C")

        //todo quando

        //todo então
        assertThat(lista).containsAnyOf("A", "D")//testa se contem algum item na lista
    }

    @Test
    fun TestTruth5() {
        //todo dado (simulado)
        val lista = listOf("A", "B", "C")

        //todo quando

        //todo então
        assertThat(lista).containsNoneOf("D", "E")//testa se não contem nenhum item na lista
    }

    @Test
    fun TestTruth6() {
        //todo dado (simulado)
        val lista = listOf("A", "B", "C")
        val lista2 = listOf("A", "B", "C")

        //todo quando

        //todo então
        assertThat(lista).isEqualTo(lista2)//testa se as listas são iguais
    }

    @Test
    fun TestTruth7() {
        //todo dado (simulado)
        val lista = listOf("A", "B", "C")
        val lista2 = listOf("A", "B", "D")

        //todo quando

        //todo então
        assertThat(lista).isNotEqualTo(lista2)//testa se as listas são diferentes
    }

    @Test
    fun TestTruth8() {
        //todo dado (simulado)
        val lista = listOf("A", "B", "C")

        //todo quando

        //todo então
        assertThat(lista).isNotEmpty()//testa se a lista está vazia
    }

    @Test
    fun TestTruth9() {
        //todo dado (simulado)
        val lista = listOf("A", "B", "C")

        //todo quando

        //todo então
        assertThat(lista).hasSize(3)//testa se o tamanho da lista é 3
    }

    @Test
    fun TestTruth10() {
        //todo dado (simulado)
        val maria : String
        maria = "Maria"

        //todo quando

        //todo então
        assertThat(maria).startsWith("M")//testa se a string começa com a letra M
    }

    @Test
    fun TestTruth11() {
        //todo dado (simulado)
        val maria : String
        maria = "Maria"

        //todo quando

        //todo então
        assertThat(maria).endsWith("a")//testa se a string termina com a letra a
    }

    @Test
    fun TestTruth12() {
        //todo dado (simulado)
        val maria : String
        maria = "Maria"

        //todo quando

        //todo então
           maria.length//testa se o tamanho da string é 5
    }

    @Test
    fun TestTruth13() {
        //todo dado (simulado)
        val maria : String
        maria = "Maria"

        //todo quando

        //todo então
        assertThat(maria).isNotNull()//testa se a string não é nula
    }

    @Test
    fun TestTruth14() {
        //todo dado (simulado)
        val numero1 = 10
        val numero2 = 20

        //todo quando

        //todo então
        assertThat(numero1).isLessThan(numero2)//testa se o numero é menor que o numero2
    }

    @Test
    fun TestTruth15() {
        //todo dado (simulado)
        val numero1 = 10
        val numero2 = 20

        //todo quando

        //todo então
        assertThat(numero2).isGreaterThan(numero1)//testa se o numero é maior que o numero2
    }

    @Test
    fun TestTruth16() {
        //todo dado (simulado)
        val numero1 = 10

        //todo quando

        //todo então
        assertThat(numero1).isIn(8..10)//testa se o numero está entre 8 e 10
    }

    @Test
    fun TestTruth17() {
        //todo dado (simulado)
        val numero1 : Boolean = true

        //todo quando

        //todo então
        assertThat(numero1).isTrue()//testa se o boolean é true
    }

    @Test
    fun TestTruth18() {
        //todo dado (simulado)
        val numero1 : Boolean = false

        //todo quando

        //todo então
        assertThat(numero1).isFalse()//testa se o boolean é false
    }

    @After
    fun tearDown() {
    }
}