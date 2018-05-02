package com.silverhetch.elizabeth.sources.weather.government

import com.silverhetch.elizabeth.configs.WeatherConfig
import org.junit.Assert
import org.junit.Test

class WeathersFactoryTest {
    @Test
    fun fetchSuccess() {
        val weathers = WeathersFactory(WeatherConfig()).instance()
        Assert.assertNotNull(weathers)
    }
}