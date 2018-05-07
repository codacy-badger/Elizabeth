package com.silverhetch.elizabeth.bus.government.route

import com.silverhetch.elizabeth.arch.Pipeline

class XDateString(private val date: String) : Pipeline<String> {
    override fun compute(): String {
        return "x-date: $date"
    }
}