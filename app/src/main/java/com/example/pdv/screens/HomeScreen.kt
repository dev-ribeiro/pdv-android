package com.example.pdv.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.pdv.ui.theme.Gray100
import com.example.pdv.ui.theme.Green500
import com.example.pdv.ui.theme.Sky500

@Composable
fun HomeScreen(navController: NavController) {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Sky500)
                .padding(vertical = 12.dp, horizontal = 4.dp)
        ) {
            Text(
                text = "PDV Mobile",
                color = Gray100,
                fontSize = 24.sp
            )
        }

        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            Column {
                Box(
                    modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Não há produtos")
                }

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(100.dp)
                        .align(Alignment.End)
                ) {
                    Spacer(modifier = Modifier.fillMaxWidth())
                    Box(
                        modifier = Modifier.requiredWidth(150.dp)
                    ) {
                        Button(
                            onClick = {navController.navigate("product")},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Green500
                            )
                        ) {
                            Text(text = "+")
                        }
                    }
                }
            }
        }
    }
}