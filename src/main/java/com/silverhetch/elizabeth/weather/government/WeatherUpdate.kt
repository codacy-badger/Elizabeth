package com.silverhetch.elizabeth.weather.government

class WeatherUpdate : Runnable {
    override fun run() {
        System.out.println("Weathers ==========")
        GovernmentWeathers().instance().all().forEach {
            System.out.println(it.locationName() + " " + it.celsius())
        }
        System.out.println("==========")
    }
}