package com.konovalov.draggable.coin.view.compose

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.konovalov.draggable.coin.view.core.ui.theme.DraggableScaredViewTheme

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DraggableScaredViewTheme {
        Greeting("Android")
    }
}
