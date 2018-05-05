package com.silverhetch.elizabeth

import com.silverhetch.elizabeth.weather.government.WeatherGovernment

class WeatherUpdate : Runnable {
    override fun run() {
        System.out.println("Weathers ==========")
        WeatherGovernment().instance().all().forEach {
            System.out.println(it.locationName() + " " + it.celsius())
        }
        System.out.println("==========")
    }
}