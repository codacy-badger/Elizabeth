package com.silverhetch.elizabeth.bus.government.route

import com.silverhetch.elizabeth.arch.StaticSource
import com.silverhetch.elizabeth.bus.government.route.utility.StaticBusRouteJsonArray
import org.junit.Assert
import org.junit.Test

class JsonRoutesTest {
    @Test
    fun busCount() {
        val buses = JsonRoutes(
            StaticSource(StaticBusRouteJsonArray().value())
        ).all()

        Assert.assertEquals(2, buses.size)
    }
}