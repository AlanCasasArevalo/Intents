package com.example.alancasas.intentsexamples.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.alancasas.intentsexamples.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Forzar y cargar el icono en el Action Bar
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon(R.mipmap.ic_myicon)

    }
}
