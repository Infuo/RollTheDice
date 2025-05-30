package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        var textViewActivityThird = findViewById<TextView>(R.id.textViewActivityThird)
        var imageViewActivityThird = findViewById<ImageView>(R.id.imageViewActivityThird)
        var random = intent.getIntExtra("random", -1)

        if (random % 2 !=0){
            textViewActivityThird.text = "Hai vinto"
            imageViewActivityThird.setImageResource(R.drawable.trofeo)
        }else{
            textViewActivityThird.text = "Hai perso"
            imageViewActivityThird.setImageResource(R.drawable.perso)
        }
    }
}