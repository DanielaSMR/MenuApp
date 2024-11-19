package com.example.menuapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class Boton3Activity : AppCompatActivity() {

    private lateinit var viewSaludo : TextView
    private var name : String = "Daniela"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_boton3)
        initComponents()

        if (name.isNotEmpty()) {
            Snackbar.make(viewSaludo,"Hola $name!", Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun initComponents(){
        viewSaludo = findViewById(R.id.saludo3)
    }
}