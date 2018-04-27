package com.silverhetch.elizabeth.sources.weather.government

import com.silverhetch.elizabeth.sources.Source
import com.silverhetch.elizabeth.sources.weather.Weather

class WeatherSource(private val source: Source<String>) : Source<Weather> {
    override fun fetch(): Weather {
        return JsonWeather(source.fetch())
    }
}