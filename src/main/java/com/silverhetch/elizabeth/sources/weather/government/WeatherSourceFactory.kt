package com.silverhetch.elizabeth.sources.weather.government

import com.silverhetch.clotho.connection.Get
import com.silverhetch.clotho.connection.TargetImpl
import com.silverhetch.elizabeth.sources.Factory
import com.silverhetch.elizabeth.sources.weather.StringSource

class WeatherSourceFactory(private val config: Config) : Factory<WeatherSource> {
    override fun instance(): WeatherSource {
        return WeatherSource(
          StringSource(
            Get(
              TargetImpl(url())
            )
          )
        )
    }

    private fun url(): String {
        val url = "https://opendata.cwb.gov.tw/api/v1/rest/datastore/F-C0032-001?Authorization="
        return url + config.weatherAuthKey()
    }
}