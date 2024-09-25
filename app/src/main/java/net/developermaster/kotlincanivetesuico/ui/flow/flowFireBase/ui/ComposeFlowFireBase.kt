package net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.repository.RepositorioFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.fireBase.fireBaseMVVM.viewModel.ViewModelFireBaseMVVM
import net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.theme.KotlinCaniveteSuicoTheme
import net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.viewModel.ViewModelFlowComposeFireBase

class ComposeFlowFireBase : ComponentActivity() {

    private var imagemRetornadaPelaInternet = ""

    private val viewModelFlowComposeFireBase = ViewModelFlowComposeFireBase()

    //todo viewmodel
    private lateinit var viewModelFireBaseMVVM: ViewModelFireBaseMVVM

    //todo repositorio
    private lateinit var repositorioFireBaseMVVM: RepositorioFireBaseMVVM

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

        LazyColumn(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura

        ) {

            item {

                TextRowSimples()
                FlowImagens()
                CaixaDeTextoOutLineTextField()
                BotaoSemIcone()
                MyScreen()

            }
        }

    }//todo fim da funcao Home

    @Composable
    fun TextRowSimples() {

        Text(
            modifier = Modifier
                .background(Color.White)
                .padding(start = 8.dp, top = 24.dp),

            text = "Altere os dados do firebase na internet",//todo texto
            color = Color.Black,//todo cor vermelha
            fontSize = 24.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
        )
    }

    @Composable
    fun FlowImagens() {

        Row(
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura
                .padding(start = 100.dp , top = 24.dp),

        ) {

            AsyncImage(

                model = imagemRetornadaPelaInternet,

                modifier = Modifier
                    .clickable {
//                                MensagemToast("${user.firstName} Clicado")
                    }
                    .size(200.dp) //todo tamanho da imagem
                    .clip(CircleShape)
                    .border(1.dp, Color.Black, CircleShape)
                    .background(Color.White),


                contentDescription = null, //todo conteudo da imagem
                contentScale = ContentScale.Crop //todo escala da imagem para o conteudo
            )
        }
    }

    @Composable
    private fun CaixaDeTextoOutLineTextField() {

        var texto by remember { mutableStateOf("") }

        OutlinedTextField( //todo caixa de texto com borda

            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(start = 16.dp, top = 50.dp),

            value = texto,//todo valor do texto

            onValueChange = { textoDigitado ->

                texto = textoDigitado//todo valor do texto digitado na variavel texto

                MensagemToast(texto)
            },

            label = {

                Text(text = "Caixa de texto") //todo texto do label
            },

            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.ThumbUp,//todo icone
                    contentDescription = null, modifier = Modifier.width(50.dp),//todo largura
                    tint = Color.Blue//todo cor azul da borda
                )
            },

            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Favorite,//todo icone
                    contentDescription = null, modifier = Modifier.width(50.dp),//todo largura
                    tint = Color.Red//todo cor azul da borda
                )
            })
    }

    @Composable
    fun BotaoSemIcone() {

        Button(//todo botao com clique
            onClick = {

                MensagemToast("Botão clicado")

            },//todo clique
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .padding(all = 24.dp)//todo padding all
        )

        {

            Text(text = "Função que chama os dados do firebase")
            funcaoListarImageDoFireBase2(imagemRetornadaPelaInternet)
        }
    }

    @Composable
    fun funcaoListarImageDoFireBase2(caminhoDaImagem: String): Flow<String> = flow {

            //todo referencia da imagem
            FirebaseStorage.getInstance() .getReference("imagens") .child("imagens.jpg") .downloadUrl

                .addOnSuccessListener { fotoPerfilRetornada ->

                    imagemRetornadaPelaInternet = fotoPerfilRetornada.toString()


                    println("composeFireBaseMVVM listar fotos no firebase -> $imagemRetornadaPelaInternet")

                }
                .addOnFailureListener { falha ->

                    println("composeFireBaseMVVM listar fotos erro -> $falha ")
                }

    }

    @Composable
    fun MyScreen() {

        val myData by viewModelFlowComposeFireBase.myDataFlow.collectAsState(initial = "")

        Column {
            Text(text = "My Data: $myData")

            Button(onClick = { viewModelFlowComposeFireBase.updateData() }) {
                Text(text = "Update Data")
            }
        }
    }

    fun MensagemToast(messagem: String) {
        Toast.makeText(this, messagem, Toast.LENGTH_SHORT).show()
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
