package com.victor.firstproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity) //Access Res folder
        val changeActivityButton = findViewById<Button>(R.id.thirdNavigationButton);
        changeActivityButton.setOnClickListener{
            val changeActivity = Intent(this, ThirdActivity::class.java);
            startActivity(changeActivity);
        }
    }
}