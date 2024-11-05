package net.developermaster.kotlincanivetesuico.ui.compose.scaffold.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposeImagem
import net.developermaster.kotlincanivetesuico.ui.compose.scaffold.model.ModelComposePostagem
import net.developermaster.kotlincanivetesuico.ui.compose.View.Scaffold.ui.theme.KotlinCaniveteSuicoTheme

class Scaffold : ComponentActivity() {

    private val listaUsuariosPerfil = listOf(
        ModelComposeImagem(R.drawable.perfil_01, "João"),
        ModelComposeImagem(R.drawable.perfil_02, "Ana"),
        ModelComposeImagem(R.drawable.perfil_03, "Maria"),
        ModelComposeImagem(R.drawable.perfil_01, "Pedro"),
        ModelComposeImagem(R.drawable.perfil_02, "Maria"),
        ModelComposeImagem(R.drawable.perfil_03, "João"),
        ModelComposeImagem(R.drawable.perfil_01, "Ada"),
        ModelComposeImagem(R.drawable.perfil_01, "João"),
        ModelComposeImagem(R.drawable.perfil_02, "Ana"),
        ModelComposeImagem(R.drawable.perfil_03, "Maria"),
        ModelComposeImagem(R.drawable.perfil_01, "Pedro"),
        ModelComposeImagem(R.drawable.perfil_02, "Maria"),
        ModelComposeImagem(R.drawable.perfil_03, "João"),
        ModelComposeImagem(R.drawable.perfil_01, "Ada"),
        ModelComposeImagem(R.drawable.perfil_01, "João"),
        ModelComposeImagem(R.drawable.perfil_02, "Ana"),
        ModelComposeImagem(R.drawable.perfil_03, "Maria"),
        ModelComposeImagem(R.drawable.perfil_01, "Pedro"),
        ModelComposeImagem(R.drawable.perfil_02, "Maria"),
        ModelComposeImagem(R.drawable.perfil_03, "João"),
        ModelComposeImagem(R.drawable.perfil_01, "Ada"),
        ModelComposeImagem(R.drawable.perfil_02, "Clal")
    )

    private val listaUsuariosPostagem = listOf(
        ModelComposePostagem(R.drawable.perfil_01, "João" ,R.drawable.floresta, "Floresta Floresta Floresta Floresta Floresta Floresta Floresta Floresta Floresta Floresta Floresta Floresta Floresta Floresta Floresta Floresta  "),
        ModelComposePostagem(R.drawable.perfil_02, "Carlos" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_03, "Ana" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_01, "João" ,R.drawable.floresta, "Floresta"),
        ModelComposePostagem(R.drawable.perfil_02, "Carlos" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_03, "Ana" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_01, "João" ,R.drawable.floresta, "Floresta"),
        ModelComposePostagem(R.drawable.perfil_02, "Carlos" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_03, "Ana" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_01, "João" ,R.drawable.floresta, "Floresta"),
        ModelComposePostagem(R.drawable.perfil_02, "Carlos" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_03, "Ana" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_01, "João" ,R.drawable.floresta, "Floresta"),
        ModelComposePostagem(R.drawable.perfil_02, "Carlos" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_03, "Ana" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_01, "João" ,R.drawable.floresta, "Floresta"),
        ModelComposePostagem(R.drawable.perfil_02, "Carlos" ,R.drawable.praia, "Praia"),
        ModelComposePostagem(R.drawable.perfil_03, "Ana" ,R.drawable.praia, "Praia"),
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            KotlinCaniveteSuicoTheme {

                Esqueleto()//todo chamando a funcao Esqueleto

            }//todo fim do tema
        }//todo fim do setContent
    }//todo fim do onCreate

    @Composable
    fun Home( modifier: Modifier) {

        Column(
            modifier = modifier //todo modificador
                .fillMaxWidth()//todo largura

        ) {

            LazyRowUsuariosPerfil(listaUsuariosPerfil)//todo chamando a funcao itensDoCardView

            LazyColumnUsuariosPostagem(listaUsuariosPostagem)//todo chamando a funcao itensDoCardView
        }
    }

    @Composable
    fun Esqueleto() {

        Scaffold(
            topBar = {

                TopBar()
            },

            bottomBar = {

                BottomBar()
            },

            floatingActionButton = {

                Fab()
            },

            snackbarHost = {

                SnackBar()
            },

            containerColor = Color.Black,//todo cor preta do container do scaffold

        ) { pappdingInterno ->

            Home( Modifier.padding (pappdingInterno))//todo chamando a funcao Home com o padding interno
        }
    }

    @Composable
    private fun itensDoCardView(modelComposeImagem: ModelComposeImagem) {

        Card(
            modifier = Modifier
                .background(Color.Green)
                .padding(all = 8.dp), //todo padding all

            onClick = {
                MensagemToast("${modelComposeImagem.nome} Clicado")
            },

            colors = CardDefaults.cardColors(
                containerColor = Color.White,
//                contentColor = Color.White
            ),

            elevation = CardDefaults.cardElevation(16.dp),
            shape = CircleShape,


            ) {

            Column {

                Icon(
                    modifier = Modifier
                        .clickable {
                            MensagemToast("${modelComposeImagem.nome} Clicado")
                        }
                        .size(60.dp) //todo tamanho da imagem
                        .clip(CircleShape)
                        .border(1.dp, Color.Black, CircleShape)
                        .background(Color.White),


                    painter = painterResource(id = modelComposeImagem.imagemPerfil),
                    contentDescription = null, //todo conteudo da imagem
//                    tint = Color.Black
                )

                Text(
                    modifier = Modifier
                        .background(Color.White)
                        .padding(top = 1.dp, start = 25.dp),

                    text = modelComposeImagem.nome, fontSize = 12.sp,//todo tamanho da fonte
                    fontFamily = FontFamily.SansSerif,//todo tipo de fonte
                    color = Color.Black//todo cor preta


                )
            }
        }
    }

    @Composable
    private fun LazyRowUsuariosPerfil(modelComposeImagem: List<ModelComposeImagem>, modifier: Modifier = Modifier ) {

        LazyRow(
            modifier = Modifier
                .border(1.dp, Color.Black, RectangleShape)
                .background(Color.White)
                .padding(all = 8.dp), //todo padding all

        ) {

            items(modelComposeImagem) { classeDeDadosComposeImagem ->

                ItemUsuariosPerfil(classeDeDadosComposeImagem)//todo chamando a funcao itensDoCardView
            }
        }
    }

    @Composable
    private fun ItemUsuariosPerfil(modelComposeImagem: ModelComposeImagem) {

        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(all = 8.dp), //todo padding all

        ) {

            Column {

                Image(
                    modifier = Modifier
                        .clickable {
                            MensagemToast("${modelComposeImagem.nome} Clicado")
                        }
                        .size(60.dp) //todo tamanho da imagem
                        .clip(CircleShape)
                        .border(1.dp, Color.Black, CircleShape)
                        .background(Color.White),


                    painter = painterResource(id = modelComposeImagem.imagemPerfil),
                    contentDescription = null, //todo conteudo da imagem
                    contentScale = ContentScale.Crop //todo escala da imagem para o conteudo

                )

                Text(modifier = Modifier
                    .clickable {
                        MensagemToast("${modelComposeImagem.nome} Clicado")
                    }
                    .background(Color.White)
                    .padding(start = 14.dp),

                    text = modelComposeImagem.nome, fontSize = 12.sp,//todo tamanho da fonte
                    fontFamily = FontFamily.SansSerif,//todo tipo de fonte
                    color = Color.Black//todo cor preta
                )
            }
        }
    }

    @Composable
    private fun LazyColumnUsuariosPostagem(modelComposePostagem: List<ModelComposePostagem>, modifier: Modifier = Modifier ) {

        LazyColumn(
            modifier = Modifier
                .border(1.dp, Color.Black)
                .background(Color.White)
                .padding(all = 8.dp), //todo padding all

        ) {

            items(modelComposePostagem) { classeDeDadosComposePostagem ->

                ItemUsuariosPostagem(classeDeDadosComposePostagem)//todo chamando a funcao itensDoCardView
            }
        }
    }

    @Composable
    private fun ItemUsuariosPostagem(modelComposePostagem: ModelComposePostagem) {

        Column(
            modifier = Modifier
                .border(1.dp, Color.Black)
                .padding(all = 8.dp), //todo padding all*/

        ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(all = 8.dp), //todo padding all

                ) {

                    //INFORMACAO PERFIL
                    Image(
                        modifier = Modifier
                            .clickable {
                                MensagemToast("${modelComposePostagem.nome} Clicado")
                            }
                            .size(60.dp) //todo tamanho da imagem
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape)
                            .background(Color.White),


                        painter = painterResource(id = modelComposePostagem.imagemPerfil),
                        contentDescription = null, //todo conteudo da imagem
                        contentScale = ContentScale.Crop
                    )

                    Text(modifier = Modifier
                        .clickable {
                            MensagemToast("${modelComposePostagem.nome} Clicado")
                        }
                        .background(Color.White)
                        .padding(start = 8.dp , top = 16.dp),

                        text = modelComposePostagem.nome, fontSize = 12.sp,//todo tamanho da fonte
                        fontFamily = FontFamily.SansSerif,//todo tipo de fonte
                        color = Color.Black//todo cor preta
                    )
                }

                Espaco()



            //INFORMACAO POSTAGEM
            Image(
                modifier = Modifier
                    .clickable {
                        MensagemToast("${modelComposePostagem.nome} Clicado")
                    }
                    .height(300.dp)
                    .background(Color.White),


                painter = painterResource(id = modelComposePostagem.fotoPostagem),
                contentDescription = null, //todo conteudo da imagem
                contentScale = ContentScale.Crop
            )

            Text(modifier = Modifier
                .clickable {
                    MensagemToast("${modelComposePostagem.nome} Clicado")
                }
                .background(Color.White)
                .padding(start = 8.dp , top = 16.dp),

                text = modelComposePostagem.descricao, fontSize = 30.sp,//todo tamanho da fonte
                fontFamily = FontFamily.SansSerif,//todo tipo de fonte
                color = Color.Black//todo cor preta
            )
        }
    }

    fun MensagemToast(messagem: String) {
        Toast.makeText(this, messagem, Toast.LENGTH_SHORT).show()
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TopBar(
        modifier: Modifier = Modifier.padding(start = 10.dp, end = 10.dp)

    ) {

        TopAppBar(

            title = {

                Text(
                    modifier = Modifier.padding(start = 40.dp),//todo espaçamento
                    text = "Scaffold ",//todo texto
                    color = Color.Red,//todo cor vermelha
                    fontSize = 16.sp,//todo tamanho da fonte
                    fontFamily = FontFamily.SansSerif,//todo tipo de fonte
                )

                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null,
                    tint = Color.Red,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .clickable {

                            Toast
                                .makeText(this@Scaffold, "Home Clicado", Toast.LENGTH_SHORT)
                                .show()

                        },//todo clique
                )

                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = Color.Red,
                    modifier = Modifier
                        .padding(start = 250.dp)
                        .clickable {

                            Toast
                                .makeText(this@Scaffold, "Search Clicado", Toast.LENGTH_SHORT)
                                .show()

                        },//todo clique
                )

                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = null,
                    tint = Color.Red,
                    modifier = Modifier
                        .padding(start = 300.dp)
                        .clickable {

                            Toast
                                .makeText(this@Scaffold, "Menu Clicado", Toast.LENGTH_SHORT)
                                .show()

                        },//todo clique
                )
            },

            colors = TopAppBarDefaults.topAppBarColors(

                containerColor = Color.Gray,
            )

        )
    }

    @Composable
    fun BottomBar() {

        BottomAppBar(
            containerColor = Color.Gray,

            ) {

            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null,
                tint = Color.Red,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .clickable {

                        Toast
                            .makeText(this@Scaffold, "Home Clicado", Toast.LENGTH_SHORT)
                            .show()

                    },//todo clique
            )
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = null,
                tint = Color.Red,
                modifier = Modifier
                    .padding(start = 130.dp)
                    .clickable {

                        Toast
                            .makeText(this@Scaffold, "Favorite Clicado", Toast.LENGTH_SHORT)
                            .show()

                    },//todo clique
            )
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = null,
                tint = Color.Red,
                modifier = Modifier
                    .padding(start = 130.dp)
                    .clickable {

                        Toast
                            .makeText(this@Scaffold, "AddCircle Clicado", Toast.LENGTH_SHORT)
                            .show()

                    },//todo clique


            )
        }
    }

    @Composable
    fun Fab() {

        FloatingActionButton(onClick = {
            Toast.makeText(
                this@Scaffold, "Fab Clicado", Toast.LENGTH_SHORT
            ).show()
        }) {

            Icon(
                imageVector = Icons.Filled.Add, contentDescription = "Localized description"
            )
        }
    }

    @Composable
    fun SnackBar() {

        Text(
            text = "SnackbarHost",//todo texto
            color = Color.Red,//todo cor vermelha
            fontSize = 30.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
        )
    }

    @Composable
    private fun Espaco() {

        Spacer(//todo espaçamento
            modifier = Modifier.height(16.dp)
        )//todo espaçamento de 16 dp
    }


    /*

        @Preview(showBackground = true)
        @Composable
        fun GreetingPreview() {
            KotlinCaniveteSuicoTheme {
    //            Home()
            }
        }
    */

}//todo fim da classe ComponentActivity


