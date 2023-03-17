package com.konovalov.draggable.coin.view

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val navController
        get() = findNavController(R.id.nav_host_fragment_content_main)
}
