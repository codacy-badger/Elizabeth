package com.silverhetch.elizabeth.bus.government.route

import com.silverhetch.elizabeth.arch.Pipeline
import com.silverhetch.elizabeth.bus.government.Config

class AuthString(private val config: Config, private val signature: Pipeline<String>) : Pipeline<String> {
    override fun compute(): String {
        return "hmac username=\"${config.appId()}\", algorithm=\"hmac-sha1\", headers=\"x-date\", signature=\"${signature.compute()}\""
    }
}