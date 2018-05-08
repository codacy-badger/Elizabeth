package com.silverhetch.elizabeth.weather.government

import com.google.gson.JsonArray

class MaxTemperature(private val weather: JsonArray) : Temperature {
    override fun value(): Float {
        (0..(weather.size() - 1)).forEach { i ->
            val element = weather.get(i).asJsonObject
            if ("MaxT" == element.get("elementName").asString) {
                val currentTime = element.getAsJsonArray("time")[0].asJsonObject
                return currentTime.getAsJsonObject("parameter").get("parameterName").asFloat
            }
        }
        throw RuntimeException("Not found")
    }
}