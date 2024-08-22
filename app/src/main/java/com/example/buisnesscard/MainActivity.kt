package com.example.buisnesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.buisnesscard.ui.theme.BuisnessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuisnessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Card(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Card(name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        NameInfo(modifier.align(alignment = Alignment.CenterHorizontally))
        ContactInfo(modifier.align(alignment = Alignment.CenterHorizontally))


    }

}

@Composable
fun NameInfo(modifier: Modifier) {
    Column(

    ) {
        Text(
            text = "Robert Shelton",
            modifier = modifier
        )
        Text(text = "aspiring coder",
            modifier = modifier)
    }
}

@Composable
fun ContactInfo(modifier: Modifier) {
    Column {
        Text(
            text = "317 123 1234",
            modifier = modifier)
        Text(text = "@WeDoNotCare",
            modifier = modifier)
        Text(text = "WeDoNotCare@in.ca.hello.gmail.com",
            modifier = modifier)

    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    BuisnessCardTheme {
        Card("Android")
    }
}