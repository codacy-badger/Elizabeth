package com.silverhetch.elizabeth

import com.silverhetch.elizabeth.scheduling.FixTimeSchedule
import com.silverhetch.elizabeth.scheduling.FixTimeTask
import com.silverhetch.elizabeth.scheduling.InMemoryTasks

fun main(args: Array<String>) {
    FixTimeSchedule(
      InMemoryTasks(listOf(
        FixTimeTask(WeatherUpdation(), 5000)
      )), 500L
    ).start()
}