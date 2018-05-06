package com.silverhetch.elizabeth.arch

import com.silverhetch.clotho.connection.WebApi
import com.silverhetch.elizabeth.arch.Source

class HttpSource(private val api: WebApi) : Source<String> {
    override fun fetch(): String {
        return String(api.request().bodyBytes)
    }
}