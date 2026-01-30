package com.victor.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Access Res folder

        val changeActivityButton = findViewById<Button>(R.id.secondActivityButton);
        changeActivityButton.setOnClickListener{
            val changeActivity = Intent(this, SecondActivity::class.java);
            startActivity(changeActivity);
        }
    }
}