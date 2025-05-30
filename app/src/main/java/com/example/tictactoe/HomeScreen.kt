package com.example.tictactoe

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.platform.LocalUriHandler

@Composable
fun HomeScreen(context: Context,navController: NavController){
    val btn: MediaPlayer =MediaPlayer.create(context,R.raw.cllk)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(Color(0xFFBA68C8),Color(0xFF9C27B0),Color(0xFF7B1FA2))
                )
            )
    ) {
        Row(){
            Text(
                text="o",
                color=Color(0x1B98e00D),
                fontWeight= FontWeight.Bold,
                fontSize = 110.sp
            )
            Spacer(modifier = Modifier.width(150.dp))
            Text(
                text="x",
                color=Color(0x1b98e00D),
                fontWeight= FontWeight.Bold,
                fontSize = 110.sp
            )
        }
        Row(){
            Text(
                text="x",
                color=Color(0x1b98E00D),
                fontWeight= FontWeight.Bold,
                fontSize = 130.sp
            )
            Spacer(modifier = Modifier.width(50.dp))
            Text(
                text="o",
                color=Color(0x1b98e00D),
                fontWeight= FontWeight.Bold,
                fontSize = 130.sp
            )
        }
        Row(){
            Text(
                text="o",
                color=Color(0x1b98e00D),
                fontWeight= FontWeight.Bold,
                fontSize = 150.sp
            )
            Spacer(modifier = Modifier.width(150.dp))
            Text(
                text="x",
                color=Color(0x1b98e00D),
                fontWeight= FontWeight.Bold,
                fontSize = 150.sp
            )
        }
        Row(){
            Text(
                text="x",
                color=Color(0x1b98e00D),
                fontWeight= FontWeight.Bold,
                fontSize = 170.sp
            )
            Spacer(modifier = Modifier.width(50.dp))
            Text(
                text="o",
                color=Color(0x1b98e00D),
                fontWeight= FontWeight.Bold,
                fontSize = 170.sp
            )
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id=R.drawable.tictactoe),
            contentDescription = null,
            modifier = Modifier.padding(top=150.dp, start = 10.dp, end = 10.dp)
        )
        Image(
            painter = painterResource(id=R.drawable.game),
            contentDescription = null,
            )
        Spacer(modifier = Modifier.height(100.dp))
        val uriHandler = LocalUriHandler.current

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(50.dp))
                .background(
                    brush = Brush.horizontalGradient(
                        colors= listOf(Color(0xFFFF8C00),Color(0xFFFF4500))
                    )
                )
                .clickable {
                    btn.start()
                    navController.navigate("player_screen")
                }
        ){
            Text(
                text="LET'S PLAY",
                color= Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier= Modifier.padding(top=10.dp,bottom=10.dp, start = 30.dp, end = 30.dp)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = "Made By Sonal Chauhan",
            fontFamily = FontFamily.Serif,
            fontSize = 17.sp,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            modifier = Modifier.clickable {
                uriHandler.openUri("https://www.linkedin.com/in/sonal-chauhan-bab705284/")
            }
        )
    }
}