package com.example.alancasas.intentsexamples.Activities

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.alancasas.intentsexamples.R

class EmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        //Activamos la flecha para ir hacia atras
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val alanEmail = "trasgo13@hotmail.com"
        val alanEmail2 = "alancasasarevalo@gmail.com"

        val emailButton : Button = findViewById(R.id.email_button)

        val emailCorrectButton : Button = findViewById(R.id.email_button_correcto)



        val emailArray = arrayListOf<String>(alanEmail,alanEmail2)

        emailButton.setOnClickListener {
            val intentFastMail = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"+alanEmail))
            startActivity(intentFastMail)
        }

        //Hacemos que podamos elegir el cliente de correo que queremos usar para mandar el correo, gmail, outlook etc.
        emailCorrectButton.setOnClickListener {
            val intentMail = Intent(Intent.ACTION_SEND, Uri.parse(alanEmail))
            intentMail.type = "plain/text"
            intentMail.putExtra(Intent.EXTRA_SUBJECT, "Mail's title")
            intentMail.putExtra(Intent.EXTRA_TEXT, "Hola majo soy un email")
            intentMail.putExtra(Intent.EXTRA_EMAIL, emailArray)
            startActivity(Intent.createChooser(intentMail, "Elige con que cliente mandamos el correo"))
        }

    }
}





















