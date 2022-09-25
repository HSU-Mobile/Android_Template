package com.hsu.mobile.lifecycle_example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val TAG = "Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Main onCreate")

        findViewById<Button>(R.id.next_btn).setOnClickListener {
            startActivity(Intent(this, NextActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Main onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Main onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Main onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Main onStop")
    }

    override fun onDestroy() {
        Log.d(TAG, "Main onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Main onRestart")
    }
}