package com.jgeun.study.thread_example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jgeun.study.thread_example.basic.BasicActivity
import com.jgeun.study.thread_example.databinding.ActivityMainBinding
import com.jgeun.study.thread_example.game.GameActivity

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.basicBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, BasicActivity::class.java))
        }

        binding.gameBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, GameActivity::class.java))
        }
    }
}