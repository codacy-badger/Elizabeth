package com.silverhetch.elizabeth.scheduling

interface Tasks {
    fun all(): Array<Task>
    fun push(task: Task)
}