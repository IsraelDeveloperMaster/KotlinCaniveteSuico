package net.developermaster.kotlincanivetesuico.ui.home.view

import AdapterHome
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import net.developermaster.kotlincanivetesuico.MainActivity
import net.developermaster.kotlincanivetesuico.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

//todo testes instrumentados junit4
@RunWith(AndroidJUnit4::class)
class FragmentHomeTest  {

    @get:Rule
//    @JvmField
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    //todo testes pequenos
    @LargeTest
    @Test
    fun verificar_posicao()  = runBlocking  {

        onView(withId(R.id.searchView)).perform(typeText("PESQUISAR"))//todo typeText digita no campo

        delay(2000)//todo delay de 2 segundos

        onView(withId(R.id.recyclerviewHome)).check(matches(isDisplayed()))//todo check verifica se o botao esta visivel

        delay(2000)

        onView(withId(R.id.recyclerviewHome)).perform( actionOnItemAtPosition<AdapterHome.HomeViewHolder>(1, click()) )//todo click clica no item

        delay(2000)

        pressBack()//todo botao de voltar

        delay(3000)

    }
}