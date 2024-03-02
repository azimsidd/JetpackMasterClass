package com.thecodingshef.jetpackmasterclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt
import com.thecodingshef.jetpackmasterclass.compose.LoginScreen
import com.thecodingshef.jetpackmasterclass.ui.theme.bold14

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CustomImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_facebook),
        contentDescription = "facebook icon",
        colorFilter = ColorFilter.tint(color = Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.Blue)
            .padding(20.dp)
    )
}


@Preview(showBackground = true)
@Composable
fun MyGreeting() {
    val customColor = ""
    Text(
        text = "Welcome to this Compose Webinar",
        style = MaterialTheme.typography.bold14.copy(color = customColor.toColor()),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

fun String.toColor(): Color {
    return if (this.isNotEmpty()) Color(this.toColorInt()) else Color.Gray
}

/*
* // Row
           //Columns
            //Box
            // Constraint Layout
            // GridView
            // LazyRow, Lazy Column
* */
