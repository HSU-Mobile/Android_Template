package com.jgeun.study.recyclerview_example

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jgeun.study.recyclerview_example.databinding.ItemAlarmBinding

class AlarmAdapter(private val alarmDataList: List<Alarm>) : RecyclerView.Adapter<AlarmAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemAlarmBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(alarm: Alarm) {
            binding.apply {
                alarmTimeText.text = alarm.time
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAlarmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(alarmDataList[position])
    }

    override fun getItemCount(): Int = alarmDataList.size

}