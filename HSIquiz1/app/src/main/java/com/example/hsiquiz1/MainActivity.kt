package com.example.hsiquiz1

import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hsiquiz1.ui.theme.HSIquiz1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HSIquiz1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            LogoAtas()
                            Badan("a")
                            TombolBawah()
                        }
                    }

                }
            }
        }
    }
}
@Composable
fun LogoAtas() {
    Image(
        painter = painterResource(R.drawable.logo),
        contentDescription = "Logo",
        modifier = Modifier
            .width(100.dp)
    )
}
@Composable
fun Badan(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(18.dp)
            )
            .padding(18.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Isi form CV dulu, yuk!",
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(18.dp)

            )
            Text(
                text = "Untuk bisa memulai pencarian pasangan, Antum harus mengisi form CV antum terlebih dahulu",
                fontSize = 10.sp,
                textAlign = TextAlign.Center,
            )
            Image(
                painter = painterResource(R.drawable.cv__1_),
                contentDescription = "CV nya")
            TombolTengah()
        }
    }

}

@Composable
fun TombolTengah() {
    Row {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        ) {
            Text(
                text = "Lewati"

            )
        }
        Spacer(modifier = Modifier.width(9.dp))
        Button(
            onClick = { /*TODO*/ },
        ) {
            Text(
                text = "Isi CV"
            )
        }
    }

}

@Composable
fun TombolBawah() {
    //Row(
       // verticalAlignment = Alignment.CenterVertically,
        // = Arrangement.SpaceAround,
        //modifier = Modifier
            //.fillMaxWidth()
            //.fillMaxHeight()
    //) {
        val icon1 = painterResource(R.drawable.tombohome)
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = icon1,
                contentDescription = "iconhome",
            )
            //Text(text = "tex")
        }

    //}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HSIquiz1Theme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                LogoAtas()
                Badan("a")
                TombolBawah()
            }
        }
    }
}