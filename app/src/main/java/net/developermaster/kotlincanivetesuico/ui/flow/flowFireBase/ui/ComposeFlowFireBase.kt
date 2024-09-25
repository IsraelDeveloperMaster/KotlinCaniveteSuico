package net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui

import android.annotation.SuppressLint
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
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import coil.compose.AsyncImage
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.theme.KotlinCaniveteSuicoTheme
import net.developermaster.kotlincanivetesuico.ui.flow.flowFireBase.ui.viewModel.ViewModelFlowComposeFireBase
import net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.view.FlowEstado

class ComposeFlowFireBase : ComponentActivity() {

    private var imagemRetornadaPelaInternet = ""

    private var variavelFrase = ""

    private val viewModelFlowComposeFireBase = ViewModelFlowComposeFireBase()

    var imagemFlow: Flow<String> = flow {

        while (true) {

            emit(variavelFrase)

            delay(2000)

            Log.d("imagemFlow1", variavelFrase)

        }
    }

    fun funcaoImagemFlow() {

        var imagemFlow: Flow<String> = flow {

            while (true) {

                emit(imagemRetornadaPelaInternet)

                delay(2000)

                Log.d("imagemFlow2", imagemRetornadaPelaInternet)

            }
        }

    }

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

                FuncaoFlowToastRepet()

//                FuncaoTextoFlow()

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
            fontSize = 18.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
        )
    }

    @Composable
    fun FlowImagens() {

        Row(
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura
                .padding(start = 100.dp, top = 24.dp),

            ) {

            AsyncImage(

                model = imagemRetornadaPelaInternet,

                modifier = Modifier
                    .clickable {

                        funcaoImagemFlow()

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
            FuncaoListarImageDoFireBase()
            viewModelFlowComposeFireBase.example6()
        }
    }

    @Composable
    fun FuncaoListarImageDoFireBase() {

        //todo referencia da imagem
        FirebaseStorage.getInstance().getReference("imagens").child("imagens.jpg").downloadUrl

            .addOnSuccessListener { fotoPerfilRetornada ->

                imagemRetornadaPelaInternet = fotoPerfilRetornada.toString()

                println("composeFireBaseMVVM listar fotos no firebase -> $imagemRetornadaPelaInternet")

            }.addOnFailureListener { falha ->

                println("composeFireBaseMVVM listar fotos erro -> $falha ")
            }
    }

    @SuppressLint("CoroutineCreationDuringComposition")
    @Composable
    fun FuncaoFlowToastRepet(){

            lifecycleScope.launch {

                repeatOnLifecycle(Lifecycle.State.STARTED) {

                    viewModelFlowComposeFireBase.estadoFlowPublico.collect { estado ->

                        when (estado) {

                                    is FlowEstado.Error -> {

//                                    binding.textView.text = estado.mensagemError

                                MensagemToast(getString(R.string.MENSAGEM_FLOW_ERRO) + " \n " + estado.mensagemError)
                            }

                            FlowEstado.Loading -> {

//                                    binding.progressBar
                            }

                            is FlowEstado.Sucesso1 -> {

//                                    binding.textView.text = estado.clientes

                                variavelFrase = estado.clientes.toString()

//                                MensagemToast(getString(R.string.MENSAGEM_FLOW_SUCESSO) + " \n " + estado.clientes.toString() )
                            }

                            is FlowEstado.Sucesso2 ->

//                                    binding.textView.text = estado.clientes

                            MensagemToast(estado.clientes)

                        }
                    }
                }
            }

                viewModelFlowComposeFireBase.example6()

        FuncaoTextoFlow()
    }

    @Composable
    fun FuncaoTextoFlow(){

            Text(
                modifier = Modifier
                    .background(Color.White)//todo cor branca
                    .padding(start = 8.dp, top = 24.dp),//todo padding

                text = variavelFrase,//todo texto
                color = Color.Red,//todo cor vermelha
                fontSize = 16.sp,//todo tamanho da fonte
                fontFamily = FontFamily.SansSerif,//todo tipo de fonte
            )
    }

    @Composable
    fun FuncaoListarImageDoFireBase2(caminhoDaImagem: String): Flow<String> = flow {

        //todo referencia da imagem
        FirebaseStorage.getInstance().getReference("imagens").child("imagens.jpg").downloadUrl

            .addOnSuccessListener { fotoPerfilRetornada ->

                imagemRetornadaPelaInternet = fotoPerfilRetornada.toString()


                println("composeFireBaseMVVM listar fotos no firebase -> $imagemRetornadaPelaInternet")

            }.addOnFailureListener { falha ->

                println("composeFireBaseMVVM listar fotos erro -> $falha ")
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

    /*    @Preview(showBackground = true)

        @Composable
        fun GreetingPreview() {
            KotlinCaniveteSuicoTheme {

            }
                Home()
            }
    */
}//todo fim da classe ComponentActivity
