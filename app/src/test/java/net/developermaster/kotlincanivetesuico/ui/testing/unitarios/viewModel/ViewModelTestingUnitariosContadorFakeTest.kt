package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.viewModel

import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runTest
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.fakeRepository.FakeRepository
import org.junit.Before
import org.junit.Test

class ViewModelTestingUnitariosContadorFakeTest {

    //todo instancia de ViewModelFake
     lateinit var viewModelFake : ViewModelFake

    //todo instancia de FakeRepository
     private lateinit var fakeRepository: FakeRepository

    @Before
    fun setUp() {

        //todo instancia de FakeRepository
        fakeRepository = FakeRepository()

        //todo instancia de ViewModelFake
        viewModelFake = ViewModelFake( fakeRepository )
    }

    @Test
    fun ` metodo Logar Usuario ViewModel Fake Retorna True` () = runTest( /*timeout = 30.seconds*/ ) {//todo utilizado para testes de suspend coroutines runTest e timeout 30 segundos
        //Dado (simulado)
        val email = "email4@email.com"
        val senha = "12345678"

        //Quando
        val resultado = viewModelFake.metodoLogarUsuarioViewModelFake(email, senha)

        //Então
        assertTrue(resultado)
    }

    @Test
    fun ` metodo Listar Usuario ViewModel Fake Retorna uma Lista nao Vazia` () = runTest( /*timeout = 30.seconds*/ ) {//todo utilizado para testes de suspend coroutines runTest e timeout 30 segundos
        //Dado (simulado)

        //Quando
        val lista = viewModelFake.metodoListarUsuarioViewModelFake()

        //Então
        assertThat(lista).isNotEmpty()
    }

    fun tearDown() { }
}





