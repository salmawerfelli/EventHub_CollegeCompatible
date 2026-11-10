package com.example.eventhub.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HelpScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        OutlinedButton(onClick = onBack) { Text("Back") }

        Text("Help", style = MaterialTheme.typography.headlineMedium)

        Text("Adding an event", style = MaterialTheme.typography.titleLarge)
        Text("1. Tap Browse events on the Welcome screen.")
        Text("2. Tap Add event.")
        Text("3. Enter the title, category, date, location, description, price and places.")
        Text("4. Tap Save.")

        Text("Deleting an event", style = MaterialTheme.typography.titleLarge)
        Text("1. Find the event in the list.")
        Text("2. Tap Delete beside it.")
        Text("3. Tap Delete again to confirm, or Cancel to keep it.")
    }
}