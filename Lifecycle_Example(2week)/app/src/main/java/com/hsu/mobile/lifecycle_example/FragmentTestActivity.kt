package com.hsu.mobile.lifecycle_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class FragmentTestActivity : AppCompatActivity() {

    companion object {
        const val TAG = "FragmentTestActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_test)
        Log.d(TAG, "Fa onCreate")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_view, TestFragment.newInstance())
            .commit()

        findViewById<Button>(R.id.fragment_test1_add_btn).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_view, TestFragment.newInstance())
                .commit()
        }

        findViewById<Button>(R.id.fragment_test2_add_btn).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_view, Test2Fragment.newInstance())
                .commit()
        }

        findViewById<Button>(R.id.fragment_test3_replace_btn).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_view, Test3Fragment.newInstance())
                .commit()
        }

        findViewById<Button>(R.id.fragment_test2_backstack_btn).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_view, TestFragment.newInstance())
                .addToBackStack("TEST1")
                .commit()
        }

        findViewById<Button>(R.id.fragment_test2_backstack_btn).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_view, Test2Fragment.newInstance())
                .addToBackStack("TEST2")
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Fa onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Fa onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Fa onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Fa onStop")
    }

    override fun onDestroy() {
        Log.d(TAG, "Fa onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Fa onRestart")
    }
}