package com.silverhetch.elizabeth.scheduling

import java.util.*

class FixTimeSchedule(private val tasks: Tasks, private val delay: Long = 60000L) : Schedule {
    private val timer = Timer()

    override fun start() {
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                tasks.all().forEach {
                    it.run()
                }
            }
        }, delay, delay)
    }

    override fun stop() {
        timer.cancel()
    }
}