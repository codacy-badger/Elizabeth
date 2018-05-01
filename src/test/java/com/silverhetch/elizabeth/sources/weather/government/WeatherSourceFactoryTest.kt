package com.silverhetch.elizabeth.sources.weather.government

import com.silverhetch.elizabeth.configs.WeatherConfig
import com.silverhetch.elizabeth.sources.weather.Weather
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class WeatherSourceFactoryTest {
    @Test
    fun fetchSuccess() {
        val weather = WeatherSourceFactory(WeatherConfig()).instance().fetch()
        Assert.assertNotNull(weather)
    }
}