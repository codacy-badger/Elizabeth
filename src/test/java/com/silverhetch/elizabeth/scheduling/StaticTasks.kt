package com.silverhetch.elizabeth.scheduling

class StaticTasks(private val tasks: Array<Task>) : Tasks {
    override fun all(): Array<Task> {
        return tasks
    }

    override fun push(task: Task) {
        throw RuntimeException("Runtime only")
    }
}