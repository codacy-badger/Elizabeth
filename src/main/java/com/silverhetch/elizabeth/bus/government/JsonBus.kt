package com.silverhetch.elizabeth.bus.government

import com.google.gson.JsonObject

class JsonBus(private val json: JsonObject) : Bus {
    override fun name(): String {
        return json.get("RouteName").asJsonObject.get("En").asString
    }
}