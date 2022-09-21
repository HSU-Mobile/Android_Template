package com.hsu.mobile.layout_study

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomNumText = findViewById<TextView>(R.id.randomNum)
        val myNumText = findViewById<TextView>(R.id.myNum)
        val btnUp = findViewById<Button>(R.id.btnUp)
        val btnDown = findViewById<Button>(R.id.btnDown)
        val pass = findViewById<Button>(R.id.pass)

        val range = (1..10)  // 1 <= n <= 10
        val randomNum = range.random()
        randomNumText.text = randomNum.toString()

        var myNum = 0
        myNumText.text = myNum.toString()

        btnUp.setOnClickListener {
            myNum += 1
            myNumText.text = myNum.toString()
        }
        btnDown.setOnClickListener {
            myNum -= 1
            myNumText.text = myNum.toString()
        }

        pass.setOnClickListener {
            Log.d("MainActivity", "$myNum $randomNum")
            if (myNum == randomNum) {
                startActivity(Intent(this, PassActivity::class.java))
            } else {
                Toast.makeText(this, "숫자가 다릅니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}