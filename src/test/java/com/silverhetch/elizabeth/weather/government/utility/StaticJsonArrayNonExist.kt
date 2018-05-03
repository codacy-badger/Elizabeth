package com.silverhetch.elizabeth.weather.government.utility

import com.google.gson.JsonArray
import com.google.gson.JsonParser

class StaticJsonArrayNonExist {
    fun value(): JsonArray {
        return JsonParser().parse("[{\"elementName\":\"MaxT2\",\"time\":[{\"startTime\":\"2018-05-02 12:00:00\",\"endTime\":\"2018-05-02 18:00:00\",\"parameter\":{\"parameterName\":\"29\",\"parameterUnit\":\"C\"}},{\"startTime\":\"2018-05-02 18:00:00\",\"endTime\":\"2018-05-03 06:00:00\",\"parameter\":{\"parameterName\":\"25\",\"parameterUnit\":\"C\"}},{\"startTime\":\"2018-05-03 06:00:00\",\"endTime\":\"2018-05-03 18:00:00\",\"parameter\":{\"parameterName\":\"25\",\"parameterUnit\":\"C\"}}]}]").asJsonArray
    }
}