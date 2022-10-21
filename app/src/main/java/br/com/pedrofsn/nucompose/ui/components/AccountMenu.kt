package br.com.pedrofsn.nucompose.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pedrofsn.nucompose.R
import br.com.pedrofsn.nucompose.ui.model.AccountMenuItem
import br.com.pedrofsn.nucompose.ui.theme.NuGrayBall
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

@Preview(showBackground = true)
@Composable
fun PreviewNuAccountMenu() {
    NuAccountMenu()
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun NuAccountMenu() {
    val items = listOf(
        AccountMenuItem(title = "Área Pix", image = R.drawable.ic_pix),
        AccountMenuItem(title = "Pagar", image = R.drawable.ic_pix),
        AccountMenuItem(title = "Pegar emprestado", image = R.drawable.ic_pix),
        AccountMenuItem(title = "Transferir", image = R.drawable.ic_pix),
        AccountMenuItem(title = "Depositar", image = R.drawable.ic_pix),
    )

    val horizontalPadding = 32.dp
    val itemWidth = 135.dp
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val end = screenWidth.dp - itemWidth + horizontalPadding
    val contentPadding = PaddingValues(end = end)

    HorizontalPager(
        count = items.size,
        modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
        contentPadding = contentPadding,
    ) { currentPage ->
        AccountMenuItem(accountMenuItem = items[currentPage])
    }
}

@Composable
private fun AccountMenuItem(accountMenuItem: AccountMenuItem) {
    Column(
        modifier = Modifier.size(135.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NuButton(
            color = NuGrayBall,
            image = accountMenuItem.image,
            imageSize = 20
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            color = Color.Black,
            text = accountMenuItem.title,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.body1
        )
    }
}
