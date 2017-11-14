package com.example.alancasas.intentsexamples.Activities

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.alancasas.intentsexamples.R

class ContactsIntent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        //Activamos la flecha para ir hacia atras
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val contactsButton: Button = findViewById(R.id.contact_button)

        contactsButton.setOnClickListener {
            val contactIntent = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"))
            startActivity(contactIntent)
        }

    }
}
