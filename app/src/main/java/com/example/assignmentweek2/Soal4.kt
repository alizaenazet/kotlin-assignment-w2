package com.example.assignmentweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentweek2.ui.theme.AssignmentWeek2Theme
import com.example.assignmentweek2.ui.theme.Poppins
import com.example.assignmentweek2.ui.theme.SolidBlue

class Soal4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmentWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}


@Composable
fun HeaderChart(){
    Row (
        modifier =
        Modifier
            .height(70.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(start = 20.dp, end = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
            contentDescription = "asaas",
            tint = Color.White)
        Text(text = "Profile", fontFamily = Poppins, fontWeight = FontWeight.SemiBold, fontSize = 25.sp, color = Color.White)
        Icon(
            painter = painterResource(id = R.drawable.baseline_edit_24),
            contentDescription = "burger menu",
            tint = Color.White)
    }
}

@Composable
fun CardsComp(cardTitle: String,blokInside: @Composable() () -> Unit = {}) {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
        ,
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation =  CardDefaults.cardElevation(
            defaultElevation = 5.dp
        ),
        shape = RoundedCornerShape(20.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(top = 15.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
        ) {
            Text(
                text = cardTitle,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .drawBehind {
                        val borderSize = 2.dp.toPx()
                        drawLine(
                            color = Color.LightGray,
                            start = Offset(0f, size.height),
                            end = Offset(size.width, size.height),
                            strokeWidth = borderSize
                        )
                    }
                    .padding(bottom = 10.dp),
            )
            blokInside()
        }

    }
}

@Composable
fun verticalTextField(title: String, value: String){
    Column (
        verticalArrangement = Arrangement.spacedBy(3.dp),
        modifier = Modifier
            .padding(top = 20.dp)
    ){
        Text(text = title,
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal,
            color = Color.Gray)
        Text(text = value,
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal)
    }
}



@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .background(color = SolidBlue)
                ){
                  Column {
                      HeaderChart()
                      Row (
                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(start = 20.dp, end = 20.dp, top = 40.dp),
                          horizontalArrangement = Arrangement.SpaceEvenly,
                          verticalAlignment = Alignment.CenterVertically
                      ){
                          Column (
                          ){
                              Text(text = "Cukurukuk Walker",
                                  fontFamily = Poppins,
                                  fontWeight = FontWeight.Bold,
                                  fontSize = 20.sp,
                                  color = Color.White)
                              Text(text = "Kiwkiw university",
                                  fontFamily = Poppins,
                                  fontWeight = FontWeight.Normal,
                                  fontSize = 16.sp,
                                  color = Color.White)
                          }
                          Image(
                              painter = painterResource(id = R.drawable.ever_wondered_how_a_smurf_would_look_in_real_life___imgur),
                              contentDescription = "miauw",
                              contentScale = ContentScale.Crop,
                              modifier = Modifier
                                  .size(100.dp)
                                  .clip(CircleShape)
                          )
                      }
                  }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2.5f)
                        .background(color = Color.White)
                )
            }
            //Outside column inside parent Box
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(top = 230.dp)
                    .align(Alignment.TopCenter)
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(start = 22.dp, end = 22.dp),
                    verticalArrangement = Arrangement.spacedBy(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    CardsComp("Personal daata",{ PersonalData() })
                    CardsComp("Expertise",{ Expertise() })
                    CardsComp("Send a message",{ sendMessage() })
                }
            }
        }
}

@Composable
fun PersonalData(){
    val rowModifier = Modifier.fillMaxWidth()
    Column {
        Row (
            modifier = rowModifier,
            horizontalArrangement = Arrangement.spacedBy(40.dp)
        ){
            verticalTextField(title = "NIDN", value = "0123456789")
            verticalTextField(title = "Date of Birth", value = "1 January 1996")
        }
        Row (
            modifier = rowModifier,
            horizontalArrangement = Arrangement.spacedBy(40.dp)
        ){
            verticalTextField(title = "Occupation", value = "Lecturer")
            verticalTextField(title = "Marital Status", value = "Single")
        }
        Row (
            modifier = rowModifier,
            horizontalArrangement = Arrangement.Start
        ){
            verticalTextField(title = "Email", value = "cukururuk@icloud.com")

        }

    }
}

@Composable
fun Expertise(){
    Column(
        modifier = Modifier
            .padding(top = 40.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp),

        ) {
            Image(
                painter = painterResource(id = R.drawable.androidstudio_logo),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentDescription = "androstudio")
            Text(text = "Android studio",
                fontFamily = Poppins,
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp,)
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
            Image(
                painter = painterResource(id = R.drawable.oop_logo),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentDescription = "androstudio")
            Text(text = "Object oriented programming",
                fontFamily = Poppins,
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp,)
        }
        }
    }

@Composable
fun sendMessage(){
    Column(
        modifier = Modifier
            .padding(top = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent, shape = RoundedCornerShape(25.dp))
                .border(1.dp, Color.Gray, shape = RoundedCornerShape(25.dp))
                .padding(20.dp),
        ){
            Text(text = "Write a message", fontFamily = Poppins, color = Color.Gray)
        }
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .height(45.dp)
            ,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            ),
            shape = RoundedCornerShape(30.dp)
        ) {
            Text(text = "Send", fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 15.sp, color = Color.White,)
        }

    }

}

@Preview(showBackground = true, showSystemUi = true, device = "spec:width=411dp,height=1150dp,dpi=420,isRound=false,chinSize=0dp,orientation=portrait")
@Composable
fun GreetingPreview5() {
    AssignmentWeek2Theme {
        Greeting2("Android")
    }
}