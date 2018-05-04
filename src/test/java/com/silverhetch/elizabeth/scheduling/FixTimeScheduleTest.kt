package com.silverhetch.elizabeth.scheduling

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit.MILLISECONDS

class FixTimeScheduleTest {
    @Test
    fun simple() {
        val countDown = CountDownLatch(3)
        FixTimeSchedule(StaticTasks(
          arrayOf(object : Task {
              override fun run() {
                  countDown.countDown()
              }
          })
        ), 10L).start()
        countDown.await(10000, MILLISECONDS)
        assertEquals(0, countDown.count)
    }
}