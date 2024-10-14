package net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.runtime.LaunchedEffect
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
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.delay
import net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.theme.KotlinCaniveteSuicoTheme
import net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.viewModel.ViewModelFlowComposeFireBase
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.model.ListaFlowMvvm

class ComposeFlowFireBase : ComponentActivity() {

    //todo lista de frases randomizadas
    private val listaFlowMvvn = ListaFlowMvvm

    //todo referencia da imagem na internet com o firebase
    private var imagemRetornadaPelaInternetFireBase = ""

    //todo lista de resultados
    var listaResultadaDaInternetFireBase = ""

    //todo view model flow com firebase
    private val viewModelFlowComposeFireBase = ViewModelFlowComposeFireBase()

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

                Espaco()

                TextRowSimples()

                FlowImagens()

                Espaco()

                TextoFlowFrases()

                Espaco()

                Espaco()

                Espaco()

                CaixaDeTextoOutLineTextField()

                BotaoSemIcone()
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

        //todo remember para atualizar a imagem
        var imagemRetornadaPelaInternetRemember by remember { mutableStateOf("") }

        LaunchedEffect(Unit) {

            while (true) {

                imagemRetornadaPelaInternetRemember = imagemRetornadaPelaInternetFireBase //todo imagem da internet remember

                delay(2000)

                Log.d("imagemFlowFireBase", imagemRetornadaPelaInternetRemember)

                funcaoListarImageDoFireBase()

                funcaoListarTodosFireBase()
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura
                .padding(start = 100.dp, top = 24.dp),

            ) {

            AsyncImage(

                model = imagemRetornadaPelaInternetRemember,

                modifier = Modifier

                    .clickable {

                        funcaoListarImageDoFireBase()

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
    fun TextoFlowFrases() {

        var frases by remember { mutableStateOf (listaFlowMvvn.funcaoRandom().texto) }

        LaunchedEffect(Unit) {

            while (true) {

                frases = listaFlowMvvn.funcaoRandom().texto

                delay(2000)
            }
        }

        Text(text = "Frases: $frases")
    }

    @Composable
    private fun CaixaDeTextoOutLineTextField() {

        //todo remember para atualizar a imagem
        var textoRetornadoPelaInternetRemember by remember { mutableStateOf("") }

        textoRetornadoPelaInternetRemember = listaResultadaDaInternetFireBase //todo texto da internet remember

        LaunchedEffect(Unit) {

            while (true) {

                textoRetornadoPelaInternetRemember = listaResultadaDaInternetFireBase

                delay(3000)
            }
        }

        OutlinedTextField( //todo caixa de texto com borda

            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(start = 16.dp, top = 50.dp),

            value = textoRetornadoPelaInternetRemember,//todo valor do texto

            onValueChange = { textoDigitado ->

                textoRetornadoPelaInternetRemember = textoDigitado//todo valor do texto digitado na variavel texto

                MensagemToast(textoRetornadoPelaInternetRemember)
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

                funcaoListarTodosFireBase()

                MensagemToast("Botão clicado")

            },//todo clique
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .padding(all = 24.dp)//todo padding all
        )

        {

            Text(text = "Função que chama os dados do firebase")
            funcaoListarImageDoFireBase()
            viewModelFlowComposeFireBase.example6()
        }
    }

    fun funcaoListarImageDoFireBase() {

        //todo referencia da imagem
        FirebaseStorage.getInstance().getReference("imagens").child("imagens.jpg").downloadUrl

            .addOnSuccessListener { fotoPerfilRetornada ->

                imagemRetornadaPelaInternetFireBase = fotoPerfilRetornada.toString()

                println("composeFireBase listar fotos sucesso -> $imagemRetornadaPelaInternetFireBase")

            }.addOnFailureListener { falha ->

                println("composeFireBase listar fotos erro -> $falha ")
            }
    }

    fun funcaoListarTodosFireBase() {

        val listaDeDadosRetornadas = FirebaseFirestore.getInstance() .collection("FireBaseSimples")//todo collection

        listaDeDadosRetornadas.addSnapshotListener { dadosRetornados, error ->

            val listaRetornada = dadosRetornados?.documents//todo document

            listaRetornada?.forEach { documents ->

                val dados = documents?.data //todo dados do documento retornado

                if (dados != null) {

//                    val id = documents.id
                    val nome = dados["nome"]
//                    val idade = dados["idade"]

                    listaResultadaDaInternetFireBase += ("Nome: ${nome} \n \n ")

                    println("composeFireBaseListaTodos -> $listaResultadaDaInternetFireBase ")
                }
            }
        }
    }


    @Composable
    fun MyScreen() {

        val myData by viewModelFlowComposeFireBase.myDataFlow.collectAsState(initial = "")

        Column {

            Text( text = "My Data: $myData")

            AsyncImage(

                model = myData,

                modifier = Modifier
                    .clickable {
//                                MensagemToast("${user.firstName} Clicado")
                    }
                    .size(50.dp) //todo tamanho da imagem
                    .clip(CircleShape)
                    .border(1.dp, Color.Black, CircleShape)
                    .background(Color.White),

                contentDescription = null, //todo conteudo da imagem
                contentScale = ContentScale.Crop //todo escala da imagem para o conteudo

            )

            Button(modifier = Modifier
                .fillMaxWidth()//todo largura
                .padding(all = 24.dp), //todo padding all

                onClick = { viewModelFlowComposeFireBase.updateData() }) {

            }

            Text(text = "Atualizar dados")
        }
    }

    fun MensagemToast(messagem: String) {
        Toast.makeText(this, messagem, Toast.LENGTH_SHORT).show()
    }

    @Composable
    private fun Espaco() {

        Spacer(//todo espaçamento
            modifier = Modifier.height(16.dp)
        )//todo espaçamento de 16 dp
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
