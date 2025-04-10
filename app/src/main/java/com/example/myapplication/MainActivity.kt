package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btnRoll :Button = findViewById(R.id.buttonRoll)
        btnRoll.setOnClickListener(View.OnClickListener {
        var toast = Toast.makeText(this, "LANCIO DEL DADO", Toast.LENGTH_LONG)
        toast.show()
        var newIntent : Intent = Intent (this, SecondActivity::class.java)
        var myRandom= (1..6).random()
        newIntent.putExtra("Message", "NUMERO ESTRATTO: $myRandom")
            newIntent.putExtra("Random", myRandom)
        startActivity(newIntent)
        })
    }
}