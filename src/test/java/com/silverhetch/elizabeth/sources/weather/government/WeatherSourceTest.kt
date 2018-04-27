package com.silverhetch.elizabeth.sources.weather.government

import com.silverhetch.elizabeth.sources.Source
import org.junit.Assert
import org.junit.Test

class WeatherSourceTest{
    @Test
    fun triggered() {
        var triggered = false
        WeatherSource(object : Source<String> {
            override fun fetch(): String {
                triggered = true
                return ""
            }
        }).fetch()
        Assert.assertTrue(triggered)
    }
}