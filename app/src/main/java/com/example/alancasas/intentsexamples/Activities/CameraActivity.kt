package com.example.alancasas.intentsexamples.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.alancasas.intentsexamples.R

class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        //Activamos la flecha para ir hacia atras
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val cameraButton : Button = findViewById(R.id.camera_button)

        cameraButton.setOnClickListener {
            val intentCamera = Intent("android.media.action.IMAGE_CAPTURE")
            startActivity(intentCamera)

        }

    }

}
