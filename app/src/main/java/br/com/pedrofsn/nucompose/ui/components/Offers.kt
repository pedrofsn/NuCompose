
package br.com.pedrofsn.nucompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pedrofsn.nucompose.ui.theme.NuGrayBall
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

@Preview(showBackground = true)
@Composable
fun PreviewOffers() {
    Offers()
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Offers() {
    val items = listOf(
        "Conheça o novo Assistente de\npagamentos do Nubank",
        "Você pediu e elas chegaram:\nconheça as Caixinhas!",
        "Você tem até R$ 25.000,00\ndisponíveis para empréstimo.",
        "Salve amigos da burocracia.\nFaça um convite para o Nubank."
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        val horizontalPadding = 32.dp
        val itemWidth = 335.dp
        val screenWidth = LocalConfiguration.current.screenWidthDp
        val end = screenWidth.dp - itemWidth + horizontalPadding
        val contentPadding = PaddingValues(end = end)

        HorizontalPager(
            count = items.size,
            contentPadding = contentPadding,
            itemSpacing = 10.dp
        ) { currentPage ->
            Column(modifier = Modifier.padding(start = 20.dp)) {
                Row(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(NuGrayBall)
                        .padding(all = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = items[currentPage],
                        style = MaterialTheme.typography.body2
                    )
                }
            }
        }
    }
}
