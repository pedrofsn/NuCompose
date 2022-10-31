package br.com.pedrofsn.nucompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
fun PreviewCardBill() {
    CardBill()
}

@Composable
fun CardBill() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .padding(all = 20.dp)
                .background(Color.White)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Cartão de crédito",
                    color = Color.Black,
                    style = MaterialTheme.typography.body1
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_next),
                    contentDescription = "Get more details"
                )
            }
            Text(
                text = "Fatura atual",
                color = Color.Gray,
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(top = 5.dp)
            )
            Text(
                text = "R$ 0,00",
                color = Color.Black,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(top = 10.dp)
            )
            Text(
                text = "Limite disponível de R$ 1.000,00",
                color = Color.Gray,
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(top = 5.dp)
            )
            Button("Parcelar compras")
        }
    }
}

@Composable
fun Button(textButton: String) {
    Row(
        modifier = Modifier
            .padding(top = 20.dp)
            .clip(shape = RoundedCornerShape(30.dp))
            .background(NuGrayBall),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = textButton,
            color = Color.Black,
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier.padding(start = 15.dp, end = 15.dp, bottom = 10.dp, top = 10.dp)
        )
    }

}
