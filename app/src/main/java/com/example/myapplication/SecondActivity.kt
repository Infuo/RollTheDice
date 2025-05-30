package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        val msg = intent.getStringExtra("MESSAGE")
        val textView = findViewById<TextView>(R.id.textViewActivitySecond)
        textView.text = msg

        val btnResult = findViewById<Button>(R.id.btnResult)
        val imageViewSecond = findViewById<ImageView>(R.id.imageViewActivitySecond)

        val random = intent.getIntExtra("RANDOM", -1)

        val resource = when (random) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            6 -> R.drawable.dice_face_6
            else -> R.drawable.dices
        }
        imageViewSecond.setImageResource(resource)
        Log.d("SECOND", "FINITO DISEGNO DADO: $random")

        btnResult.setOnClickListener {
            val toast = Toast.makeText(this, "Ecco il risultato", Toast.LENGTH_SHORT)
            toast.show()
            Log.d("SECOND", "RISULTATO")
            val newIntent = Intent (this, ThirdActivity::class.java)
            newIntent.putExtra("random", random)
            startActivity(newIntent)
        }
    }
}