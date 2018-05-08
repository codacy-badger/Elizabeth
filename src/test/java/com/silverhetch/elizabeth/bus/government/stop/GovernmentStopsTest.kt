package com.silverhetch.elizabeth.bus.government.stop

import com.silverhetch.elizabeth.configs.BusConfig
import org.junit.Assert
import org.junit.Test

class GovernmentStopsTest {
    @Test
    fun simple() {
        GovernmentStops(BusConfig()).instance().all().let { stops ->
            Assert.assertNotEquals(0, stops.size)
        }
    }
}