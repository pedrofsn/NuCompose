package br.com.velantasistemas.koincompose.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.velantasistemas.koincompose.R
import br.com.velantasistemas.koincompose.ui.theme.NuPurpleBall
import br.com.velantasistemas.koincompose.ui.theme.NuToolbarBackground


@Preview(showBackground = true)
@Composable
fun preview() {
    NuToolbar()
}

@Composable
fun NuToolbar() {
    Surface(color = NuToolbarBackground) {
        Column {
            Box(contentAlignment = Alignment.CenterStart) {
                CustomTopAppBar()
                NuIconProfile()
            }
            Text(
                text = "Olá, Pedro",
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp, bottom = 10.dp, top = 10.dp)
            )
        }
    }
}

@Composable
private fun CustomTopAppBar() {
    TopAppBar(
        elevation = 0.dp,
        backgroundColor = NuToolbarBackground,
        title = { },
        actions = {
            Icon(
                painter = painterResource(id = R.drawable.ic_eye_open),
                contentDescription = "Eye open",
                modifier = Modifier.padding(10.dp),
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_help),
                contentDescription = "Help",
                modifier = Modifier.padding(10.dp),
                tint = Color.White
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_person_add),
                contentDescription = "Person add",
                modifier = Modifier.padding(10.dp),
                tint = Color.White
            )
        }
    )
}

@Composable
private fun NuIconProfile() {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)) {
        Canvas(modifier = Modifier.size(30.dp)) {
            drawCircle(color = NuPurpleBall)
        }
        Image(
            painter = painterResource(id = R.drawable.ic_person),
            contentDescription = "Person",
            contentScale = ContentScale.Fit,
        )
    }
}
