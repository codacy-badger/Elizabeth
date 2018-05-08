package com.silverhetch.elizabeth.bus.government.stop

import com.google.gson.JsonParser
import com.silverhetch.elizabeth.arch.Source
import com.silverhetch.elizabeth.bus.Stop
import com.silverhetch.elizabeth.bus.Stops

class JsonStops(private val sources: Source<String>) : Stops {
    override fun all(): Array<Stop> {
        val array = JsonParser().parse(sources.fetch()).asJsonArray
        return Array(array.size(), { index ->
            JsonStop(array.get(index).asJsonObject)
        })
    }
}