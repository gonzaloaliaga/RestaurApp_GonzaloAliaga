package com.example.restaurapp_gonzaloaliaga.ui
import com.example.restaurapp_gonzaloaliaga.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.*
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors

@Preview(showBackground = true)
@Composable
fun RegisterPreview() {
    Register()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register() {
    Scaffold(
        // Header
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("RestaurApp")
                }
            )
        },
        // Footer
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                /* Botón Home, Menú, Reservar, Perfil
                Button(
                    onClick =
                ) {
                    // Funcionamiento del botón
                }
            */
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text("Hola", modifier = Modifier.padding(innerPadding))
        }
    }
}