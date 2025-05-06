package br.senai.sp.jandira.android.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.android.R

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            ) {
                /**Image(
                    painter = painterResource(id = R.drawable.fundo),
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )
                **/

                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 10.dp, end = 10.dp, top = 30.dp, bottom = 20.dp)
                ) {
                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(30.dp)
                    ){
                        IconButton(
                            colors = IconButtonDefaults.iconButtonColors(
                                Color.Transparent
                            ),
                            onClick = {},
                            modifier = Modifier
                                .size(40.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = "",
                                tint = Color.Black
                            )
                        }
                        Text(
                            text = "Details",
                            modifier = Modifier.padding(start = 120.dp),
                            fontSize = 16.sp,
                            color = Color.Black
                        )
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Card (
                            shape = androidx.compose.foundation.shape.CircleShape,
                            modifier = Modifier.size(80.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.avatar),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                        }

                        Text(
                            text = "Jenny Wilson",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Sr.UI/UX Designer",
                            fontSize = 12.sp,
                            color = Color.Gray

                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,

                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Button(
                            onClick = {},
                            shape = androidx.compose.foundation.shape.RoundedCornerShape(6.dp),
                            modifier = Modifier
                                .width(80.dp)
                                .height(60.dp)
                            ) {
                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxSize()
                            ){
                                Icon(
                                    imageVector = Icons.Filled.Email,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Email",
                                    fontSize = 10.sp,
                                    color = Color.Gray
                                )
                            }
                        }

                        Button(
                            onClick = {},
                            shape = androidx.compose.foundation.shape.RoundedCornerShape(6.dp),
                            modifier = Modifier
                                .width(80.dp)
                                .height(60.dp)
                        ) {
                            Column {
                                Icon(
                                    imageVector = Icons.Filled.Call,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Call",
                                    fontSize = 10.sp,
                                    color = Color.Gray
                                )
                            }
                        }

                        Button(
                            onClick = {},
                            shape = androidx.compose.foundation.shape.RoundedCornerShape(6.dp),
                            modifier = Modifier
                                .width(80.dp)
                                .height(60.dp)
                        ) {
                            Column {
                                Icon(
                                    imageVector = Icons.Filled.Whatsapp,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Whatsapp",
                                    fontSize = 7.sp,
                                    color = Color.Gray
                                )
                            }
                        }

                        Button(
                            onClick = {},
                            shape = androidx.compose.foundation.shape.RoundedCornerShape(6.dp),
                            modifier = Modifier
                                .width(80.dp)
                                .height(60.dp)
                        ) {
                            Column {
                                Icon(
                                    imageVector = Icons.Outlined.Star,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Favorite",
                                    fontSize = 8.sp,
                                    color = Color.Gray
                                )
                            }
                        }
                    }
                }
            }

            Column(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                Column {
                    Row { }
                }
                Column {}
                Column {}
                Column {
                    Row {
                        //Image(
                        //painter = painterResource(0)
                        //)
                        Text(
                            text = ""
                        )

                    }

                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        Button(
                            onClick = {}
                        ) {
                            Icon(
                                imageVector = Icons.Filled.PersonAdd,
                                contentDescription = ""
                            )
                            Text(
                                text = "Add to contact"
                            )
                        }
                        Button(
                            onClick = {}
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Share,
                                contentDescription = ""
                            )
                        }
                    }
                }
            }

        }
    }
}


@Composable
@Preview
private fun ProfileScreenPreview() {
    ProfileScreen()
}