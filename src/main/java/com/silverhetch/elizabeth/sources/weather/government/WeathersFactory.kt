package com.silverhetch.elizabeth.sources.weather.government

import com.silverhetch.clotho.connection.Get
import com.silverhetch.clotho.connection.TargetImpl
import com.silverhetch.elizabeth.sources.Factory
import com.silverhetch.elizabeth.sources.weather.StringSource
import com.silverhetch.elizabeth.sources.weather.Weathers
import sun.security.ssl.SSLSocketFactoryImpl

internal class WeathersFactory(private val config: Config) : Factory<Weathers> {
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
        return url + config.weatherAuthKey()
    }
}