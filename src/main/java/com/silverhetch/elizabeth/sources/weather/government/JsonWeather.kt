package com.silverhetch.elizabeth.sources.weather.government

import com.google.gson.JsonObject
import com.silverhetch.elizabeth.sources.weather.Weather

internal class JsonWeather(private val json: JsonObject) : Weather {

}