package com.example.interfacelogin

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
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
    var search by rememberSaveable{
        mutableStateOf("")
    }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.fillMaxWidth()){
                    Image(
                        painter = painterResource(id = R.drawable.background_image),
                        contentDescription ="",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(225.dp)
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
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Row(modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start) {
                            Text(text = stringResource(id = R.string.mytrips_categories),
                            modifier = Modifier.padding(top = 20.dp, start = 20.dp),
                            fontSize = 20.sp,
                                color = Color(86,84,84)
                                )
                            }
                            Row(modifier = Modifier.fillMaxWidth()) {
                                Card(
                                    modifier = Modifier
                                        .size(116.dp, 70.dp)
                                        .padding(top = 10.dp, start = 20.dp),
                                    shape = RoundedCornerShape(
                                        topStart = 8.dp,
                                        topEnd = 8.dp,
                                        bottomStart = 8.dp,
                                        bottomEnd = 8.dp
                                    ),
                                    backgroundColor = Color(
                                        red = 207,
                                        green = 6,
                                        blue = 240
                                    )

                                ) {
                                    Column(modifier = Modifier.fillMaxWidth(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(painter = painterResource(id = R.drawable.montain),
                                            contentDescription = "",
                                            modifier = Modifier.size(width = 32.dp, height = 32.dp)
                                        )
                                        
                                        Text(
                                            text = stringResource(id = R.string.mytrips_title_montain),
                                            fontSize = 14.sp,
                                            color = Color.White

                                        )
                                    }
                                }
                                Card(
                                    modifier = Modifier
                                        .size(116.dp, 70.dp)
                                        .padding(top = 10.dp, start = 20.dp),
                                    shape = RoundedCornerShape(
                                        topStart = 8.dp,
                                        topEnd = 8.dp,
                                        bottomStart = 8.dp,
                                        bottomEnd = 8.dp
                                    ),
                                    backgroundColor = Color(
                                        red = 234,
                                        green = 171,
                                        blue = 244
                                    )

                                ) {
                                    Column(modifier = Modifier.fillMaxWidth(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(painter = painterResource(id = R.drawable.snow),
                                            contentDescription = "",
                                            modifier = Modifier.size(width = 32.dp, height = 32.dp)
                                        )

                                        Text(
                                            text = stringResource(id = R.string.mytrips_title_snow),
                                            fontSize = 14.sp,
                                            color = Color.White

                                        )
                                    }
                                }
                                Card(
                                    modifier = Modifier
                                        .size(116.dp, 70.dp)
                                        .padding(top = 10.dp, start = 20.dp),
                                    shape = RoundedCornerShape(
                                        topStart = 8.dp,
                                        topEnd = 8.dp,
                                        bottomStart = 8.dp,
                                        bottomEnd = 8.dp
                                    ),
                                    backgroundColor = Color(
                                        red = 234,
                                        green = 171,
                                        blue = 244
                                    )

                                ) {
                                    Column(modifier = Modifier.fillMaxWidth(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally) {
                                        Image(painter = painterResource(id = R.drawable.beach),
                                            contentDescription = "",
                                            modifier = Modifier.size(width = 32.dp, height = 32.dp)
                                        )

                                        Text(
                                            text = stringResource(id = R.string.mytrips_title_beach),
                                            fontSize = 14.sp,
                                            color = Color.White

                                        )
                                    }
                                }
                            }

                            OutlinedTextField(
                                value = search,
                                onValueChange = {
                                    Log.i("Smartphone", it)
                                    search = it
                                },
                                label = { Text(text = stringResource(id = R.string.mytrips_search)) },
                                modifier = Modifier
                                    .padding(
                                        start = 23.dp,
                                        top = 33.dp,
                                        end = 40.dp
                                    )
                                    .fillMaxWidth(),
                                shape = RoundedCornerShape(16.dp),
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                                leadingIcon = {
                                    Image(
                                        painter = painterResource(id = R.drawable.search),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(26.dp)
                                    )
                                },
                            )
                        }
                    }
                }
            }
        }
    }
}