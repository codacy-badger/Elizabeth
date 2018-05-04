package com.silverhetch.elizabeth.scheduling

import org.junit.Assert.*
import org.junit.Test

class InMemoryTasksTest {
    @Test
    fun create() {
        val tasks = InMemoryTasks(ArrayList())
        tasks.push(EmptyTask())
        assertEquals(1, tasks.all().size)
    }

    @Test
    fun same() {
        val tasks = InMemoryTasks(ArrayList())
        val emptyTask = EmptyTask()
        tasks.push(emptyTask)
        assertEquals(emptyTask, tasks.all()[0])
    }
}