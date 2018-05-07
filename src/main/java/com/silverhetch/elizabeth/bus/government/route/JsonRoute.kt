package com.silverhetch.elizabeth.bus.government.route

import com.google.gson.JsonObject
import com.silverhetch.elizabeth.bus.Route

class JsonRoute(private val json: JsonObject) : Route {
    override fun name(): String {
        return json.get("RouteName").asJsonObject.get("En").asString
    }
}