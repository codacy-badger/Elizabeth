package com.silverhetch.elizabeth.bus.government

import com.silverhetch.elizabeth.configs.BusConfig
import org.junit.Assert
import org.junit.Test

class GovernmentBusesTest {
    @Test
    fun integrate_size() {
        val buses = GovernmentBuses(BusConfig()).instance().all()
        Assert.assertNotEquals(0, buses.size)
    }
}