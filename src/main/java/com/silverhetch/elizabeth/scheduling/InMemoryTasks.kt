package com.silverhetch.elizabeth.scheduling

class InMemoryTasks : Tasks {
    private val tasks = ArrayList<Task>()

    override fun all(): Array<Task> {
        return tasks.toArray(Array(tasks.size, { tasks[it] }))
    }

    override fun push(task: Task) {
        tasks.add(task)
    }
}