package com.silverhetch.elizabeth.bus.government.stop.utility

import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.silverhetch.elizabeth.arch.Source


class StaticStopJsonObject : Source<JsonObject> {
    override fun fetch(): JsonObject {
        return JsonParser().parse("{\"StopUID\":\"TPE10000\",\"StopID\":\"10000\",\"AuthorityID\":\"004\",\"StopName\":{\"Zh_tw\":\"蘆洲總站\",\"En\":\"Luzhou Bus Terminal\"},\"StopPosition\":{\"PositionLat\":25.089107513427734,\"PositionLon\":121.4658432006836},\"StopAddress\":\"NNN\",\"Bearing\":\"S\",\"StationID\":\"3698\",\"City\":\"Taipei\",\"CityCode\":\"TPE\",\"LocationCityCode\":\"NWT\",\"UpdateTime\":\"2018-05-07T20:11:57+08:00\",\"VersionID\":243}").asJsonObject
    }
}