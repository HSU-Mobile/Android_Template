package com.jgeun.study.sharedpreferences_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jgeun.study.sharedpreferences_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.editText.setText(MyApplication.preferenceUtil.getString("editTextData", ""))
    }


    override fun onStop() {
        super.onStop()

        MyApplication.preferenceUtil.setString("editTextData", binding.editText.text.toString())
    }
}