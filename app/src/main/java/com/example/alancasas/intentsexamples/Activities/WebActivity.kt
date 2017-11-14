package com.example.alancasas.intentsexamples.Activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import com.example.alancasas.intentsexamples.R

class WebActivity : AppCompatActivity() {

    var webButton: Button? = null

    var editText : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        //Activamos la flecha para ir hacia atras
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        editText = findViewById(R.id.edit_text_web)
        webButton = findViewById(R.id.button_to_web)

        webButton?.setOnClickListener {

            var url = editText?.text.toString()

            if (url != null && !url.isEmpty()){
                val intentWeb = Intent()
                intentWeb.setAction(Intent.ACTION_VIEW)
                intentWeb.setData(Uri.parse("http://" + url))
                startActivity(intentWeb)
            }

        }


    }
}
