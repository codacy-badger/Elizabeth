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

    @Test
    fun location() {
        val weathers = WeathersFactory(WeatherConfig()).instance()
        for (weather in weathers.all()) {
            System.out.println(weather.locationName())
        }
    }
}