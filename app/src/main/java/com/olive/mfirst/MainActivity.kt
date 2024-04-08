package com.olive.mfirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.olive.mfirst.ui.theme.MfirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MfirstTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()

                }
            }
        }
    }
}





@Composable
fun Home() {

   Column(horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Top,
          modifier = Modifier
              .fillMaxSize()
              .background(Color.LightGray)){
       Text(text = "Olive's Mobile App",
            color = Color.DarkGray,
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive,




       )
       Spacer(modifier = Modifier.height(30.dp))
       Text(text = "Welcome to Android app programming",
           color = Color.Black,
           fontSize = 22.sp
           )
       Image(painter = painterResource(id = R.drawable.ayanokoji_kun),
           contentDescription =null)
       Spacer(modifier = Modifier.height(15.dp))
        Text(text = "This s a great app",
            fontSize = 18.sp
            )
        Image(painter = painterResource(id = R.drawable.kingofcurses),
            contentDescription =null)
       Image(painter = painterResource(id = R.drawable.mashle),
           contentDescription =null)
   }



}

@Preview
@Composable
private fun Homepre(){
    Home()
}
