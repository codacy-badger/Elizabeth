package com.silverhetch.elizabeth.bus.government.stop

import com.silverhetch.elizabeth.bus.government.stop.utility.StaticStopJsonObject
import org.junit.Assert
import org.junit.Test

class JsonStopTest {
    @Test
    fun name() {
        JsonStop(StaticStopJsonObject().fetch()).name().let { actual ->
            Assert.assertEquals("Luzhou Bus Terminal", actual)
        }
    }
}