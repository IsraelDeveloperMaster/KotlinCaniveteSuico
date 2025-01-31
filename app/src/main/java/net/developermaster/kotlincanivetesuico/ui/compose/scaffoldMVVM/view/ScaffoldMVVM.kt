package net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import dagger.hilt.android.AndroidEntryPoint
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.di.User
import net.developermaster.kotlincanivetesuico.ui.compose.scaffoldMVVM.viewmodel.ViewModelComposeMvvm
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.model.ModelComposeImagemMVVM
import net.developermaster.kotlincanivetesuico.ui.compose.View.ScaffoldMVVM.data.model.ModelComposePostagemMVVM

@AndroidEntryPoint
class ScaffoldMVVM : ComponentActivity(){

    private val listaUsuariosPerfil = listOf(
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria"),
        ModelComposeImagemMVVM(R.drawable.perfil_01, "João"),
        ModelComposeImagemMVVM(R.drawable.perfil_02, "Ana"),
        ModelComposeImagemMVVM(R.drawable.perfil_03, "Maria")
    )

    private val listaUsuariosPostagem = listOf(
        ModelComposePostagemMVVM( R.drawable.perfil_01, "João" , R.drawable.floresta, "Floresta Floresta Floresta Floresta Floresta Floresta"),
        ModelComposePostagemMVVM(R.drawable.perfil_02, "Carlos" , R.drawable.praia, "Praia"),
        ModelComposePostagemMVVM(R.drawable.perfil_03, "Ana" , R.drawable.praia, "Praia"),
        ModelComposePostagemMVVM( R.drawable.perfil_01, "João" , R.drawable.floresta, "Floresta Floresta Floresta Floresta Floresta Floresta"),
        ModelComposePostagemMVVM(R.drawable.perfil_02, "Carlos" , R.drawable.praia, "Praia"),
        ModelComposePostagemMVVM(R.drawable.perfil_03, "Ana" , R.drawable.praia, "Praia"),
        ModelComposePostagemMVVM( R.drawable.perfil_01, "João" , R.drawable.floresta, "Floresta Floresta Floresta Floresta Floresta Floresta"),
        ModelComposePostagemMVVM(R.drawable.perfil_02, "Carlos" , R.drawable.praia, "Praia"),
        ModelComposePostagemMVVM(R.drawable.perfil_03, "Ana" , R.drawable.praia, "Praia"),
        ModelComposePostagemMVVM( R.drawable.perfil_01, "João" , R.drawable.floresta, "Floresta Floresta Floresta Floresta Floresta Floresta"),
        ModelComposePostagemMVVM(R.drawable.perfil_02, "Carlos" , R.drawable.praia, "Praia"),
        ModelComposePostagemMVVM(R.drawable.perfil_03, "Ana" , R.drawable.praia, "Praia"),
        ModelComposePostagemMVVM( R.drawable.perfil_01, "João" , R.drawable.floresta, "Floresta Floresta Floresta Floresta Floresta Floresta"),
        ModelComposePostagemMVVM(R.drawable.perfil_02, "Carlos" , R.drawable.praia, "Praia"),
        ModelComposePostagemMVVM(R.drawable.perfil_03, "Ana" , R.drawable.praia, "Praia")
    )

    private val viewModelComposeMvvm : ViewModelComposeMvvm by viewModels()

    override fun onStart() {
        super.onStart()
        viewModelComposeMvvm.recuperarUsuarios()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            net.developermaster.kotlincanivetesuico.ui.compose.View.Scaffold.ui.theme.KotlinCaniveteSuicoTheme {

                Esqueleto()//todo chamando a funcao Esqueleto

            }//todo fim do tema
        }//todo fim do setContent
    }//todo fim do onCreate

    @Composable
    fun Home( modifier: Modifier) {

        //todo recuperando o viewmodel
//        val listaUsuariosPerfil = viewModel(modelClass = ViewModelComposeMvvm::class.java)

        //todo observando a lista de usuarios do viewmodel
//        listaUsuariosPerfil.listaUsuariosPublicos.observeAsState()

        //todo chamando a funcao recuperarUsuarios
//        listaUsuariosPerfil.recuperarUsuarios()

        //todo recuperando a lista de usuarios do viewmodel
        val listaUsuariosRecuperadosViewModel by viewModelComposeMvvm.listaUsuariosPublicos.observeAsState( initial = emptyList()  )

        Column(
            modifier = modifier //todo modificador
                .fillMaxWidth()//todo largura

        ) {

            LazyRowUsuariosPerfil(listaUsuariosRecuperadosViewModel)//todo chamando a funcao itensDoCardView

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
    private fun LazyRowUsuariosPerfil(user: List<User>, modifier: Modifier = Modifier ) {

        LazyRow(
            modifier = Modifier
//                .border(1.dp, Color.Black, RectangleShape)
                .background(Color.White)
                .padding(all = 8.dp), //todo padding all

        ) {

            items(user) { user ->

                ItemUsuariosPerfil(user)//todo chamando a funcao itensDoCardView
            }
        }
    }

    @Composable
    private fun ItemUsuariosPerfil(user: User) {

        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(all = 8.dp), //todo padding all

        ) {

            Column {

                //todo bibliotecas coil para carregar imagem
                AsyncImage(
                    model = user.image,

                    modifier = Modifier
                        .clickable {
                            MensagemToast("${user.firstName} Clicado")
                        }
                        .size(60.dp) //todo tamanho da imagem
                        .clip(CircleShape)
                        .border(1.dp, Color.Black, CircleShape)
                        .background(Color.White),


                    contentDescription = null, //todo conteudo da imagem
                    contentScale = ContentScale.Crop //todo escala da imagem para o conteudo

                )

                Text(modifier = Modifier
                    .clickable {
                        MensagemToast("${user.firstName} Clicado")
                    }
                    .background(Color.White)
                    .padding(start = 14.dp),

                    text = user.firstName, fontSize = 12.sp,//todo tamanho da fonte
                    fontFamily = FontFamily.SansSerif,//todo tipo de fonte
                    color = Color.Black//todo cor preta
                )
            }
        }
    }

    @Composable
    private fun LazyColumnUsuariosPostagem(modelComposePostagemMVVM: List<ModelComposePostagemMVVM>, modifier: Modifier = Modifier ) {

        LazyColumn(
            modifier = Modifier
                .border(1.dp, Color.Black)
                .background(Color.White)
                .padding(all = 8.dp), //todo padding all

        ) {

            items(modelComposePostagemMVVM) { modelComposePostagemMVVM ->

                ItemUsuariosPostagem(modelComposePostagemMVVM)//todo chamando a funcao itensDoCardView
            }
        }
    }

    @Composable
    private fun ItemUsuariosPostagem(modelComposePostagemMVVM: ModelComposePostagemMVVM) {

        Column(
            modifier = Modifier
                .border(1.dp, Color.Red)
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
                            MensagemToast("${modelComposePostagemMVVM.nome} Clicado")
                        }
                        .size(60.dp) //todo tamanho da imagem
                        .clip(CircleShape)
                        .border(1.dp, Color.Black, CircleShape)
                        .background(Color.White),


                    painter = painterResource(id = modelComposePostagemMVVM.imagemPerfil),
                    contentDescription = null, //todo conteudo da imagem
                    contentScale = ContentScale.Crop
                )

                Text(modifier = Modifier
                    .clickable {
                        MensagemToast("${modelComposePostagemMVVM.nome} Clicado")
                    }
                    .background(Color.White)
                    .padding(start = 8.dp , top = 16.dp),

                    text = modelComposePostagemMVVM.nome, fontSize = 12.sp,//todo tamanho da fonte
                    fontFamily = FontFamily.SansSerif,//todo tipo de fonte
                    color = Color.Black//todo cor preta
                )
            }

            Espaco()

            //INFORMACAO POSTAGEM
            Image(
                modifier = Modifier
                    .clickable {
                        MensagemToast("${modelComposePostagemMVVM.nome} Clicado")
                    }
                    .height(300.dp)
                    .background(Color.White),

                painter = painterResource(id = modelComposePostagemMVVM.fotoPostagem),
                contentDescription = null, //todo conteudo da imagem
                contentScale = ContentScale.Crop
            )

            Text(modifier = Modifier
                .clickable {
                    MensagemToast("${modelComposePostagemMVVM.nome} Clicado")
                }
                .background(Color.White)
                .padding(start = 8.dp , top = 16.dp),

                text = modelComposePostagemMVVM.descricao, fontSize = 30.sp,//todo tamanho da fonte
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
                    text = "Scaffold com MVVM",//todo texto
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
                                .makeText(this, "Home Clicado", Toast.LENGTH_SHORT)
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
                                .makeText(this, "Search Clicado", Toast.LENGTH_SHORT)
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
                                .makeText(this, "Menu Clicado", Toast.LENGTH_SHORT)
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
                            .makeText(baseContext, "Home Clicado", Toast.LENGTH_SHORT)
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
                            .makeText(baseContext, "Favorite Clicado", Toast.LENGTH_SHORT)
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
                            .makeText(baseContext, "AddCircle Clicado", Toast.LENGTH_SHORT)
                            .show()

                    },//todo clique


            )
        }
    }

    @Composable
    fun Fab() {

        FloatingActionButton(onClick = {
            Toast.makeText(
                this, "Fab Clicado", Toast.LENGTH_SHORT
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