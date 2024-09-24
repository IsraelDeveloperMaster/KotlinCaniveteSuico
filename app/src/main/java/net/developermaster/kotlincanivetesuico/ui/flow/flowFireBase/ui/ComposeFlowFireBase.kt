package net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.theme.KotlinCaniveteSuicoTheme

class ComposeFlowFireBase : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {//todo inicio do onCreate
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            KotlinCaniveteSuicoTheme {

                Home()//todo chamando a funcao Hola

            }
        }

    }//todo fim do onCreate

    @Composable
    fun Home() {

        FlowImagens()


    }//todo fim da funcao Home

    @Composable
    fun FlowImagens() {
        Column() {


        }
    }


    /*    @Preview(showBackground = true)

        @Composable
        fun GreetingPreview() {
            KotlinCaniveteSuicoTheme {

            }
                Home()
            }
    */
}//todo fim da classe ComponentActivity
