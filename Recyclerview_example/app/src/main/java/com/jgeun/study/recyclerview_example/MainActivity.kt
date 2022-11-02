package com.jgeun.study.recyclerview_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jgeun.study.recyclerview_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val alarmDataList = mutableListOf<Alarm>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initialList()

        binding.recyclerview.apply {
            setHasFixedSize(true)
            adapter = AlarmAdapter(alarmDataList.toList())
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun initialList() {
        with(alarmDataList) {
            add(Alarm("09:00"))
            add(Alarm("10:00"))
            add(Alarm("11:00"))
            add(Alarm("12:00"))
            add(Alarm("13:00"))
            add(Alarm("14:00"))
            add(Alarm("15:00"))
            add(Alarm("16:00"))
            add(Alarm("17:00"))
            add(Alarm("18:00"))
            add(Alarm("19:00"))
            add(Alarm("20:00"))
            add(Alarm("21:00"))
            add(Alarm("22:00"))
            add(Alarm("23:00"))
            add(Alarm("00:00"))
            add(Alarm("15:00"))
            add(Alarm("16:00"))
            add(Alarm("17:00"))
            add(Alarm("18:00"))
            add(Alarm("19:00"))
            add(Alarm("20:00"))
            add(Alarm("21:00"))
            add(Alarm("22:00"))
            add(Alarm("23:00"))
            add(Alarm("00:00"))
            add(Alarm("15:00"))
            add(Alarm("16:00"))
            add(Alarm("17:00"))
            add(Alarm("18:00"))
            add(Alarm("19:00"))
            add(Alarm("20:00"))
            add(Alarm("21:00"))
            add(Alarm("22:00"))
            add(Alarm("23:00"))
            add(Alarm("00:00"))
            add(Alarm("15:00"))
            add(Alarm("16:00"))
            add(Alarm("17:00"))
            add(Alarm("18:00"))
            add(Alarm("19:00"))
            add(Alarm("20:00"))
            add(Alarm("21:00"))
            add(Alarm("22:00"))
            add(Alarm("23:00"))
            add(Alarm("00:00"))
            add(Alarm("15:00"))
            add(Alarm("16:00"))
            add(Alarm("17:00"))
            add(Alarm("18:00"))
            add(Alarm("19:00"))
            add(Alarm("20:00"))
            add(Alarm("21:00"))
            add(Alarm("22:00"))
            add(Alarm("23:00"))
            add(Alarm("00:00"))
        }
    }
}