package com.silverhetch.elizabeth.scheduling

class FixTimeTask(private val runnable: Runnable, private val interval: Long) : Task {
    private var lastTime = 0L

    override fun run() {
        val current = System.currentTimeMillis()
        if (current > lastTime + interval) {
            lastTime = current
            runnable.run()
        }
    }

}