package com.example.assignmentweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentweek2.ui.theme.AssignmentWeek2Theme
import com.example.assignmentweek2.ui.theme.MediumGray
import com.example.assignmentweek2.ui.theme.PinkPastel
import com.example.assignmentweek2.ui.theme.Poppins
import com.example.assignmentweek2.ui.theme.RedPastel

class Soal3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmentWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RootComponent3()
                }
            }
        }
    }
}

@Composable
fun RootComponent3() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(PinkPastel)
        ,

    ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
            contentDescription = "arrow back button",
            modifier = Modifier
                .padding(top = 25.dp, start = 10.dp)
                .size(30.dp)
            ,
            alignment = Alignment.TopStart
            )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, bottom = 40.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.registerlogo),
                contentDescription = "logo",
                modifier = Modifier
                    .size(200.dp)
                    .fillMaxWidth(),
                alignment = Alignment.Center,

                )
        }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(MediumGray, RoundedCornerShape(topEnd = 55.dp, topStart = 55.dp))
            ) {
                Text(text = "Create new Account",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, bottom = 20.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(
                            Color.White,
                            RoundedCornerShape(topEnd = 55.dp, topStart = 55.dp)
                        )
                        .padding(top = 30.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.facebook_icon),
                            contentDescription = "fb",
                            modifier = Modifier
                                .size(28.dp)
                        )
                        Image(painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = "x",
                            modifier = Modifier
                                .size(28.dp))
                        Image(painter = painterResource(id = R.drawable.google_icon),
                            contentDescription = "google",
                            modifier = Modifier
                                .size(28.dp))
                    }
                    Text(text = "or use your email account",
                        fontFamily = Poppins,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(top = 20.dp, bottom = 20.dp))
                    TextFieldComp("Name", "Ex: Jane Doe")
                    TextFieldComp("Email", "Ex: janedow@example.com")
                    TextFieldComp("Password", "Enter: password",true)
                    Column (
                        modifier = Modifier
                            .padding(top= 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                        , verticalArrangement = Arrangement.spacedBy(7.dp)
                    ){
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .height(55.dp)
                            ,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF233444)
                            ),
                            shape = RoundedCornerShape(25.dp)
                        ) {
                            Text(text = "Register", fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 20.sp, color = Color.White,)
                        }

                        Text(text = "Alredy have an account ?",
                            fontFamily = Poppins,
                            color = Color.Gray,)
                        Text(text = "Login Here",
                            fontFamily = Poppins,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFF84E59))
                    }
                }

            }

//
    }
}

@Composable
fun TextFieldComp(info: String,  placeHolder: String, isPassword: Boolean = false){
    Column (
        verticalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp, bottom = 10.dp)
    ){
        Text(text = info,
            fontFamily = Poppins,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp
        )
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent, shape = RoundedCornerShape(15.dp))
                .border(1.dp, Color.Gray, shape = RoundedCornerShape(15.dp))
                .padding(20.dp),
        ){
            if (isPassword){
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = placeHolder, fontFamily = Poppins, color = Color.Gray)
                    Image(
                        painter = painterResource(id = R.drawable.baseline_remove_red_eye_24),
                        contentDescription = "eye icon",
                        modifier = Modifier
                            .size(25.dp))
                }
            }else{
                Text(text = placeHolder, fontFamily = Poppins, color = Color.Gray)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, device = "spec:width=411dp,height=1100dp,dpi=420,isRound=false,chinSize=0dp,orientation=portrait")
@Composable
fun GreetingPreview4() {
    AssignmentWeek2Theme {
        RootComponent3()
    }
}