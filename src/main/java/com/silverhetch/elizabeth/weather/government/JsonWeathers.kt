package com.silverhetch.elizabeth.weather.government

import com.google.gson.JsonParser
import com.silverhetch.elizabeth.arch.Source
import com.silverhetch.elizabeth.weather.Weather
import com.silverhetch.elizabeth.weather.Weathers

class JsonWeathers(private val source: Source<String>) : Weathers {
    override fun all(): Array<Weather> {
        val json = JsonParser().parse(source.fetch()).asJsonObject
        val records = json.getAsJsonObject("records")
        val locations = records.getAsJsonArray("location")
        return Array(locations.size(), { index ->
            JsonWeather(locations.get(index).asJsonObject)
        })
    }
}