package com.silverhetch.elizabeth.bus.government

import com.google.gson.JsonParser
import com.silverhetch.elizabeth.arch.Source

class JsonBuses(private val sources: Source<String>) : Buses {
    override fun all(): Array<Bus> {
        val array = JsonParser().parse(sources.fetch()).asJsonArray
        return Array(array.size(), { index ->
            JsonBus(array.get(index).asJsonObject)
        })
    }
}