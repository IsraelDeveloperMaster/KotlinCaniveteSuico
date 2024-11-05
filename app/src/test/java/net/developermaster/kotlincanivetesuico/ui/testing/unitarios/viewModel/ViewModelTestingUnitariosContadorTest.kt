package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.viewModel

import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.fakeRepository.FakeRepositoryTestUnitSuspend
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ViewModelTestingUnitariosContadorTest : TestCase() {

    private lateinit var viewModelTestingUnitarios: ViewModelTestingUnitarios
    private lateinit var fakeRepositoryTestUnitSuspend: FakeRepositoryTestUnitSuspend

    @Before
    public override fun setUp() {

        fakeRepositoryTestUnitSuspend = FakeRepositoryTestUnitSuspend()

        viewModelTestingUnitarios = ViewModelTestingUnitarios( fakeRepositoryTestUnitSuspend )
    }

    @Test
    fun metodoLogarUsuarioViewModelFake( )=
        kotlinx.coroutines.test.runTest( /*timeout = 30.seconds*/) {//todo utilizado para testes de suspend coroutines runTest e timeout 30 segundos
            //Dado (simulado)
            val email = "email4@email.com"
            val senha = "12345678"
            //Quando
            val resultado = viewModelTestingUnitarios.metodoLogarUsuarioViewModelFake(email, senha)
            //Então
            assertThat(resultado).isTrue()
        }

    @Test
    fun metodoListarUsuarioViewModelFake() {
    }

    @After
    public override fun tearDown() {
    }
}