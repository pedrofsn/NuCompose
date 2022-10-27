package br.com.pedrofsn.nucompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.pedrofsn.nucompose.ui.components.NuAccount
import br.com.pedrofsn.nucompose.ui.components.NuAccountMenu
import br.com.pedrofsn.nucompose.ui.components.NuToolbar
import br.com.pedrofsn.nucompose.ui.theme.KoinComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KoinComposeTheme {
                NuBank()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NuBank() {
    Column {
        NuToolbar()
        NuAccount()
        NuAccountMenu()
    }
}


