package com.silverhetch.elizabeth.bus.government.route

import com.google.gson.JsonParser
import com.silverhetch.elizabeth.bus.government.route.utility.StaticBusRouteJson
import org.junit.Assert
import org.junit.Test

class JsonRouteTest {
    @Test
    fun name() {
        val name = JsonRoute(
            JsonParser().parse(StaticBusRouteJson().value()).asJsonObject
        ).name()

        Assert.assertEquals("234", name)
    }
}