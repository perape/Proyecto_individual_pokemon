package edu.itesm.proyecto_individual_pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class Introduccion_app : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduccion_app)
        Handler().postDelayed({

            startActivity(Intent(this,MainActivity::class.java))

            // close this activity
            finish()
        }, 3000)



    }
}