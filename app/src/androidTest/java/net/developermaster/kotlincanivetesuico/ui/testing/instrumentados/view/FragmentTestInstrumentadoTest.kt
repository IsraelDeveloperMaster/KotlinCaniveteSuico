package net.developermaster.kotlincanivetesuico.ui.testing.instrumentados.view

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.doubleClick
import androidx.test.espresso.action.ViewActions.longClick
import androidx.test.espresso.action.ViewActions.pressMenuKey
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.filters.MediumTest
import kotlinx.coroutines.delay
import kotlinx.coroutines.test.runTest
import net.developermaster.kotlincanivetesuico.MainActivity
import net.developermaster.kotlincanivetesuico.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

//todo testes instrumentados junit4
@RunWith(AndroidJUnit4::class)
class FragmentTestInstrumentadoTest {
    
    @get:Rule
//    @JvmField
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    //todo testes normais
    @MediumTest
    @Test
    fun verificar_login_preenchido_com_sucesso() = runTest {

        //todo utilizando perform
        onView(withId(R.id.textInput_nome_expresso)).perform(typeText("1"))//todo typeText digita no campo
        onView(withId(R.id.textInput_idade_expresso)).perform(typeText("2"))//todo typeText digita no campo"))
        onView(withId(R.id.textInput_idade_expresso)).perform( replaceText("3"))//todo replaceText substitui o texto
        onView(withId(R.id.textInput_nome_expresso)).perform(clearText())//todo clearText limpa o texto

        delay(3000)

        //todo utilizando actions
        onView(withId(R.id.btnAtualizar)).perform( doubleClick())//todo doubleClick clica duas vezes no botao
        onView(withId(R.id.btnAtualizar)).perform( longClick())//todo longClick clica e segura no botao
        onView(withId(R.id.btnSalvar)).perform( click())//todo click clica no botao
        onView(withId(R.id.textInput_nome_expresso)).perform( pressMenuKey())//todo pressMenuKey clica no menu

        delay(3000)
    }

    //todo testes inteiros
    @LargeTest
    @Test
    fun verificar_login_preenchido_com_sucesso2() = runTest {

        //todo utilizando view with id
        onView(withId(R.id.textInput_nome_expresso)).perform(typeText("1"))//todo withId localiza por id
        onView(withText("1")).perform(replaceText("2"))//todo withText localiza por texto
        onView(withHint("idade")).perform(typeText("3"))//todo withHint localiza por hint

        delay(5000)


    }

    //todo testes inteiros
    @MediumTest
    @Test
    fun verificar_login_preenchido_com_sucesso3()  = runTest {

        onView(withId(R.id.btnAtualizar)).perform( click()).check(matches(isDisplayed()))//todo check verifica se o botao esta visivel
        //.check( matches( not(isDisplayed() ) ) )
        //.check( matches( isDisplayed() ) )
        //.check( matches( isCompletelyDisplayed() ) )
        //.check( matches( isEnabled() ) )
        //.check( matches( isClickable() ) )
        //.check( matches( withEffectiveVisibility( ViewMatchers.Visibility.INVISIBLE ) ) )


    }
}