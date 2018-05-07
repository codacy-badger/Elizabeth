package com.silverhetch.elizabeth.bus.government.route

import com.silverhetch.elizabeth.arch.Source
import java.text.SimpleDateFormat
import java.util.*


class Timestamp : Source<String> {
    override fun fetch(): String {
        val calendar = Calendar.getInstance()
        val dateFormat = SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z")
        dateFormat.timeZone = TimeZone.getTimeZone("GMT")
        return dateFormat.format(calendar.time)
    }
}