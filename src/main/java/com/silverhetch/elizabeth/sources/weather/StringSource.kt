package com.silverhetch.elizabeth.sources.weather

import com.silverhetch.clotho.connection.WebApi
import com.silverhetch.elizabeth.sources.Source

class StringSource(private val api: WebApi) : Source<String> {
    override fun fetch(): String {
        return String(api.request().bodyBytes)
    }
}