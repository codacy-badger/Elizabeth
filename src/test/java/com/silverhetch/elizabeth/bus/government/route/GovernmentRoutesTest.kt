package com.silverhetch.elizabeth.bus.government.route

import com.silverhetch.elizabeth.configs.BusConfig
import org.junit.Assert
import org.junit.Test

class GovernmentRoutesTest {
    @Test
    fun integrate_size() {
        val buses = GovernmentRoutes(BusConfig()).instance().all()
        Assert.assertNotEquals(0, buses.size)
    }
}