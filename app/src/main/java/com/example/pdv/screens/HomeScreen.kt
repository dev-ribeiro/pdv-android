package com.example.pdv.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pdv.ui.theme.Gray100
import com.example.pdv.ui.theme.Sky500

@Composable
fun HomeScreen() {
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

        Box() {
            Text(text = "Não há produtos")
        }
    }
}