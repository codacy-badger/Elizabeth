package com.silverhetch.elizabeth.bus.government

import com.silverhetch.elizabeth.arch.StaticSource
import com.silverhetch.elizabeth.bus.government.utility.StaticBusRouteJsonArray
import org.junit.Assert
import org.junit.Test

class JsonBusesTest {
    @Test
    fun busCount() {
        val buses = JsonBuses(
          StaticSource(StaticBusRouteJsonArray().value())
        ).all()

        Assert.assertEquals(2, buses.size)
    }
}