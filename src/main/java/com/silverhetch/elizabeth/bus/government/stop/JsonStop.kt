package com.silverhetch.elizabeth.bus.government.stop

import com.google.gson.JsonObject
import com.silverhetch.elizabeth.bus.Stop

class JsonStop(private val jsonObject: JsonObject) : Stop {
    override fun name(): String {
        return jsonObject.get("StopName").asJsonObject.get("En").asString
    }
}