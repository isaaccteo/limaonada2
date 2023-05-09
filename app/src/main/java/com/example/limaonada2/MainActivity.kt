package com.example.limaonada2


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.createTextLayoutResult
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.limaonada2.ui.theme.Limaonada2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Limaonada2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Limonada()
                }
            }
        }
    }
}

@Preview
@Composable
fun Limonada() {
    var tela = 1


    when(tela) {
        1-> ConteudoApp(R.string.limoeiro,R.drawable.lemon_tree)
        2-> ConteudoApp(R.string.limao,R.drawable.lemon_restart)
        3-> ConteudoApp(R.string.copo_de_limonads,R.drawable.limaonad )
        4-> ConteudoApp(R.string.copo_vazio,R.drawable.reiniciar)


    }
    ConteudoApp(R.string.limoeiro,R.drawable.lemon_tree)

    ConteudoApp(R.string.limao,R.drawable.lemon_squeeze)



}
@Composable
fun ConteudoApp(
    idTexto:Int,
    idImagem:Int
)
{
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),

        ) {


        Text(
            text = stringResource(idTexto),
            textAlign = TextAlign.Center,
            fontSize = 19.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 13.dp)

        )
        Image(
            painter = painterResource(id = idImagem),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
                .border(
                    .Modifier.clickable {  }
                    BorderStroke(3.dp, color = Color.Black),
                    RoundedCornerShape(9.dp)
                )
        )
    }

}

    

