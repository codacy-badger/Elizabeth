package com.silverhetch.elizabeth.weather.government

import org.junit.Assert
import org.junit.Test

class WeatherGovernmentTest {
    @Test
    fun cityNumber() {
        val weathers = WeatherGovernment().instance()
        Assert.assertEquals(22, weathers.all().size)
    }
}