package com.example.prakt7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val handler= Handler()
        handler.postDelayed({start()},1000)
    }
    fun start(){
        val intent= Intent(this,Prak2Activity::class.java)
        startActivity(intent)

    }
}
