package com.silverhetch.elizabeth.bus.government

import com.silverhetch.elizabeth.arch.Pipeline
import com.silverhetch.elizabeth.arch.connection.Headers
import com.silverhetch.elizabeth.arch.encryption.Base64Encode
import com.silverhetch.elizabeth.arch.encryption.HmacSHA1


class GovAuthHeaders(private val config: Config, private val timestamp: Pipeline<String>) : Headers {
    override fun values(): Map<String, String> {
        timestamp.compute().let { timestamp ->
            return hashMapOf(
                "Accept" to "application/json",
                "x-date" to timestamp,
                "Authorization" to AuthString(
                    config,
                    Base64Encode(HmacSHA1(XDateString(timestamp), config.appKey()))
                ).compute()
            )
        }
    }

}