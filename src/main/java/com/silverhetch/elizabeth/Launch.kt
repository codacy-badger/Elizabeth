package com.silverhetch.elizabeth

import com.silverhetch.elizabeth.scheduling.FixTimeSchedule
import com.silverhetch.elizabeth.scheduling.FixTimeTask
import com.silverhetch.elizabeth.scheduling.InMemoryTasks
import java.util.concurrent.TimeUnit.*

fun main(args: Array<String>) {
    FixTimeSchedule(
      InMemoryTasks(listOf(
        FixTimeTask(WeatherUpdate(), HOURS.toMillis(1))
      )), MINUTES.toMillis(1)
    ).start()
}