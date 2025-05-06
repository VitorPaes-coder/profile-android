package br.senai.sp.jandira.android.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

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
            ) {
                Row {
                    Button(
                        onClick = {}
                    ) {}
                    Text(
                        text = ""
                    )
                }

                Column {
                    //Image(
                    //painter = painterResource(0)
                    //)
                    Text(
                        text = ""
                    )
                    Text(
                        text = ""
                    )
                }

                Row {
                    Button(
                        onClick = {}
                    ) {
                        Column {

                        }
                    }

                    Button(
                        onClick = {}
                    ) {
                        Column {

                        }
                    }

                    Button(
                        onClick = {}
                    ) {
                        Column {

                        }
                    }

                    Button(
                        onClick = {}
                    ) {
                        Column {

                        }
                    }
                }
            }
        }

        Column {}
        Column {}
        Column {}
        Column {
            Row { }
        }
    }

}


@Composable
@Preview
private fun ProfileScreenPreview() {
    ProfileScreen()
}