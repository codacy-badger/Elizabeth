package com.silverhetch.elizabeth.sources.weather.government

import com.silverhetch.elizabeth.sources.weather.government.utility.StaticJsonArrayMaxT
import com.silverhetch.elizabeth.sources.weather.government.utility.StaticJsonArrayMinT
import org.junit.Assert
import org.junit.Test

class AverageTemperatureTest {
    @Test
    fun simple() {
        val average = AverageTemperature(
          MaxTemperature(StaticJsonArrayMaxT().value()),
          MinTemperature(StaticJsonArrayMinT().value())
        ).value()

        Assert.assertEquals(29, average)
    }
}