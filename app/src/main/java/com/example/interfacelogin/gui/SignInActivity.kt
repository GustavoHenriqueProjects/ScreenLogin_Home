package com.example.interfacelogin.gui

import android.media.midi.MidiOutputPort
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfacelogin.R
import com.example.interfacelogin.dao.repository.ListCategories
import com.example.interfacelogin.model.CardCategories
import com.example.interfacelogin.ui.theme.InterfaceLoginTheme

class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InterfaceLoginTheme {
                InterfaceSignIn(
                    ListCategories.getListCategories()
                )
            }
        }
    }
}

@Composable
fun InterfaceSignIn(cards: List<CardCategories>) {
    var search by rememberSaveable {
        mutableStateOf("")
    }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.background_image),
                    contentDescription = "",
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
                    Text(
                        text = stringResource(id = R.string.mytrips_user),
                        fontSize = 18.sp,
                        modifier = Modifier.padding(end = 20.dp),
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(33.dp))
                    Column(
                        modifier = Modifier
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
                        Text(
                            text = stringResource(id = R.string.mytrips),
                            modifier = Modifier.padding(start = 53.dp),
                            fontSize = 23.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = stringResource(id = R.string.mytrips_categories),
                        modifier = Modifier.padding(top = 20.dp, start = 20.dp),
                        fontSize = 16.sp,
                        color = Color(86, 84, 84)
                    )
                }
                Column(modifier = Modifier.fillMaxWidth()) {
                    LazyRow() {
                        for (card in cards) {
                            item {
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
                                    Column(
                                        modifier = Modifier.fillMaxWidth(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            //(?:)Se nao ouver nenhuma imagem ele pega a imagem padrão
                                            painter = card.image
                                                ?: painterResource(id = R.drawable.montain),
                                            contentDescription = "",
                                            modifier = Modifier.size(width = 32.dp, height = 32.dp)
                                        )

                                        Text(
                                            text = card.cardtitle,
                                            fontSize = 14.sp,
                                            color = Color.White

                                        )
                                    }
                                }
                            }
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
            Column(modifier = Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = stringResource(id = R.string.mytrips_subtitle_post),
                        modifier = Modifier.padding(start = 23.dp),
                        fontSize = 16.sp,
                        color = Color(86, 84, 84)
                    )
                }
                CardsTrips(ListCategories.getListTrips())
            }
        }
    }
}

@Composable
fun CardsTrips(cards: List<CardCategories>) {
    Box{
        LazyColumn() {
            items(cards) { card ->
                Spacer(modifier = Modifier.height(6.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        modifier = Modifier.size(width = 355.dp, height = 223.dp),
                        shape = RoundedCornerShape(
                            topStart = 8.dp,
                            topEnd = 8.dp,
                            bottomStart = 8.dp,
                            bottomEnd = 8.dp
                        ),
                        elevation = 8.dp
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = card.image ?: painterResource(id = R.drawable.trip_london),
                                contentDescription = "",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(120.dp)
                                    .padding(start = 5.dp, top = 5.dp, end = 5.dp)
                            )
                            Text(
                                text = "${card.localTrip}, ${card.year}",
                                modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                                fontSize = 14.sp,
                                color = Color(207, 6, 240)
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = card.text,
                                modifier = Modifier.padding(start = 5.dp),
                                fontSize = 13.sp,
                                color = Color(160, 156, 156)
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Row(modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End) {
                                Text(text = "${card.month}",
                                    modifier = Modifier.padding(end = 13.dp),
                                fontSize = 12.sp,
                                color = Color(207, 6, 240))
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
        }
        Card(
            modifier = Modifier
                .offset(y = 200.dp, x = 310.dp)
                .size(height = 63.dp, width = 73.dp)
                .padding(top = 10.dp, start = 20.dp),
            shape = RoundedCornerShape(
                topStart = 100.dp,
                topEnd = 100.dp,
                bottomStart = 100.dp,
                bottomEnd = 100.dp
            ),
            backgroundColor = Color(
                red = 207,
                green = 6,
                blue = 240
            )

        ) {
            Image(painter = painterResource(id = R.drawable.add_24)
                ,contentDescription = "",
                 modifier = Modifier.size(3.dp),
                 colorFilter = ColorFilter.tint(Color.White)
            )
        }
    }
}
