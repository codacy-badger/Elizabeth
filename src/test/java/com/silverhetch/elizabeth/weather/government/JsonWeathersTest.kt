package com.silverhetch.elizabeth.weather.government

import com.silverhetch.elizabeth.weather.government.utility.StaticJsonWeather
import org.junit.Assert.*
import org.junit.Test

class JsonWeathersTest {
    @Test
    fun locationName() {
        assertEquals("嘉義縣", JsonWeather(StaticJsonWeather().value()).locationName())
    }

    @Test
    fun temperature() {
        assertEquals(24F, JsonWeather(StaticJsonWeather().value()).celsius())
    }
}