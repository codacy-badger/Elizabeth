package com.silverhetch.elizabeth.bus.government

import com.silverhetch.elizabeth.arch.Pipeline

class AuthString(private val config: Config, private val signature: Pipeline<String>) : Pipeline<String> {
    override fun compute(): String {
        return "hmac username=\"${config.appId()}\", algorithm=\"hmac-sha1\", headers=\"x-date\", signature=\"${signature.compute()}\""
    }
}