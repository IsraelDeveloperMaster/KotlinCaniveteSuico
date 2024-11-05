package net.developermaster.kotlincanivetesuico.ui.compose.View.Atributos

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.ui.compose.model.ModelComposeGeral
import net.developermaster.kotlincanivetesuico.ui.compose.View.Atributos.ui.theme.KotlinCaniveteSuicoTheme

class ComposeAtributos : ComponentActivity() { //todo inicio da classe ComponentActivity

    private val listaUsuarios = listOf(
        ModelComposeGeral("João"),
        ModelComposeGeral("Ana"),
        ModelComposeGeral("Maria"),
        ModelComposeGeral("Pedro"),
        ModelComposeGeral("Maria"),
        ModelComposeGeral("João"),
        ModelComposeGeral("Ana"),
        ModelComposeGeral("Pedro")
    )

    private val listaLinguagensDeProgramacao = listOf(

        "Kotlin", "Java", "Python", "JavaScript", "C++", "Swift"

    )

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

        LazyColumnPrincipal()

    }//todo fim da funcao Home

    @Composable
    private fun LazyColumnPrincipal() {

        LazyColumn(
//            verticalArrangement = Arrangement.SpaceEvenly,
//            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier//todo modificador
//                .height(1000.dp)//todo altura
//                .width(2000.dp)//todo largura
                .fillMaxHeight()//todo altura
                .fillMaxWidth()//todo largura
//                .border( 10.dp, Color.Red, RoundedCornerShape(10))//todo borda com raio de 10 e cor vermelha
                .padding(all = 8.dp)//todo padding 4 lados
//                .padding(top = 250.dp),//todo padding top
//                .padding(start = 10.dp),//todo padding no inicio
//                .padding(end = 10.dp),//todo padding no fim
//                .padding(bottom = 10.dp),//todo padding bottom
//                .padding(top = 120.dp , start = 10.dp , end = 10.dp , bottom = 10.dp),//todo padding 4 lados
//                .padding(10.dp , 10.dp , 10.dp , 10.dp),//todo padding 4 lados
//                .padding(10.dp , 10.dp , 10.dp),//todo padding 3 lados
//                .padding(10.dp , 10.dp),//todo padding 2 lados
//            horizontalAlignment = Alignment.CenterHorizontally ,//todo alinhamento horizontal
//            verticalArrangement = Arrangement.SpaceEvenly//todo alinhamento vertical
//                .background(Color.DarkGray)//todo fundo
                .background(Color.DarkGray, RoundedCornerShape(20.dp)),//todo fundo azul arredondado
        )

        {

            items(10) {

                CardViews()

                Espaco()
                Espaco()

                RadioOption()

                Espaco()

                SwitchOnOff()

                CheckBox()

                Espaco()

                ExtendedFab()

                Espaco()

                Fab()

                Espaco()
                Espaco()

                ColumnLista()

                BotaoSemIcone()

                BotaoComIcone()

                Espaco()

                LazyRowUsuarios()

                Espaco()

                LazyRowIcone()

                Espaco()

                ColumnContador()

                CaixaDeTextoTextFild()

                Espaco()

                CaixaDeTextoOutLineTextField()

                IconeComClique()

                Imagem()

                ColumnCustomizada()

                RowSimples()

                ColumnSimples()

                RowSimples()

                ColumnSimples()
            }
        }

    }//todo fim da funcao lazyColumnPrincipal

    @Composable
    private fun CardViews() {

        LazyRow {

            items(listaUsuarios) { listaUsuarios ->

                itensDoCardView(listaUsuarios)//todo chamando a funcao itensDoCardView
            }
        }
    }

    @Composable
    private fun itensDoCardView(modelCompose: ModelComposeGeral) {

        Card(
            modifier = Modifier
//                .width(100.dp)//todo largura
//                .height(100.dp)//todo altura
                .fillMaxWidth()//todo largura
                .fillMaxHeight() //todo altura
                .background(Color.Green)
                .padding(all = 16.dp) , //todo padding all

            onClick = {
                MensagemToast("${modelCompose.nome} Clicado")
            },
            colors = CardDefaults.cardColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),

            elevation = CardDefaults.cardElevation(16.dp) ,
            shape = RoundedCornerShape(20.dp),


            ) {

            Column {

                Icon(
                    modifier = Modifier
                        .width(100.dp)//todo largura
                        .height(100.dp),//todo altura

                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null, //todo conteudo da imagem
                    tint = Color.White //todo cor vermelha
                )

                Text(
                    modifier = Modifier
                        .padding(all = 25.dp),

                    text = modelCompose.nome,
                    fontSize = 20.sp,//todo tamanho da fonte
                    fontFamily = FontFamily.SansSerif,//todo tipo de fonte
                )
            }
        }
    }

    @Composable
    private fun RadioOption() {

        var itemSelecionado by remember { mutableStateOf(listaLinguagensDeProgramacao[0]) }

        listaLinguagensDeProgramacao.forEach { opcao ->

            Row(
                verticalAlignment = Alignment.CenterVertically
            )

            {
                RadioButton(

                    selected = opcao == itemSelecionado,

                    onClick = {

                        itemSelecionado = opcao

                        MensagemToast("Selecionando $opcao")
                    })

                Text(
                    text = opcao,
//                    textAlign = TextAlign.Center,
                    color = Color.Red,//todo cor vermelha
                    fontSize = 20.sp,//todo tamanho da fonte
                    fontFamily = FontFamily.SansSerif,//todo tipo de fonte
                )
            }
        }
    }

    @Composable
    private fun SwitchOnOff() {

        var verifica by remember { mutableStateOf(false) }

        Row(
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura
                .padding(start = 124.dp),
        )

        {

            Switch(modifier = Modifier
                .height(100.dp)
                .width(100.dp),

                checked = verifica,

                onCheckedChange = { estado ->

                    verifica = estado

                    if (estado) MensagemToast("Switch ligado ${estado} ")
                    else MensagemToast("Switch desligado ${estado}")
                })
        }
    }

    @Composable
    private fun CheckBox() {

        var checado by remember { mutableStateOf(false) }

        Row(
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura
                .padding(start = 124.dp),
        )

        {

            Checkbox(modifier = Modifier
                .height(100.dp)
                .width(100.dp),

                checked = checado,

                onCheckedChange = { estado ->

                    checado = estado

                    if (estado) MensagemToast("Checkbox marcado ${estado} ")
                    else MensagemToast("Checkbox desmarcado ${estado}")
                })
        }
    }

    @Composable
    private fun ExtendedFab() {

        Row(
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura
                .padding(start = 124.dp),
        ) {

            ExtendedFloatingActionButton(

                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp),
//                .padding(all = 8.dp),


                containerColor = Color.Green, contentColor = Color.Yellow,

                onClick = {
                    MensagemToast("Extended Fab clicado")
                })

            {

                Text(
                    text = "Extended Fab",
                    textAlign = TextAlign.Center,
                    color = Color.Red,//todo cor vermelha
                    fontSize = 12.sp,//todo tamanho da fonte
                    fontFamily = FontFamily.SansSerif,//todo tipo de fonte
                )

            }
        }

    }

    @Composable
    private fun Fab() {

        Row(
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura
                .padding(start = 124.dp),
        )

        {
            FloatingActionButton(modifier = Modifier
                .height(100.dp)
                .width(100.dp),


                containerColor = Color.Green, contentColor = Color.Yellow, shape = CircleShape,

                onClick = {
                    MensagemToast("Fab clicado")
                })

            {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null,
                    tint = Color.Blue
                )

            }

        }


    }

    @Composable
    private fun ColumnLista() {

        var texto by remember { mutableStateOf("") }

        var listaUsuariosDigitado by remember { mutableStateOf(listOf<ModelComposeGeral>()) }

        Column(
            modifier = Modifier
//                .background(Color.Blue)
                .fillMaxWidth()//todo largura
                .fillMaxHeight(),//todo altura
//                .padding(top = 16.dp) ,//todo padding top
//                .border(2.dp, Color.Yellow,  RoundedCornerShape(20))//todo borda amarela circular
            verticalArrangement = Arrangement.SpaceEvenly,//todo alinhamento vertical
            horizontalAlignment = Alignment.CenterHorizontally//todo alinhamento horizontal
        )

        {

            OutlinedTextField(
                //todo caixa de texto com borda

                modifier = Modifier
                    .fillMaxWidth()//todo largura
                    .fillMaxHeight()//todo altura
                    .background(Color.White, RectangleShape)
                    .border(4.dp, Color.Blue),

//                    .fillMaxWidth()
//                    .padding(start = 8.dp),

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
                        tint = Color.Blue//todo cor azul da borda
                    )
                },
            )

            Button(//todo botao com icone
                onClick = {
                    listaUsuariosDigitado = listaUsuariosDigitado + ModelComposeGeral(texto)

                    texto = ""

                    MensagemToast(texto)

                },//todo clique
                modifier = Modifier
                    .height(50.dp)//todo altura
                    .width(100.dp)// ()//todo largura
                    .padding(all = 8.dp)//todo padding all
            )

            {

                Icon(
                    modifier = Modifier
                        .height(100.dp)//todo altura
                        .width(100.dp),//todo largura

                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null,
                    tint = Color.Blue
                )
            }

            Espaco()
            Espaco()

            LazyRow {

                items(listaUsuariosDigitado) { listaUsuarios ->

                    Text(
                        text = listaUsuarios.nome,
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth()//todo largura
                            .fillMaxHeight()
                            .padding(all = 8.dp)
                    )
                }
            }

            Espaco()
            Espaco()

        }
    }

    @Composable
    private fun CaixaDeTextoOutLineTextField() {

        var texto by remember { mutableStateOf("") }

        OutlinedTextField( //todo caixa de texto com borda

            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(all = 8.dp),

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
                    tint = Color.Blue//todo cor azul da borda
                )
            })
    }

    @Composable
    private fun CaixaDeTextoTextFild() {

        var texto by remember { mutableStateOf("") }

        TextField(

            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(all = 8.dp),

            value = texto,//todo valor do texto

            onValueChange = { textoDigitado ->

                texto = textoDigitado//todo valor do texto digitado na variavel texto

                MensagemToast(texto)
            },

            placeholder = {

                Text(text = "Caixa de texto") //todo texto do label

            },

            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    contentDescription = null,
                    modifier = Modifier.width(50.dp),//todo largura
                    tint = Color.Blue
                )
            },

            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    modifier = Modifier.width(50.dp),//todo largura
                    tint = Color.Blue
                )
            })
    }

    @Composable
    private fun LazyRowUsuarios() {

        LazyRow(//todo lista de usuarios
            modifier = Modifier
                .width(1000.dp)//todo largura
                .height(100.dp)//todo altura
                .padding(all = 2.dp)//todo padding all
                .border(
                    4.dp, Color.Yellow, RoundedCornerShape(10)
                )//todo borda amarela circular
                .clip(RectangleShape),//todo borda circular

            horizontalArrangement = Arrangement.SpaceEvenly,//todo alinhamento horizontal
            verticalAlignment = Alignment.CenterVertically//todo alinhamento vertical

        )

        {

            //todo itens da lista de usuarios
            items(listaUsuarios) { listaUsuarios ->

                Row(
                    modifier = Modifier
//                                .background(Color.White , CircleShape )//todo fundo branco
                        .width(100.dp)//todo largura
                        .height(100.dp)//todo altura
                        .padding(all = 12.dp)//todo padding top
                        .border(3.dp, Color.Green, CircleShape)//todo borda verde circular
                        .clip(CircleShape),//todo borda circular
                    verticalAlignment = Alignment.CenterVertically,//todo alinhamento vertical
                    horizontalArrangement = Arrangement.SpaceEvenly//todo alinhamento horizontal
                )

                {

                    TextToast(listaUsuarios.nome)
                }

                VerticalDivider()
            }
        }
    }

    @Composable
    private fun LazyRowIcone() {

        LazyRow(//todo lista de icones
            modifier = Modifier
                .width(1000.dp)//todo largura
                .height(100.dp)//todo altura
                .padding(all = 2.dp)//todo padding all
                .border(
                    4.dp, Color.Yellow, RoundedCornerShape(10)
                )//todo borda amarela circular
                .clip(RectangleShape),//todo borda circular

            horizontalArrangement = Arrangement.SpaceEvenly,//todo alinhamento horizontal
            verticalAlignment = Alignment.CenterVertically//todo alinhamento vertical

        )

        {

            //todo itens da lista de icones
            items(listaUsuarios) { listaUsuarios ->

                Row(
                    modifier = Modifier
//                                .background(Color.White , CircleShape )//todo fundo branco
                        .width(100.dp)//todo largura
                        .height(100.dp)//todo altura
                        .padding(all = 12.dp)//todo padding top
                        .border(3.dp, Color.Green, CircleShape)//todo borda verde circular
                        .clip(CircleShape),//todo borda circular
                    verticalAlignment = Alignment.CenterVertically,//todo alinhamento vertical
                    horizontalArrangement = Arrangement.SpaceEvenly//todo alinhamento horizontal
                )

                {

                    IconeSemClique()
                }

                VerticalDivider()
            }
        }
    }

    @Composable
    private fun RowSimples() {
        Row(
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .padding(top = 16.dp)//todo padding top
                .background(Color.Blue)//todo fundo azul
                .border(2.dp, Color.Yellow, CircleShape)//todo borda amarela circular
                .clip(CircleShape),//todo borda circular
            verticalAlignment = Alignment.CenterVertically,//todo alinhamento vertical
            horizontalArrangement = Arrangement.SpaceEvenly//todo alinhamento horizontal
        )

        {

            TextRowSimples()

            TextRowSimples()

            TextRowSimples()
        }
    }

    @Composable
    private fun ColumnSimples() {

        Column(
            modifier = Modifier
                .fillMaxWidth()//todo largura
//                    .fillMaxHeight()//todo altura
                .padding(top = 16.dp)//todo padding top
                .border(2.dp, Color.Yellow, CircleShape)//todo borda amarela circular
                .clip(CircleShape),//todo borda circular
            verticalArrangement = Arrangement.SpaceEvenly,//todo alinhamento vertical
            horizontalAlignment = Alignment.CenterHorizontally//todo alinhamento horizontal
        ) {

            TextColumnSimples()
            TextColumnSimples()
            TextColumnSimples()

        }


    }

    @Composable
    private fun ColumnContador() {

        Column(

            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura
                .padding(all = 16.dp)//todo padding top

        ) {

            BotaoContador()
        }
    }

    @Composable
    private fun ColumnCustomizada() {

        Column(
            modifier = Modifier
                .fillMaxWidth()//todo largura
//                    .fillMaxHeight()//todo altura
                .padding(all = 16.dp)//todo padding all
                .border(2.dp, Color.Yellow, CircleShape)//todo borda amarela circular
                .clip(CircleShape),//todo borda circular
            verticalArrangement = Arrangement.SpaceEvenly,//todo alinhamento vertical
            horizontalAlignment = Alignment.CenterHorizontally//todo alinhamento horizontal
        )

        {

            TextColumnCustomizado()
            TextColumnCustomizado()
            TextColumnCustomizado()
        }
    }

    @Composable
    private fun Espaco() {

        Spacer(//todo espaçamento
            modifier = Modifier.height(16.dp)
        )//todo espaçamento de 16 dp
    }

    @Composable
    private fun BotaoSemIcone() {

        Button(//todo botao com clique
            onClick = {

                MensagemToast("Botão clicado")

            },//todo clique
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .padding(all = 8.dp)//todo padding all
        )

        {

            Text(text = "Botão")
        }
    }

    @Composable
    private fun BotaoContador() {

        var contador by remember { mutableStateOf(0) }

        Button(
//todo botao com clique
            modifier = Modifier

                .fillMaxWidth()//todo largura
                .padding(all = 8.dp),//todo padding all

            onClick = {

                MensagemToast("contador = ${contador}")

                contador++

            },//todo clique
        )

        {

            Text(
                text = "contador = ${contador}",//todo texto
                color = Color.Red,//todo cor vermelha
                fontSize = 30.sp,//todo tamanho da fonte
                fontFamily = FontFamily.SansSerif,//todo tipo de fonte
            )
        }
    }

    @Composable
    private fun BotaoComIcone() {

        Button(//todo botao com icone
            onClick = {

                MensagemToast("Botão com icone clicado")

            },//todo clique
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .padding(all = 8.dp)//todo padding all
        )

        {

            Row {
                if (true) {

                    IconeSimples1()

                } else {

                    IconeSimples2()

                }
            }
        }
    }

    @Composable
    private fun IconeSimples1() {

        Icon(
            imageVector = Icons.Default.ThumbUp,
            contentDescription = null,
            modifier = Modifier.width(50.dp),//todo largura
            tint = Color.Blue
        )

        Text(
            text = "Botão com icone"
        )
    }

    @Composable
    private fun IconeSimples2() {

        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = null,
            modifier = Modifier.width(50.dp),//todo largura
            tint = Color.Blue
        )

        Text(
            text = "Botão com icone"

        )
    }

    @Composable
    private fun IconeSemClique() {

        Icon(
            modifier = Modifier.width(200.dp),//todo largura

            imageVector = Icons.Default.Favorite, contentDescription = null, tint = Color.Red
        )

    }

    @Composable
    private fun IconeComClique() {

        Row(
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura
                .padding(start = 124.dp),
        ) {

            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = null,
                modifier = Modifier
                    .width(100.dp)//todo largura
                    .height(100.dp)//todo altura
                    .padding(top = 16.dp)//todo padding top
                    .border(2.dp, Color.Yellow, CircleShape)//todo borda amarela circular
                    .clip(CircleShape)//todo borda circular
                    .clickable {

                        MensagemToast("Icone clicado")

                    },//todo clique
            )
        }
    }

    @Composable
    private fun Imagem() {

        Row(
            modifier = Modifier
                .fillMaxWidth()//todo largura
                .fillMaxHeight()//todo altura
                .padding(start = 124.dp),
        ) {

            Image(
                painter = painterResource(id = R.drawable.ferramentas),//todo drawable
                contentDescription = null,

                modifier = Modifier
                    .width(100.dp)//todo largura
                    .height(100.dp)//todo altura
                    .padding(top = 16.dp)//todo padding top
                    .border(2.dp, Color.Yellow, CircleShape)//todo borda amarela circular
                    .clip(CircleShape)//todo borda circular
                    .clickable {

                        MensagemToast("Imagem clicada")

                    },//todo clique
                alpha = 0.5f,//todo opacidade
                contentScale = ContentScale.Crop,//todo escala da imagem para o tamanho do container
                alignment = Alignment.Center//todo alinhamento da imagem no centro)
            )
        }
    }

    @Composable
    private fun TextToast(nome: String) {

        val usuario = ModelComposeGeral(nome)

        Text(modifier = Modifier
            .background(
                Color.Magenta, CircleShape
            )//todo fundo branco
            .fillMaxWidth()
            .fillMaxHeight()
            .clickable {

                MensagemToast(usuario.nome)
            }

            .clip(CircleShape)
            .padding(all = 16.dp),//todo padding all

            color = Color.Black,//todo cor vermelha
            fontSize = 12.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
            textAlign = TextAlign.Justify,//todo alinhamento do texto

            text = usuario.nome)

    }

    fun MensagemToast(messagem: String) {
        Toast.makeText(this, messagem, Toast.LENGTH_SHORT).show()
    }

    @Composable
    fun TextRowSimples() {

        Text(
            text = "Linha",//todo texto
            color = Color.Red,//todo cor vermelha
            fontSize = 30.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
        )
    }

    @Composable
    fun TextColumnSimples() {

        Text(
            modifier = Modifier.padding(all = 16.dp),//todo padding all

            text = "Coluna",//todo texto
            color = Color.Red,//todo cor vermelha
            fontSize = 30.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
        )
    }

    @Composable
    fun TextColumnCustomizado() {

        Text(
            modifier = Modifier
                .padding(all = 8.dp)//todo padding top
                .border(2.dp, Color.Yellow, CutCornerShape(20)),//todo borda amarela circular

            text = "Coluna",//todo texto
            color = Color.Red,//todo cor vermelha
            fontSize = 30.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
        )
    }

    /*

            @Preview(showBackground = true)

            @Composable
            fun GreetingPreview() {
                KotlinCaniveteSuicoTheme {

                    Home()
                }
            }

    */

}//todo fim da classe ComponentActivity

