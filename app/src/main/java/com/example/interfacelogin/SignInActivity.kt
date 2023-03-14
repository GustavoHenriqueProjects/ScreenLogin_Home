package com.example.interfacelogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfacelogin.ui.theme.InterfaceLoginTheme

class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InterfaceLoginTheme {
                InterfaceSignIn()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun InterfaceSignIn(){
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.fillMaxWidth()){
                    Image(
                        painter = painterResource(id = R.drawable.background_image),
                        contentDescription ="",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(230.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.first_user),
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp)
                                .padding(end = 20.dp)
                        )
                        Text(text = stringResource(id = R.string.mytrips_user),
                            fontSize = 18.sp,
                            modifier = Modifier.padding(end = 20.dp),
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(33.dp))
                        Column(modifier = Modifier
                            .fillMaxWidth()
                        ) {
                            Row(modifier = Modifier.fillMaxWidth()) {
                                Image(
                                    painter = painterResource(id = R.drawable.map),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .padding(start = 20.dp, top = 10.dp)
                                        .size(20.dp)
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = stringResource(id = R.string.mytrips_local),
                                    modifier = Modifier.padding(top = 5.dp),
                                fontSize = 20.sp,
                                color = Color.White
                                )
                            }
                            Text(text = stringResource(id = R.string.mytrips),
                                modifier = Modifier.padding(start = 53.dp),
                                fontSize = 23.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )

                        }
                    }
                }
            }
        }
    }
}