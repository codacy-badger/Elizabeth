package com.silverhetch.elizabeth.weather.government

import com.silverhetch.clotho.connection.Get
import com.silverhetch.clotho.connection.TargetImpl
import com.silverhetch.elizabeth.arch.Factory
import com.silverhetch.elizabeth.configs.WeatherConfig
import com.silverhetch.elizabeth.weather.StringSource
import com.silverhetch.elizabeth.weather.Weathers
import sun.security.ssl.SSLSocketFactoryImpl

class WeatherGovernment() : Factory<Weathers> {
    override fun instance(): Weathers {
        return JsonWeathers(
          StringSource(
            Get(
              TargetImpl(url(), SSLSocketFactoryImpl())
            )
          )
        )
    }

    private fun url(): String {
        val url = "https://opendata.cwb.gov.tw/api/v1/rest/datastore/F-C0032-001?Authorization="
        return url + WeatherConfig().weatherAuthKey()
    }
}