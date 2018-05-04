package com.silverhetch.elizabeth.scheduling

import org.junit.Assert
import org.junit.Test

class TasksRunnableTest {
    @Test
    fun simple() {
        val taskCount = 2
        var triggeredCount = 0
        TasksRunnable(StaticTasks(Array(taskCount, {
            object : Task {
                override fun run() {
                    triggeredCount++
                }
            }
        }))).run()

        Assert.assertEquals(taskCount, triggeredCount)
    }
}