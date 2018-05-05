package com.silverhetch.elizabeth.scheduling

import org.junit.Assert.assertEquals
import org.junit.Test

class FixTimeTaskTest {
    @Test
    fun notTriggerEveryTime() {
        var triggeredCount = 0
        val task = FixTimeTask(Runnable {
            triggeredCount++
        }, 100)
        task.run()
        task.run()
        assertEquals(1, triggeredCount)
    }
}