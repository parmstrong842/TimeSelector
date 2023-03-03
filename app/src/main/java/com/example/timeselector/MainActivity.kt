package com.example.timeselector

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.timeselector.ui.theme.TimeSelectorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimeSelectorTheme {

                val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

                Box {
                    Spacer(modifier = Modifier
                        .align(Alignment.TopCenter)
                        .fillMaxWidth()
                        .height(75.dp)
                        .drawBehind {
                            drawRect(Color.Gray)
                        })
                    Spacer(modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .height(75.dp)
                        .drawBehind {
                            drawRect(Color.Gray)
                        })
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(30.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentSize()
                    ) {
                        LazyColumn(modifier = Modifier.height(200.dp)) {
                            items(list) {
                                Text(
                                    text = it.toString(),
                                    fontSize = 36.sp
                                )
                            }
                        }
                        Text(
                            text = ":",
                            fontSize = 40.sp
                        )
                        LazyColumn(modifier = Modifier.height(200.dp)) {
                            items(list) {
                                Text(
                                    text = it.toString(),
                                    fontSize = 36.sp
                                )
                            }
                        }
                        Text(
                            text = ":",
                            fontSize = 40.sp
                        )
                        LazyColumn(modifier = Modifier.height(200.dp)) {
                            items(list) {
                                Text(
                                    text = it.toString(),
                                    fontSize = 36.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
