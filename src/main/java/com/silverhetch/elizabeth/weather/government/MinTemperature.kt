package com.silverhetch.elizabeth.weather.government

import com.google.gson.JsonArray

class MinTemperature(private val weather: JsonArray) : Temperature {
    override fun value(): Float {
        for (i in 0..(weather.size() - 1)) {
            val element = weather.get(i).asJsonObject
            if ("MinT" == element.get("elementName").asString) {
                val currentTime = element.getAsJsonArray("time")[0].asJsonObject
                return currentTime.getAsJsonObject("parameter").get("parameterName").asFloat
            }
        }
        throw RuntimeException("Not found")
    }
}