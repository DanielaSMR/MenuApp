package com.example.menuapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Boton1Activity : AppCompatActivity() {

    private lateinit var viewSaludo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_boton1)
    }

    private fun initComponents(){
        viewSaludo = findViewById(R.id.saludo)
    }

    private fun setTexto(){
        viewSaludo.text = "Hola"
    }

}