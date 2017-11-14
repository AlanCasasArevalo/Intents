package com.example.alancasas.intentsexamples.Activities

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.alancasas.intentsexamples.R

class PhoneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone)

        //Activamos la flecha para ir hacia atras
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val phoneButton : Button = findViewById(R.id.phone_button)

        //Sin permisos requeridos
        phoneButton.setOnClickListener {
            val intentPhone = Intent(Intent.ACTION_DIAL, Uri.parse("tel:679099135"))
            startActivity(intentPhone)
        }

    }
}
