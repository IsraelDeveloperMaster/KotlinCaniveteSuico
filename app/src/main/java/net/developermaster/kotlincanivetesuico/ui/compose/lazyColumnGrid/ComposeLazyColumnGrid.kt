package net.developermaster.kotlincanivetesuico.ui.compose.View.LazyColumnGrid

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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.developermaster.kotlincanivetesuico.R
import net.developermaster.kotlincanivetesuico.ui.compose.model.ModelComposeGeral

class ComposeLazyColumnGrid : ComponentActivity() { //todo inicio da classe ComponentActivity

    private val usuarios = listOf(
        ModelComposeGeral("João"),
        ModelComposeGeral("Ana"),
        ModelComposeGeral("Maria"),
        ModelComposeGeral("Maria"),
        ModelComposeGeral("Maria"),
        ModelComposeGeral("Maria"),
        ModelComposeGeral("Maria"),
        ModelComposeGeral("Maria"),
        ModelComposeGeral("Maria"),
        ModelComposeGeral("Pedro"),
        ModelComposeGeral("Maria"),
        ModelComposeGeral("João"),
        ModelComposeGeral("João"),
        ModelComposeGeral("João"),
        ModelComposeGeral("João"),
        ModelComposeGeral("João"),
        ModelComposeGeral("João"),
        ModelComposeGeral("Ana"),
        ModelComposeGeral("Pedro")
    )

    override fun onCreate(savedInstanceState: Bundle?) {//todo inicio do onCreate
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            net.developermaster.kotlincanivetesuico.ui.compose.View.Atributos.ui.theme.KotlinCaniveteSuicoTheme {

                Home()//todo chamando a funcao Hola

            }
        }

    }//todo fim do onCreate

    @Composable
    fun Home() {

        lazyColumnPrincipal()

    }//todo fim da funcao Home

    @Composable
    private fun lazyColumnPrincipal() {

        LazyVerticalGrid (
           columns = GridCells.Fixed(2),//todo duas colunas
//                   columns = GridCells.Adaptive(100.dp),//todo coluna com largura de 100 dp

            modifier = Modifier//todo modificador
//                .height(1000.dp)//todo altura
//                .width(2000.dp)//todo largura
//                .fillMaxHeight()//todo altura
//                .fillMaxWidth()//todo largura
                .border( 10.dp, Color.Red, RoundedCornerShape(10) )//todo borda com raio de 10 e cor vermelha
                .padding(all = 16.dp)//todo padding 4 lados
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

            items(usuarios.size) { indice ->

                val nome = usuarios[indice].nome

                Row {

                    Imagem()

                    TextoToast(nome)

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .border( 10.dp, Color.Red, RoundedCornerShape(10) )//todo borda com raio de 10 e cor vermelha
                            .background(Color.Red)
                            .width( 10.dp )
                    )
                }
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
            items(usuarios) { usuario ->

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

            TextoLinhaSimples()

            TextoLinhaSimples()

            TextoLinhaSimples()
        }
    }

    @Composable
    private fun ColunaSimples() {

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

            TextoColunaSimples()
            TextoColunaSimples()
            TextoColunaSimples()

        }


    }

    @Composable
    private fun ColunaCustomizada() {

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

            TextoColunaCustomizado()
            TextoColunaCustomizado()
            TextoColunaCustomizado()
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

    @Composable
    private fun Imagem() {

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

    @Composable
    private fun TextoToast(nome: String) {

        val usuario = ModelComposeGeral(nome)

        Text(modifier = Modifier
            .background( Color.Magenta)//todo fundo branco
            .fillMaxWidth()//todo largura
            .height(100.dp)//todo altura
            .clickable {

                MensagemToast(usuario.nome)
            }
            .border( 10.dp, Color.Red, RoundedCornerShape(10) )//todo borda com raio de 10 e cor vermelha
            .clip(CircleShape)
            .padding(top = 16.dp) ,//todo padding top

            color = Color.Black,//todo cor vermelha
            fontSize = 12.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
            textAlign = TextAlign.Center,//todo alinhamento do texto

            text = usuario.nome)

    }

    fun MensagemToast(messagem: String) {
        Toast.makeText(this, messagem, Toast.LENGTH_SHORT).show()
    }

    @Composable
    fun TextoLinhaSimples() {

        Text(
            text = "Linha",//todo texto
            color = Color.Red,//todo cor vermelha
            fontSize = 30.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
        )
    }

    @Composable
    fun TextoColunaSimples() {

        Text(
            modifier = Modifier.padding(all = 16.dp),//todo padding all

            text = "Coluna",//todo texto
            color = Color.Red,//todo cor vermelha
            fontSize = 30.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
        )
    }

    @Composable
    fun TextoColunaCustomizado() {

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

    @Preview(showBackground = true)

    @Composable
    fun GreetingPreview() {
        net.developermaster.kotlincanivetesuico.ui.compose.View.Atributos.ui.theme.KotlinCaniveteSuicoTheme {

            Home()
        }
    }

}//todo fim da classe ComponentActivity

