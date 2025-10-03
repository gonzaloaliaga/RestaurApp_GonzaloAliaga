package com.example.restaurapp_gonzaloaliaga.ui.theme
import com.example.restaurapp_gonzaloaliaga.R
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.res.painterResource


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Mi App Kotlin")})
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = "Bienvenido")
            Button(onClick = { /* Acción futura */}) {
                Text("Presióname")
            }
            /*
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo App",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Fit
            )
            */
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

// Pruebas

data class Message(val author: String, val body: String)
@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(
            painter = painterResource(R.drawable.pear),
            contentDescription = "Contact profile picture"
        )
        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrevewMessageCard(){
    MessageCard(
        msg = Message("Lexi", "Hey, take a look at jetpack compose")
    )
}