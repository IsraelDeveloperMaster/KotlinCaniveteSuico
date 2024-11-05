package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.viewModel

import com.google.common.truth.Truth
import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runTest
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.model.ModelTestUnitario
import net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Repository.ClasseRepositorioTestUnitImplSupend
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith( MockitoJUnitRunner :: class ) //todo anotacao mock
class ViewModelTestingUnitariosContadorMockTest {

    //todo instancia de ViewModelFake
    lateinit var viewModelMock : ViewModelMock

    @Mock //todo mock com anotacao
    private lateinit var classeRepositorioTestUnitImplSupend : ClasseRepositorioTestUnitImplSupend

    @Before
    fun setUp() {

        classeRepositorioTestUnitImplSupend = ClasseRepositorioTestUnitImplSupend()

        //todo mocki sem anotacao
//        interfaceRepositorioTestUnitSuspend = mock (InterfaceRepositorioTestUnitSuspend::class.java)

        //todo mock com anotacao
        MockitoAnnotations.openMocks( this )

        viewModelMock = ViewModelMock( classeRepositorioTestUnitImplSupend )
    }

    @Test
    fun  ` metodo Logar Usuario ViewModel Mock com Dados Ficticios Retorna True` () = runTest( /*timeout = 30.seconds*/ ) {//todo utilizado para testes de suspend coroutines runTest e timeout 30 segundos
        //Dado (simulado)
        val email = "email4@email.com"
        val senha = "12345678"

        //Quando
        //todo cria um metodo ficticio
        Mockito. `when` ( classeRepositorioTestUnitImplSupend.metodoLogarUsuarioRepositorioTestUnitSuspend( email, senha ) ).thenReturn( true )

        val resultado = viewModelMock.metodoLogarUsuarioViewModelMockDadosFicticios(email, senha)

        //Então
        assertTrue(resultado)
    }

    @Test
    fun ` metodo Listar Usuario ViewModel Mock com Dados Ficticios Retorna uma Lista nao Vazia` () = runTest( /*timeout = 30.seconds*/ ) {//todo utilizado para testes de suspend coroutines runTest e timeout 30 segundos
        //Dado (simulado)

        //Quando
        //todo cria um metodo ficticio
        Mockito.`when`( classeRepositorioTestUnitImplSupend.metodoListarUsuarioRepositorioTestUnitSuspend() ).thenReturn(

                    listOf( ModelTestUnitario ("Ana" , "ana@gmail.com")) )

        val lista = viewModelMock.metodoListarUsuarioViewModelMockDadosFicticios()

        //Então
        Truth.assertThat(lista).isNotEmpty()
    }

    @Test
    fun ` metodo Logar Usuario ViewModel Mock com Dados Real Retorna True` () = runTest( /*timeout = 30.seconds*/ ) {//todo utilizado para testes de suspend coroutines runTest e timeout 30 segundos
        //Dado (simulado)
        val email = "email4@email.com"
        val senha = "12345678"

        //Quando
        //todo cria um metodo real
        Mockito .`when` ( classeRepositorioTestUnitImplSupend.metodoLogarUsuarioRepositorioTestUnitSuspend( email, senha ) ).thenCallRealMethod(  )

        val resultado = viewModelMock.metodoLogarUsuarioViewModelMockDadosReal ( email, senha )

        //Então
        assertTrue(resultado)
    }

    @After
    fun tearDown() {
    }

    @Test
    fun ` metodo Listar Usuario ViewModel Mock com Dados Real Retorna uma Lista nao Vazia` () = runTest( /*timeout = 30.seconds*/ ) {//todo utilizado para testes de suspend coroutines runTest e timeout 30 segundos
        //Dado (simulado)

        //Quando
        //todo cria um metodo real
        Mockito. `when` ( classeRepositorioTestUnitImplSupend.metodoListarUsuarioRepositorioTestUnitSuspend( ) ).thenCallRealMethod(  )

        val resultado = viewModelMock.metodoListarUsuarioViewModelMockDadosReal()

        //Então
        assertThat(resultado).isNotEmpty()
    }

    @Test
    fun ` metodo Salvar Usuario ViewModel Mock com Dados Real Retorna uma Somar de A + B `() = runTest( /*timeout = 30.seconds*/ ) {//todo utilizado para testes de suspend coroutines runTest e timeout 30 segundos
        //Dado (simulado)
        val A = 1
        val B = 2

        //Quando
        //todo cria um metodo real
        Mockito .`when` ( classeRepositorioTestUnitImplSupend.metodoSalvarUsuarioRepositorioTestUnitSuspend( A , B ) ).thenCallRealMethod(  )

        val resultado = viewModelMock.metodoSalverUsuarioViewModelMockDadosReal ( A, B )

        //Então
        assertThat(resultado)
    }
}