package com.silverhetch.elizabeth.weather.government

import com.silverhetch.elizabeth.weather.government.utility.StaticJsonArrayMaxT
import com.silverhetch.elizabeth.weather.government.utility.StaticJsonArrayNonExist
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test

class MaxTemperatureTest {

    @Test
    fun temperature() {
        val temperature = MaxTemperature(StaticJsonArrayMaxT().value()).value()
        assertEquals(29f, temperature)
    }


    @Test
    fun throwWhenNotFoundElement() {
        try {
            MaxTemperature(StaticJsonArrayNonExist().value()).value()
            fail()
        } catch (e: Exception) {
            assertEquals("Not found", e.message)
        }
    }
}