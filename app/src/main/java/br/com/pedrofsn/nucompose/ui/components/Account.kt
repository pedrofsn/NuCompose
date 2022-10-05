package br.com.pedrofsn.nucompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pedrofsn.nucompose.R

@Preview(showBackground = true)
@Composable
fun PreviewNuAccountDashboard() {
    NuAccountDashboard()
}

@Composable
fun NuAccountDashboard() {
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
                    text = "Conta", color = Color.Black,
                    style = MaterialTheme.typography.subtitle2
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_next),
                    contentDescription = "Get more details"
                )
            }
            Text(
                text = "R$ 0,00",
                color = Color.Black,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(top = 5.dp)
            )
        }
    }
}
