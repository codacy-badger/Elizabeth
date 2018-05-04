package com.silverhetch.elizabeth.scheduling

class TasksRunnable(private val tasks: Tasks) : Runnable {
    override fun run() {
        tasks.all().forEach { task ->
            task.run()
        }
    }
}