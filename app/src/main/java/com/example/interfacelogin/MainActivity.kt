package com.example.interfacelogin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfacelogin.ui.theme.InterfaceLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InterfaceLoginTheme {

                InterfaceLoginScreen()

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun InterfaceLoginScreen() {

    var login_email by rememberSaveable {
        mutableStateOf("")
    }

    var login_password by rememberSaveable {
        mutableStateOf("")
    }

    /******************************************************************
     * O Context é uma classe que fornece acesso a recursos do sistema,
     * como serviços, atividades e layouts.
     *
     * LocalContext é uma forma de armazenar o Context atual em um
     * local acessível aos componentes Compose.
     *
     * current é uma propriedade estatica que retorna o contexto
     * associado ao Compose. Isso é usado para abrir outra tela.
     ********************************************************************/
    var context = LocalContext.current

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {

                Column(
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp)
                        .background(
                            color = Color(207, 6, 240),
                            shape = RoundedCornerShape(bottomStart = 20.dp)
                        )
                )
                {
                }
            }
            Spacer(modifier = Modifier.height(80.dp))

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                )
                {

                    Text(
                        text = stringResource(id = R.string.title),
                        modifier = Modifier
                            .padding(start = 23.dp),
                        fontSize = 50.sp,
                        color = Color(207, 6, 240),
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = stringResource(id = R.string.sub_title),
                        modifier = Modifier
                            .padding(start = 23.dp),
                        fontSize = 20.sp,
                        color = Color.Gray,
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {
                    OutlinedTextField(
                        value = login_email,
                        onValueChange = {
                            Log.i("Smartphone", it)
                            login_email = it
                        },
                        label = { Text(text = stringResource(id = R.string.email)) },
                        modifier = Modifier
                            .padding(
                                start = 23.dp,
                                top = 33.dp,
                                end = 40.dp
                            )
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.email),
                                contentDescription = "",
                                modifier = Modifier.size(26.dp)
                            )
                        },
                        //textStyle = MaterialTheme.typography.body1.copy(color = Color.Black),
                        // placeholder = { Text(text = "Email") }
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    OutlinedTextField(
                        value = login_password,
                        onValueChange = {
                            Log.i("Smartphone", it)
                            login_password = it
                        },
                        label = { Text(text = stringResource(id = R.string.password)) },
                        modifier = Modifier
                            .padding(
                                start = 23.dp,
                                top = 33.dp,
                                end = 40.dp
                            )
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        visualTransformation = PasswordVisualTransformation(),
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.seguranca),
                                contentDescription = "",
                                modifier = Modifier.size(33.dp)
                            )
                        },
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                )
                {
                    Button(
                        onClick = {
                            val openScreenSignIn =
                                Intent(context, SignInActivity::class.java)
                            context.startActivity(openScreenSignIn)
                        },
                        modifier = Modifier
                            .width(200.dp)
                            .padding(end = 40.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(207, 6, 240))

                    ) {
                        Text(
                            text = stringResource(id = R.string.button),
                            modifier = Modifier.padding(10.dp),
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = stringResource(id = R.string.account),
                            fontSize = 20.sp,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = stringResource(id = R.string.signUp),
                            modifier = Modifier
                                .padding(end = 40.dp)

                                /*****************************************************
                                 *  Intent cria um novo objeto e especifica para abrir
                                 *   uma outra tela
                                 ******************************************************/
                                .clickable {
                                    val openScreenSignUp =
                                        Intent(context, MainActivitySignUp::class.java)
                                    context.startActivity(openScreenSignUp)
                                },
                            fontSize = 20.sp,
                            color = Color(207, 6, 240),
                        )
                    }
                }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.Start
                ) {
                    Column(
                        modifier = Modifier
                            .width(150.dp)
                            .height(50.dp)
                            .background(
                                color = Color(207, 6, 240),
                                shape = RoundedCornerShape(topEnd = 20.dp)
                            )
                    )
                    {
                    }
                }
            }
        }
    }
}