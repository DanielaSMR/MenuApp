package com.example.menuapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    private lateinit var viewBtn1 : AppCompatButton
    private lateinit var viewBtn2 : AppCompatButton
    private lateinit var viewBtn3 : AppCompatButton
    private lateinit var viewBtn4 : AppCompatButton
    private lateinit var viewBtn5 : AppCompatButton
    private lateinit var viewTv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        initComponents()
        initListeners()
    }

    private fun initListeners(){
        viewBtn1.setOnClickListener{
            val intentGA = Intent(this, Boton1Activity::class.java)
            startActivity(intentGA)
        }
        viewBtn2.setOnClickListener{
            val intentGA = Intent(this, Boton2Activity::class.java)
            startActivity(intentGA)
        }
        viewBtn3.setOnClickListener{
            val intentGA = Intent(this, Boton3Activity::class.java)
            startActivity(intentGA)
        }
        viewBtn4.setOnClickListener{
            finish()
        }
        viewBtn5.setOnClickListener{
            if(viewTv.getVisibility() == View.VISIBLE){
                viewTv.setVisibility(View.GONE);
            }else{
                viewTv.setVisibility(View.VISIBLE);
            }
        }
    }


    private fun initComponents(){
        viewBtn1 = findViewById(R.id.boton1)
        viewBtn2 = findViewById(R.id.boton2)
        viewBtn3 = findViewById(R.id.boton3)
        viewBtn4 = findViewById(R.id.boton4)
        viewBtn5 = findViewById(R.id.boton5)
        viewTv = findViewById(R.id.tv)
    }
}