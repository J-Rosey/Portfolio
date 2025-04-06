package com.example.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment2.ui.theme.Assignment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Calculator(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Calculator(modifier: Modifier = Modifier) {
    // Creation of variables
    var ans by remember { mutableStateOf("Result Goes Here")}
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var sel by remember { mutableStateOf("") }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.LightGray),
        // Centering
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Title display
        Text (
            text = "Calculator",
            // Font size
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Result display
        Text (
            // Default is "Result Goes Here", changes when calculation is made to show result
            text = ans,
            // Font size
            style = MaterialTheme.typography.headlineSmall,
            // Extra Centering in case equation spills to second line, would left-align otherwise
            textAlign = TextAlign.Center
        )
        Row (
            // Centers row children horizontally
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(16.dp)
        ) {
            TextField (
                // Var for textfield
                value = num1,
                // Takes whatever is entered in textfield (it) and writes it to num1
                onValueChange = { num1 = it },
                label = { Text("First Number:") },
                // Sets width proportional to its weight (1f) relative to other weighted siblings in the row
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(8.dp))

            TextField (
                value = num2,
                onValueChange = { num2 = it },
                label = { Text("Second Number:") },
                // Weight is set to a 1:1 ratio with num1 textfield
                modifier = Modifier.weight(1f)
            )
        }
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        ) {
            Button (
                onClick = {
                    // Sets sel variable to "plus" for when function in calc()
                    sel = "plus"
                    // Calls calc() with num1, num2, and sel, and returns ans via lambda callback
                    calc(num1, num2, sel) { result -> ans = result }
                },
                modifier = Modifier.weight(1f)
            ) {
                Text (
                    text = "+",
                    style = MaterialTheme.typography.headlineLarge
                )
            }

            Spacer(modifier = Modifier.width(4.dp))

            Button (
                onClick = {
                    sel = "minus"
                    calc(num1, num2, sel) { result -> ans = result }
                },
                modifier = Modifier.weight(1f)
            ) {
                Text (
                    text = "–",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 120.dp)
        ) {
            Button (
                onClick = {
                    sel = "multiply"
                    calc(num1, num2, sel) { result -> ans = result }
                },
                modifier = Modifier.weight(1f)
            ) {
                Text (
                    text = "x",
                    style = MaterialTheme.typography.headlineLarge
                )
            }

            Spacer(modifier = Modifier.width(4.dp))

            Button (
                onClick = {
                    sel = "divide"
                    calc(num1, num2, sel) { result -> ans = result }
                },
                modifier = Modifier.weight(1f)
            ) {
                Text (
                    text = "÷",
                    style = MaterialTheme.typography.headlineLarge
                )
            }
        }
    }
}

fun calc(num1: String, num2: String, sel: String, ans: (String) -> Unit) {
    // toFloatOrNull sets all numbers to floats and everything else to null, weeding out NaNs
    val n1 = num1.toFloatOrNull()
    val n2 = num2.toFloatOrNull()

    // If to catch nulls; proceeding only if neither num is null
    if (n1 != null && n2 != null) {
        // Kotlin's equivalent of a switch-case, uses string in sel to make selection and write result to var result
        val result = when (sel) {
            "plus" -> { "$n1 + $n2 = " + (n1 + n2) }
            "minus" -> { "$n1 – $n2 = " + (n1 - n2) }
            "multiply" -> { "$n1 x $n2 = " + (n1 * n2) }
            // If in divide to catch if either num is 0 (f in 0f to treat 0 as a float)
            "divide" -> { if (n1 != 0f && n2 != 0f) {
                            "$n1 ÷ $n2 = " + (n1 / n2)
                        } else { "Dividing by zero is not allowed." }}
            else -> "Error Detected."
        }
        // Writes value in var result to ans, overwriting previous value
        ans(result)
    } else {
        // Writes "Invalid Result." to ans, overwriting previous value
        ans("Invalid Input.")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment2Theme {
        Calculator()
    }
}