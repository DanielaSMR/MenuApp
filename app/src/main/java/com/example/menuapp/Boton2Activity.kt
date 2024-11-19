package com.example.menuapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Boton2Activity : AppCompatActivity() {

    private lateinit var viewSaludo : TextView
    private var name : String = "Daniela"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_boton2)
        initComponents()

        Toast.makeText(this, "Hola $name!",
            Toast.LENGTH_LONG).show()
    }

    private fun initComponents(){
        viewSaludo = findViewById(R.id.saludo2)
    }


}