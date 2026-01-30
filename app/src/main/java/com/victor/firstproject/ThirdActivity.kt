package com.victor.firstproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class ThirdActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity) //Access Res folder

        val toastButton = findViewById<Button>(R.id.thirdActivityFirstButton);
        toastButton.setOnClickListener{
            val text = "Boto apretat Toast";
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this, text, duration);
            toast.show();
        }
        val logcatButton = findViewById<Button>(R.id.thirdActivitySecondButton);
        logcatButton.setOnClickListener{
            Log.d("TAG", "boto apretat Logcat");
        }
    }
}