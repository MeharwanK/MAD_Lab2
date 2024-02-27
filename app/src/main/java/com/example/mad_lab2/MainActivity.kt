package com.example.mad_lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mad_lab2.ui.theme.MAD_Lab2Theme
import com.example.mad_lab2.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MAD_Lab2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Lab2Task2(modifier=Modifier)
                }
            }
        }
    }
}

@Composable
fun Lab2Task1(modifier: Modifier = Modifier) {
    var buttonColor = remember{
        mutableStateOf(Color.Red);
    }
    Button(onClick = { buttonColor.value = Color.Green }, modifier.padding(80.dp),colors = ButtonDefaults.buttonColors(
        containerColor = buttonColor.value)){
        Text("Click to Change")
    }
}
@Composable
fun Lab2Task2(modifier: Modifier){
    Row(modifier= Modifier
        .border(1.dp, Color.Black, RectangleShape)
        .height(100.dp))
    {
        Image(painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription ="",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .padding(5.dp))


        Column(modifier= Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .height(70.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)

        {
                Text(text = "Meharwan Kumar",
                    textAlign = TextAlign.Left,
                    modifier= Modifier
                        .width(300.dp)
                        .padding(5.dp)
                        .offset(0.dp, 4.dp))

                Text(text = "BS-Computer Science",
                    textAlign = TextAlign.Left,
                    modifier= Modifier
                        .width(300.dp)
                        .padding(5.dp)
                        .offset(2.dp, 2.dp))

        }

    }


}

@Composable
fun Lab2Task3(modifier: Modifier){
    Column {
        Row(
            modifier = Modifier
                .height(100.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(5.dp)
            )


            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )

            {
                Text(
                    text ="Iron Man",
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(0.dp, 4.dp)
                )

                Text(
                    text = "Age: 43",
                    textAlign = TextAlign.Left,
                    color = Color.LightGray,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(2.dp, 2.dp)
                )

            }

        }
        Row(
            modifier = Modifier
                .height(100.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(5.dp)
            )


            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )

            {
                Text(
                    text = "Hulk",
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(0.dp, 4.dp)
                )

                Text(
                    text = "Age: 38",
                    textAlign = TextAlign.Left,
                    color = Color.LightGray,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(2.dp, 2.dp)
                )

            }

        }
        Row(
            modifier = Modifier

                .height(100.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(5.dp)
            )


            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )

            {
                Text(
                    text = "Deadpool",
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(0.dp, 4.dp)
                )

                Text(
                    text = "Age: 25",
                    textAlign = TextAlign.Left,
                    color = Color.LightGray,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(2.dp, 2.dp)
                )

            }

        }
        Row(
            modifier = Modifier
                .height(100.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(5.dp)
            )


            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )

            {
                Text(
                    text = "Wolverine",
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(0.dp, 4.dp)
                )

                Text(
                    text = "Age: 48",
                    textAlign = TextAlign.Left,
                    color = Color.LightGray,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(2.dp, 2.dp)
                )

            }

        }
        Row(
            modifier = Modifier
                .height(100.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(5.dp)
            )


            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )

            {
                Text(
                    text = "Black Widow",
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(0.dp, 4.dp)
                )

                Text(
                    text = "Age: 30",
                    textAlign = TextAlign.Left,
                    color = Color.LightGray,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(2.dp, 2.dp)
                )

            }

        }
        Row(
            modifier = Modifier
                .height(100.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(5.dp)
            )


            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(70.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )

            {
                Text(
                    text = "Thor",
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(0.dp, 4.dp)
                )

                Text(
                    text = "Age: 35",
                    textAlign = TextAlign.Left,
                    color = Color.LightGray,
                    modifier = Modifier
                        .width(300.dp)
                        .padding(0.dp)
                        .offset(2.dp, 2.dp)
                )

            }

        }


    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MAD_Lab2Theme {
        Lab2Task1(modifier=Modifier)
        //Lab2Task2(modifier=Modifier)
        //Lab2Task3(modifier=Modifier)
    }
}

