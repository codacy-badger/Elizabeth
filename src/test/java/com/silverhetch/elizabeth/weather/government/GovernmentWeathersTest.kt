package com.silverhetch.elizabeth.weather.government

import org.junit.Assert
import org.junit.Test

class GovernmentWeathersTest {
    @Test
    fun cityNumber() {
        val weathers = GovernmentWeathers().instance()
        Assert.assertEquals(22, weathers.all().size)
    }
}