package com.konovalov.draggable.coin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val navController
        get() = findNavController(R.id.nav_host_fragment_content_main)
}
