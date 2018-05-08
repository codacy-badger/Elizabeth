package com.silverhetch.elizabeth.bus.government.stop

import com.silverhetch.elizabeth.arch.StringSource
import org.junit.Assert
import org.junit.Test

class JsonStopsTest {
    @Test
    fun size() {
        JsonStops(StringSource("[{},{}]")).all().let { stops ->
            Assert.assertEquals(2, stops.size)
        }
    }
}