package com.jgeun.study.thread_example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.jgeun.study.thread_example.databinding.ActivityBasicBinding
import kotlinx.coroutines.delay
import java.lang.Thread.sleep
import kotlin.concurrent.thread

class BasicActivity : AppCompatActivity() {

    private val binding by lazy { ActivityBasicBinding.inflate(layoutInflater) }
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        thread(start = true) {
            var num = 0
            while (true) {
                num += 1
                runOnUiThread {
                    binding.textByOne.text = num.toString()
                }
                sleep(1000L)
            }
        }

        thread(start = true) {
            var num = 0
            while (true) {
                num += 2
                runOnUiThread {
                    binding.textByTwo.text = num.toString()
                }
                sleep(1000L)
            }
        }
    }
}