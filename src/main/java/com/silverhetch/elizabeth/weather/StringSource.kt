package com.silverhetch.elizabeth.weather

import com.silverhetch.clotho.connection.WebApi
import com.silverhetch.elizabeth.arch.Source

class StringSource(private val api: WebApi) : Source<String> {
    override fun fetch(): String {
        return String(api.request().bodyBytes)
    }
}