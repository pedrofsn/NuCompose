package br.com.pedrofsn.nucompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.pedrofsn.nucompose.R
import br.com.pedrofsn.nucompose.ui.model.AccountMenuItem
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

//@Preview(showBackground = true)
//@Composable
//fun previewAccountMenu() {
//    AccountMenu()
//}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun AccountMenu() {
    val items = arrayListOf<AccountMenuItem>()
    HorizontalPager(count = 5) { currentPage ->
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            val accountMenuItem = items[currentPage]
            AccountMenuItem(accountMenuItem)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewAccountMenuItem() {
    AccountMenuItem(AccountMenuItem(title = "Teste", image = R.drawable.ic_eye_open))
}

@Composable
private fun AccountMenuItem(accountMenuItem: AccountMenuItem) {
    Image(
        painter = painterResource(id = accountMenuItem.image),
        contentDescription = accountMenuItem.title
    )
    Spacer(modifier = Modifier.height(10.dp))
    Text(
        text = accountMenuItem.title,
        style = MaterialTheme.typography.h2
    )
}
