package com.example.restaurapp_gonzaloaliaga.ui
import com.example.restaurapp_gonzaloaliaga.R
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.restaurapp_gonzaloaliaga.viewmodel.UsuarioViewModel

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(viewModel: UsuarioViewModel) {
    val estado by viewModel.estado.collectAsState()
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
        ) { // Contenido de HomePage

            // Promociones
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxWidth()
            ) {
                // Label
                Text(text = "Promociones", fontSize = 20.sp)

                // Productos
                val scrollState = rememberScrollState()
                val items = listOf("Item 1", "Item 2", "Item 3", "Item 4") // Obtener productos

                Row(
                    modifier = Modifier
                        .horizontalScroll(scrollState)
                ) {
                    for (item in items) {
                        Card(
                            onClick = {
                                // Al darle click al producto
                                println("Producto clickeado")
                            },
                            modifier = Modifier.padding(horizontal = 5.dp)
                        ) { // Contenido del producto
                            Column(
                                modifier = Modifier.padding(10.dp)
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.pear),
                                    contentDescription = "fotoProducto",
                                    modifier = Modifier.padding(5.dp)
                                )
                                Text(text = item)
                            }
                        }
                    }
                }
            }
        }
    }
}