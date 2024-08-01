package com.example.travelboast

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelboast.ui.theme.TravelBoastTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)

    ) {
        Text(
            text = "Travel Boast",
            fontSize = 40.sp,
            color = Color.Magenta,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Travel Boast is an android application that guides tourists to their different destinations across the country",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Choose your favourite destination",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        Text(text = "1. New York")
        Text(text = "2. Maldives")
        Text(text = "3. Toronto")
        Text(text = "4. Greece")
        Text(text = "5. Maldives")

        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta)
        ) {
            Text(text = "Other destinations")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DemoPreview(){
    Demo()
}