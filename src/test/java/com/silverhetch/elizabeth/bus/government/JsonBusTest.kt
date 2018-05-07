package com.silverhetch.elizabeth.bus.government

import com.google.gson.JsonParser
import com.silverhetch.elizabeth.bus.government.utility.StaticBusRouteJson
import org.junit.Assert
import org.junit.Test

class JsonBusTest {
    @Test
    fun name() {
        val name = JsonBus(
            JsonParser().parse(StaticBusRouteJson().value()).asJsonObject
        ).name()

        Assert.assertEquals("234", name)
    }
}