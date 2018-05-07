package com.silverhetch.elizabeth.bus.government.route

import com.google.gson.JsonParser
import com.silverhetch.elizabeth.arch.Source
import com.silverhetch.elizabeth.bus.Route
import com.silverhetch.elizabeth.bus.Routes

class JsonRoutes(private val sources: Source<String>) : Routes {
    override fun all(): Array<Route> {
        val array = JsonParser().parse(sources.fetch()).asJsonArray
        return Array(array.size(), { index ->
            JsonRoute(array.get(index).asJsonObject)
        })
    }
}