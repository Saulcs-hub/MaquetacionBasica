package em.carlossaulvillabonapinilla.maquetacionbasica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DetalleProductoScreen()
            PantallaArticulo()
            PantallaUsuarioPerfil()

        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun DetalleProductoScreen() {
    val purple = Color(0xFF6650A4)
    val red    = Color(0xFFB00020)
    val green  = Color(0xFF00C853)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.imagecomputador),
                contentDescription = "Imagen del producto",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(8.dp))
            )

            // Icono de favorito
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Favorito",
                tint = Color.Yellow,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(10.dp)
                    .size(35.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Texto del combre del producto
        Text(
            text = "Nombre del Producto",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        // Testo del precio
        Text(
            text = "\$99.99",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = green
        )

        Spacer(modifier = Modifier.height(4.dp))

        // Descripcion
        Text(
            text  = "Descripción del producto con detalles importantes, características y beneficios.",
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Botones de editar y eliminar
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)   // 8.dp entre botones
        ) {
            // Botón Editar
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = purple),
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    imageVector = Icons.Filled.Edit,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(Modifier.width(4.dp))
                Text("Editar")
            }

            // Botón Eliminar
            Button(
                onClick  = {},
                colors   = ButtonDefaults.buttonColors(containerColor = red),
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    imageVector = Icons.Filled.Delete,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(Modifier.width(4.dp))
                Text("Eliminar")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PantallaArticulo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

    // Imagen para que ocupe el ancho de la pantalla
        Image(
            painter = painterResource(id = R.drawable.imagenjetpack),
            contentDescription = "Imagen del artículo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
        )

        // Titulo compatible con las indicaciones el profe
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                start  = 16.dp,
                end    = 16.dp,
                top    = 16.dp,
                bottom = 16.dp
            )
        )

        // Primer párrafo con las indicaciones
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and " +
                    "accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            style     = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Justify,
            modifier  = Modifier.padding(
                start = 16.dp,
                end   = 16.dp
            )
        )

        // Segundo párrafo con las indicaiones
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose " +
                    "functions to say what elements you want and the Compose compiler does the rest. Compose is built " +
                    "around Composable functions. These functions let you define your app's UI programmatically because " +
                    "they let you describe how it should look and provide data dependencies, rather than focus on the " +
                    "process of the UI's construction, such as initializing an element and then attaching it to a parent. " +
                    "To create a Composable function, you add the @Composable annotation to the function name.",
            style     = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Justify,
            modifier  = Modifier.padding(
                start  = 16.dp,
                end    = 16.dp,
                top    = 16.dp,
                bottom = 16.dp
            )
        )
    }
}

@Preview(showSystemUi = true, name = "PantallaPerfil")
@Composable
fun PantallaUsuarioPerfil() {
    val purple = Color(0xFF6650A4)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Imagen circular
        Image(
            painter = painterResource(id = R.drawable.imageciclista),
            contentDescription = "Foto de perfil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(2.dp, purple, CircleShape)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Nombre
        Text(
            text = "Juan Pérez",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        // Bio
        Text(
            text = "Desarrollador Android apasionado por la tecnología y el diseño.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Estadisticas
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ElementoEstadistica(value = "150", label = "Posts")
            ElementoEstadistica(value = "2.3K", label = "Seguidores")
            ElementoEstadistica(value = "980", label = "Likes")
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Botones seguir y mensaje
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = purple),
                modifier = Modifier.weight(1f)
            ) {
                Text("Seguir")
            }
            OutlinedButton(
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text("Mensaje", color = purple)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Intereses
        Text(
            text = "Intereses",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Intereses editados
        val interests = listOf("Ciclismo", "Programación", "UI/UX", "Música", "Viajes", "Gaming")
        Column(modifier = Modifier.align(Alignment.Start)) {
            interests.chunked(3).forEach { rowItems ->
                Row(horizontalArrangement = Arrangement.spacedBy(40.dp)) {
                    rowItems.forEach { interest ->
                        Box(
                            modifier = Modifier
                                .background(
                                    color = Color(0xFFE0E0E0),
                                    shape = RoundedCornerShape(50)
                                )
                                .border(1.dp, Color(0xFFBDBDBD), RoundedCornerShape(50))
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = interest,
                                fontSize = 14.sp,
                                color = Color.DarkGray
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Proyectos Recientes
        Text(
            text = "Proyectos Recientes",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Card del proyecto
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {

                // Imagen del proyecto
                Image(
                    painter = painterResource(id = R.drawable.imagecicilstacard),
                    contentDescription = "Proyecto",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(topStart = 8.dp, bottomStart = 8.dp))
                )

                // Texto del proyecto
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = "App de Ciclismo",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Text(
                        text = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.",
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = purple),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Text("Ver más", fontSize = 12.sp)
                    }
                }
            }
        }
    }
}

//Composable auxiliar
@Composable
fun ElementoEstadistica(value: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = value, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Text(text = label, style = MaterialTheme.typography.bodySmall)
    }
}

