package br.com.pedrofsn.nucompose.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily.Companion.Monospace
import androidx.compose.ui.text.font.FontWeight.Companion.W100
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pedrofsn.nucompose.R
import br.com.pedrofsn.nucompose.ui.theme.NuPurpleBall
import br.com.pedrofsn.nucompose.ui.theme.NuToolbarBackground


@Preview(showBackground = true)
@Composable
fun Preview() {
    NuToolbar()
}

@Composable
fun NuToolbar() {
    Surface(color = NuToolbarBackground) {
        Column(modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                NuIconProfile()
                CustomTopAppBar()
            }
            Text(
                text = "Olá, Pedro",
                fontWeight = W100,
                fontFamily = Monospace,
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp, bottom = 10.dp, top = 10.dp)
            )
        }
    }
}

@Composable
private fun CustomTopAppBar() {
    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_eye_open),
            contentDescription = "Eye open",
            modifier = Modifier
                .padding(10.dp)
                .size(25.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_help),
            contentDescription = "Help",
            modifier = Modifier
                .padding(10.dp)
                .size(25.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_person_add),
            contentDescription = "Person add",
            modifier = Modifier
                .padding(10.dp)
                .size(25.dp)
        )
    }
}

@Composable
private fun NuIconProfile() {
    NuButton(image = R.drawable.ic_person)
}

@Composable
fun NuButton(color: Color = NuPurpleBall, @DrawableRes image: Int, imageSize: Int = 40) {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)) {
        Canvas(modifier = Modifier.size(60.dp)) {
            drawCircle(color = color)
        }
        Image(
            painter = painterResource(id = image),
            contentDescription = "Person",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(imageSize.dp)
        )
    }
}
