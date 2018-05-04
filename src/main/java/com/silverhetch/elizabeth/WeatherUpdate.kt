package com.silverhetch.elizabeth

import com.silverhetch.elizabeth.configs.WeatherConfig
import com.silverhetch.elizabeth.weather.government.WeathersFactory

class WeatherUpdate : Runnable {
    override fun run() {
        System.out.println("Weathers ==========")
        WeathersFactory().instance().all().forEach {
            System.out.println(it.locationName() + " " + it.celsius())
        }
        System.out.println("==========")
    }
}