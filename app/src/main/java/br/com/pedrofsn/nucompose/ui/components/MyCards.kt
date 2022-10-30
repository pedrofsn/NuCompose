package br.com.pedrofsn.nucompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pedrofsn.nucompose.R
import br.com.pedrofsn.nucompose.ui.theme.NuGrayBall

@Preview(showBackground = true)
@Composable
fun PreviewMyCards() {
    MyCards()
}

@Composable
fun MyCards() {
    Column(modifier = Modifier.padding(all = 20.dp)) {
        Row(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(10.dp))
                .background(NuGrayBall)
                .padding(20.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_cards),
                contentDescription = "Get more details"
            )
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                text = "Meus cartões", color = Color.Black,
                style = MaterialTheme.typography.subtitle2
            )
        }
    }
}
