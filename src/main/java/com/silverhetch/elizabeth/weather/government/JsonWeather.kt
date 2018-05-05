package com.silverhetch.elizabeth.weather.government

import com.google.gson.JsonObject
import com.silverhetch.elizabeth.weather.Weather

class JsonWeather(private val city: JsonObject) : Weather {
    override fun locationName(): String {
        return city.get("locationName").asString
    }

    override fun celsius(): Float {
        val json = city.getAsJsonArray("weatherElement")
        return AverageTemperature(
          MinTemperature(json),
          MaxTemperature(json)
        ).value()
    }
}