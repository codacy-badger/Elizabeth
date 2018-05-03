package com.silverhetch.elizabeth.weather.government

class AverageTemperature(private vararg val temperatures: Temperature) : Temperature {
    override fun value(): Float {
        val floatArray = FloatArray(temperatures.size, {
            temperatures[it].value()
        })
        return floatArray.average().toFloat()
    }
}