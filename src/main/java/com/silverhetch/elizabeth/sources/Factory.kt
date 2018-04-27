package com.silverhetch.elizabeth.sources

import com.silverhetch.elizabeth.sources.weather.Weather

interface Factory<T> {
    fun instance(): T
}