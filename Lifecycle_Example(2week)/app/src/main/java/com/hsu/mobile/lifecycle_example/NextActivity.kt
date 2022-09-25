package com.hsu.mobile.lifecycle_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NextActivity : AppCompatActivity() {
    private val TAG = "Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        Log.d(TAG, "Next onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Next onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Next onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Next onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Next onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Next onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Next onRestart")
    }
}