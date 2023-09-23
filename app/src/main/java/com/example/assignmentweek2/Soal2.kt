package com.example.assignmentweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignmentweek2.ui.theme.AssignmentWeek2Theme
import com.example.assignmentweek2.ui.theme.Poppins
import java.text.Format
import java.text.NumberFormat
import java.util.Locale




class Soal2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmentWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RootComponent2()
                }
            }
        }
    }
}

fun getInaLocalCurrency( price: Number): String {
    val localeID =  Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    return  numberFormat.format(price).toString()+"0"
}
@Composable
fun RootComponent2() {
    Column (
        modifier = Modifier
            .padding(start = 6.dp, end = 6.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ){
        Row (
            modifier =
            Modifier
                .height(70.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(start = 7.dp, end = 7.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                contentDescription = "asaas")
            Text(text = "Your chart", fontFamily = Poppins, fontWeight = FontWeight.SemiBold, fontSize = 25.sp, color = Color(0xFF444444))
            Image(
                painter = painterResource(id = R.drawable.baseline_menu_24),
                contentDescription = "burger menu")
        }

        MenuComponent(
            name = "Plant based Whopper",
            rate = "👩‍🍳",
            spicyLevel = "5/10",
            price = 12.000,
            quantity = 8,
            image = painterResource(id = R.drawable.burger1))
        MenuComponent(
            name = "Extra Spicy chicken burger",
            rate = "🌶️",
            spicyLevel = "10/10",
            price = 36.000,
            quantity = 5,
            image = painterResource(id = R.drawable.burger2))
        MenuComponent(
            name = "BBQ beef burger",
            rate = "👩‍🍳",
            spicyLevel = "7/10",
            price = 30.000,
            quantity = 5,
            image = painterResource(id = R.drawable.burger3))
        Row (
            modifier = Modifier
                .drawBehind {
                    val borderSize = 2.dp.toPx()
                    drawLine(
                        color = Color.LightGray,
                        start = Offset(0f, size.height),
                        end = Offset(size.width, size.height),
                        strokeWidth = borderSize
                    )
                }
                .padding(bottom = 10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            Text(text = "Delivery charges", fontFamily = Poppins, fontWeight = FontWeight.Normal,fontSize = 14.sp, color = Color.Gray)
            Text(text = "Free devlivery", fontFamily = Poppins, fontWeight = FontWeight.Normal,fontSize = 14.sp,  style = TextStyle(textDecoration = TextDecoration.Underline),color = Color.Gray)
        }
        Row (
            modifier = Modifier
                .drawBehind {
                    val borderSize = 2.dp.toPx()
                    drawLine(
                        color = Color.LightGray,
                        start = Offset(0f, size.height),
                        end = Offset(size.width, size.height),
                        strokeWidth = borderSize
                    )
                }
                .padding(bottom = 10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            Text(text = "Total Amount", fontFamily = Poppins, fontWeight = FontWeight.Normal,fontSize = 14.sp, color = Color.Gray)
            Text(text = getInaLocalCurrency(78.000), fontFamily = Poppins, fontWeight = FontWeight.Normal,fontSize = 14.sp,  color = Color.Gray)
        }
        Row(
            modifier= Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            ElevatedButton(onClick = { /*TODO*/ },
                border= BorderStroke(width = 1.dp,color = Color.Black),
                modifier = Modifier
                    .height(45.dp)
                ,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(15.dp)
            ) {
                Text(text = "Rp. 78.000", fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 20.sp, color = Color.Black,
                    )
            }
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(45.dp)
                    .fillMaxWidth()
                ,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF233444)
                ),
                shape = RoundedCornerShape(15.dp)
            ) {
                Text(text = "Continue", fontFamily = Poppins, fontWeight = FontWeight.Normal, fontSize = 20.sp, color = Color.White,

                    )
            }
        }


    }




}


@Composable
fun MenuComponent(name:String, rate:String, spicyLevel:String, price: Double, quantity: Int, image: Painter){
    Row (
        modifier = Modifier
            .drawBehind {
                val borderSize = 2.dp.toPx()
                drawLine(
                    color = Color.LightGray,
                    start = Offset(0f, size.height),
                    end = Offset(size.width, size.height),
                    strokeWidth = borderSize
                )
            }
            .padding(bottom = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(space = 10.dp),
        ){
        Image(painter = image ,
            contentDescription = name+" image",
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .size(155.dp),
            contentScale = ContentScale.Crop

        )
        Column(
            verticalArrangement = Arrangement.Center,
        ) {
            val harga = getInaLocalCurrency(price)
            Text(text = "Krabby patty", fontFamily = Poppins, fontWeight = FontWeight.SemiBold, color = Color.Gray,fontSize = 13.sp)
            Text(text = name, fontFamily = Poppins, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text(text = "Rate-$rate Spicy level-$spicyLevel", fontFamily = Poppins, fontWeight = FontWeight.Normal,fontSize = 12.sp)
            Text(text = harga, fontFamily = Poppins, fontWeight = FontWeight.Normal,fontSize = 12.sp)
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){
                Text(text = "+ ${quantity} -",fontFamily = Poppins, fontWeight = FontWeight.Normal,fontSize = 12.sp)
                Image(painter = painterResource(id = R.drawable.baseline_close_24), contentDescription = "remove button")
            }

        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview3() {
    AssignmentWeek2Theme {
        RootComponent2()
    }
}