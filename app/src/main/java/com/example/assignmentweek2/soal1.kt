package com.example.assignmentweek2

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentweek2.ui.theme.AssignmentWeek2Theme
import com.example.assignmentweek2.ui.theme.Poppins

class soal1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmentWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RootComponent()
                }
            }
        }
    }
}

@Composable
fun RootComponent() {
    Column (
        modifier = Modifier.background(color = Color(0xFFEFF1F3)),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (
            modifier =
            Modifier
                .height(70.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                .padding( bottom = 5.dp, start = 7.dp, end = 7.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                contentDescription = "asaas")
            Text(text = "Krabby patty", fontFamily = Poppins, fontWeight = FontWeight.SemiBold, fontSize = 25.sp, color = Color(0xFF444444))
            Image(
                painter = painterResource(id = R.drawable.baseline_menu_24),
                contentDescription = "burger menu")
        }
        Image(
            painter = painterResource(id = R.drawable.burger),
            contentDescription ="burger",
            modifier = Modifier.size(260.dp)
            )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 30.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF233444)
            ),
            shape = RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp),

        ) {
            Column (
                modifier = Modifier
                    .padding(top = 20.dp, start = 10.dp, end = 10.dp),
            ){
                Text(text = "King box Cheesy beef burger",
                    fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 22.sp, color = Color.White)
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, bottom = 10.dp),
                    horizontalArrangement = Arrangement.spacedBy(space = 5.dp),
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_star_24),
                        contentDescription = "star",
                        tint = Color.Yellow
                        )
                    Text(text = "5.0", fontFamily = Poppins, fontWeight = FontWeight.Medium,color = Color.White)
                    Text(text = "(666 Reviews)",fontFamily = Poppins, fontWeight = FontWeight.Normal, color = Color(0xFF757575))

                }
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam," +
                        "", fontFamily = Poppins,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 5.dp),
                    color = Color.White,
                    fontSize = 20.sp
                )

                Row(modifier =
                Modifier
                    .padding(top = 30.dp)
                    .fillMaxWidth()
                    .weight(1f)
                    .defaultMinSize()
                    ,
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Rp.40,300", fontFamily = Poppins, fontWeight = FontWeight.Bold, fontSize = 22.sp, color = Color.White)
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(56.dp)
                        ,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White
                        ),
                            shape = RoundedCornerShape(15.dp)
                            ) {
                        Text(text = "Add to Cart", fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 22.sp, color = Color.Black,

                            )
                    }

                }

            }

        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    AssignmentWeek2Theme {
        RootComponent()
    }
}