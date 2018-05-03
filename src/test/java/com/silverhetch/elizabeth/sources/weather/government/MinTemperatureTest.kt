package com.silverhetch.elizabeth.sources.weather.government

import com.google.gson.JsonArray
import com.google.gson.JsonParser
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class MinTemperatureTest {
    @Test
    fun temperature() {
        val source = JsonParser().parse("[{\"elementName\":\"MinT\",\"time\":[{\"startTime\":\"2018-05-02 12:00:00\",\"endTime\":\"2018-05-02 18:00:00\",\"parameter\":{\"parameterName\":\"29\",\"parameterUnit\":\"C\"}},{\"startTime\":\"2018-05-02 18:00:00\",\"endTime\":\"2018-05-03 06:00:00\",\"parameter\":{\"parameterName\":\"25\",\"parameterUnit\":\"C\"}},{\"startTime\":\"2018-05-03 06:00:00\",\"endTime\":\"2018-05-03 18:00:00\",\"parameter\":{\"parameterName\":\"25\",\"parameterUnit\":\"C\"}}]}]").asJsonArray
        val temperature = MinTemperature(source).value()
        assertEquals(29f, temperature)
    }

    @Test
    fun throwWhenNotFoundElement() {
        try {
            val source = JsonParser().parse("[{\"elementName\":\"MaxT2\",\"time\":[{\"startTime\":\"2018-05-02 12:00:00\",\"endTime\":\"2018-05-02 18:00:00\",\"parameter\":{\"parameterName\":\"29\",\"parameterUnit\":\"C\"}},{\"startTime\":\"2018-05-02 18:00:00\",\"endTime\":\"2018-05-03 06:00:00\",\"parameter\":{\"parameterName\":\"25\",\"parameterUnit\":\"C\"}},{\"startTime\":\"2018-05-03 06:00:00\",\"endTime\":\"2018-05-03 18:00:00\",\"parameter\":{\"parameterName\":\"25\",\"parameterUnit\":\"C\"}}]}]").asJsonArray
            MaxTemperature(source).value()
            fail()
        } catch (e: Exception) {
            assertEquals("Not found", e.message)
        }
    }
}